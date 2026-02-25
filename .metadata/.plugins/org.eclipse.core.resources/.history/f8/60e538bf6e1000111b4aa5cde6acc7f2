package Rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_11_API_TEST {
	
	 @Test
	    public void get() {

//	     

	        given()
	        
	        .log().all()
	        
	        .when().get("https://dummyjson.com/products/2")
	        .then()
	        
	        .log().all()
	 
	        .statusCode(200)
	        .body("id", equalTo(2));
	        
	    }
}