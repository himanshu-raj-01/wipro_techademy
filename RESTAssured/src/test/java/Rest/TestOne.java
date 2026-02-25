package Rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestOne {
	
	@Test
	public void test1() {
		
		Response response = RestAssured
				.given()
				.header("x-api-key", "reqres_8f3469576e7046fe91e506da9e0f6200")
				.when()
				.get("https://reqres.in/api/users?page=2");
		
		System.out.println("Status Code: " + response.getStatusCode());
		System.out.println("Response Time: " + response.getTime());
		System.out.println("Response Body: " + response.getBody().asString());
	}
}