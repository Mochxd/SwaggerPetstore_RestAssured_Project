package EndPoints;

import PayLoad.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class UserEndPointsCRUD {
    public Response createUser(User payLoad){
        Response response = given()
                                .contentType(ContentType.JSON)
                                .accept(ContentType.JSON)
                                .body(payLoad)
                            .when()
                                .post(Urls.postUrl);
        return response;
    }
    public Response ReadUser(String userName){
        Response response = given()
                                .pathParam("username", userName)
                            .when()
                                .get(Urls.getUrl);
        return response;
    }
    public Response updateUser(String userName,User payLoad){
        Response response = given()
                                .contentType(ContentType.JSON)
                                .accept(ContentType.JSON)
                                .pathParam("username", userName)
                                .body(payLoad)
                            .when()
                                .put(Urls.updateUrl);
        return response;
    }
    public Response deleteUser(String userName){
        Response response = given()
                                .pathParam("username", userName)
                            .when()
                                .delete(Urls.deleteUrl);
        return response;
    }
}
