import org.testng.annotations.Test;

import groovy.util.logging.Log;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Test02_GET {
	
	@Test
	public void test_02() {
		given().
		       header("Content-Type", "application/json").
		       //param(arg0, arg1)
		       get("https://reqres.in/api/users?page=2").
		       then().
		       statusCode(200).
		       body("data.id[1]", equalTo(8)).
		       body("data.first_name", hasItems("Michael","Lindsay"));
		       
		
	}

}
