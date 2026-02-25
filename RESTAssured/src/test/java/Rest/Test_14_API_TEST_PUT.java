package Rest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_14_API_TEST_PUT {
	
	@Test
	public void put() {
		
	    given()
	    
	        .header("Content-Type", "application/json")
	        
	        .body("{\n" +
	              "  \"title\": \"Updated Product\",\n" +
	              "  \"price\": 1200\n" +
	              "}")
	        
	    .when()
	    
	        .put("https://dummyjson.com/products/3")
	        
	    .then()
	    
	    .log().all()
	    
	        .statusCode(200)
	        .body("id", equalTo(3))
	        .body("title", equalTo("Updated Product"))
	        .body("price", equalTo(1200));

	}

}