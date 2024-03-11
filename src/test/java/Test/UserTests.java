package Test;

import EndPoints.UserEndPointsCRUD;
import PayLoad.User;
import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UserTests {
    private Faker faker;
    private User userPlayLoad;
    private UserEndPointsCRUD userPointCRUD = new UserEndPointsCRUD();
    @BeforeClass
    public void createDataForBody(){
        faker = new Faker();
        userPlayLoad = new User();
        userPlayLoad.setId(faker.idNumber().hashCode());
        userPlayLoad.setUsername(faker.name().username());
        userPlayLoad.setFirstName(faker.name().firstName());
        userPlayLoad.setLastName(faker.name().lastName());
        userPlayLoad.setEmail(faker.internet().emailAddress());
        userPlayLoad.setPassword(faker.internet().password(5,10));
        userPlayLoad.setPhone(faker.phoneNumber().cellPhone());
    }
    @Test(priority = 1)
    public void testCreateUser(){
        Response response = userPointCRUD.createUser(userPlayLoad);
        response.then().log().all();
        assertEquals(response.getStatusCode(),200);
    }
    @Test(priority = 2,dependsOnMethods = "testCreateUser")
    public void testGetUser(){
        Response response = userPointCRUD.ReadUser(userPlayLoad.getUsername());
        response.then().log().all();
        assertEquals(response.getStatusCode(),200);
    }
    @Test(priority = 3)
    public void testUpdateUser(){
        userPlayLoad.setFirstName(faker.name().firstName());
        userPlayLoad.setLastName(faker.name().lastName());
        userPlayLoad.setEmail(faker.internet().emailAddress());
        Response response = userPointCRUD.updateUser(userPlayLoad.getUsername(),userPlayLoad);
        response.then().log().body();
        assertEquals(response.getStatusCode(),200);

        //check the data after updated
        Response UpdateResponse = userPointCRUD.ReadUser(userPlayLoad.getUsername());
        assertEquals(UpdateResponse.getStatusCode(),200);
    }
    @Test(priority = 4)
    public void testDeleteUser(){
        Response response = userPointCRUD.deleteUser(userPlayLoad.getUsername());
        response.then().log().all();
        assertEquals(response.getStatusCode(),200);
    }
}
