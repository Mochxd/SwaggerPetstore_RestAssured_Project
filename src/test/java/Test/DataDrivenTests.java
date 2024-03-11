package Test;

import EndPoints.UserEndPointsCRUD;
import PayLoad.User;
import Utilities.DataProviders;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DataDrivenTests {
    private UserEndPointsCRUD userPointCRUD = new UserEndPointsCRUD();
    private User userPlayLoad = new User();

    @Test(priority = 1, dataProvider = "Data", dataProviderClass = DataProviders.class)
    public void testAddUserWithExternalData(String ID, String userName, String fName, String lName,  String email, String password, String phone) {
        userPlayLoad.setId(Integer.parseInt(ID));
        userPlayLoad.setUsername(userName);
        userPlayLoad.setFirstName(fName);
        userPlayLoad.setLastName(lName);
        userPlayLoad.setEmail(email);
        userPlayLoad.setPassword(password);
        userPlayLoad.setPhone(phone);
        Response response = userPointCRUD.createUser(userPlayLoad);
        response.then().log().all();
        assertEquals(response.getStatusCode(),200);
    }
    @Test(priority = 2, dataProvider = "UserNames", dataProviderClass = DataProviders.class)
    public void testDeleteUsers(String userName) {
        Response response = userPointCRUD.deleteUser(userName);
        response.then().log().all();
        assertEquals(response.getStatusCode(),200);
    }
}

