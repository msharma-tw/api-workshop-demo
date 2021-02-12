package apitests;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

public class SampleTest {

    @Test
    public void fetchProfileDetailsTest() {

        Response response = given().when().get("https://api.github.com/users/" + "octocat");
        assertEquals(response.statusCode(), 200);
        assertEquals(response.jsonPath().getString("login"), "octocat");
    }

    @Test
    public void emailVisibilityTest() {

        //update your github personal access token here
        String githubToken = "personalaccesstoken";
        String emailId = "testuser@gmail.com";
        String accessToken = "token " + githubToken;

        JSONObject userObject = new JSONObject();
        userObject.put("email", emailId);
        userObject.put("visibility", "public");

        given()
                .header("Authorization", accessToken)
                .body(userObject.toJSONString())
                .when().patch("https://api.github.com/user/email/visibility")
                .then().statusCode(200);
    }


}
