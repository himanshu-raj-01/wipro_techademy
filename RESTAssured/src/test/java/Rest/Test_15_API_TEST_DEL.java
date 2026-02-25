package Rest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test_15_API_TEST_DEL {
	
	@Test
	public void deleteProductTest() {

	    given()
	    .when()
	        .delete("https://dummyjson.com/products/2")
	    .then()
	    
	    .log().body()
	    
	        .statusCode(200)
	        .body("id", equalTo(2))
	        .body("isDeleted", equalTo(true));

	}

}