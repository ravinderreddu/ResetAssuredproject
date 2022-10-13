import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;

//import groovy.util.logging.Log;

public class Test_Post {

	//@Test
	// public void test_2_post() {
		
		 // JSONObject request= new JSONObject();
		// given().
		// body(request.toJSONString()).
		 // when().
		// post("https://reqres.in/api/users").
		//  then().
		 // statusCode(201);//
	


	
	
	

		//@Test
		//public void test_2_put() {
			
			//JSONObject request= new JSONObject();
			//given().
			 //header("Content-Type", "application/json").
			// contentType(ContentType.JSON).
			//body(request.toJSONString()).
			// when().
			//put("https://reqres.in/api/users/2").
			//path(arg0, arg1)
			//then().
			  //statusCode(200).
			//log().all();
		//}
		
		
		//@Test
//		public void test_3_patch() {
			
			//JSONObject request= new JSONObject();
			//given().
			//header("Content-Type", "application/json").
			//contentType(ContentType.JSON).
			//body(request.toJSONString()).
			//when().
			//patch("https://reqres.in/api/users/2").
			//then().
			 // statusCode(200).
			//log().all();
		//}


@Test
public void test_4_Delete() {
	
	JSONObject request= new JSONObject();
	given().
	header("Content-Type", "application/json").
	contentType(ContentType.JSON).
	body(request.toJSONString()).
	when().
	delete("https://reqres.in/api/users/2").
	then().
	  statusCode(204).
	log().all();
}
}
			

			
