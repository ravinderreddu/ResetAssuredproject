import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Examples {

   /*	@Test
public void test_get()
	{
		
	  baseURI="http://localhost:3000";
     given().
     param("name","Automation").
    get("/subjects")
    then().
      statusCode(201).
       log().all();  */
	/*@Test
	public void test_post()
	{
	JSONObject request= new JSONObject();
	request.put("firstName","Toom");
	request.put("lastName","valuew");
	request.put("subjectId", 1);
	  baseURI="http://localhost:3000";

	given().
	header("Content-Type", "application/json").
	 contentType(ContentType.JSON).
	 body(request.toJSONString()).
	 when().
	 post("/users").
	then().
	  statusCode(200).
	log().all();*/
	
	/*@Test
	public void test_patch()
	{
	JSONObject request= new JSONObject();
	request.put("firstName","Toom");
	request.put("lastName","sri");
	request.put("subjectId", 1);
	  baseURI="http://localhost:3000";

	given().
	header("Content-Type", "application/json").
	contentType(ContentType.JSON).
	body(request.toJSONString()).
	when().
	patch("/users/4").
	then().
	  statusCode(404).
	log().all();*/
	
	
	//@Test
	//public void test_put()
  	//{
	//JSONObject request= new JSONObject();
	//request.put("firstName","Tomato");
	// request.put("lastName","values");
	//request.put("subjectId", 1);
	  //baseURI="http://localhost:3000";

	//given().
	//header("Content-Type", "application/json").
	//contentType(ContentType.JSON).
	//body(request.toJSONString()).
	//when().
	//put("/users/3").
	//then().
	 // statusCode(200).
	//log().all();
	@Test
	public void test_delete()
	{

		 baseURI="http://localhost:3000";
		 when(). 
		 delete("users/4").
		 then().
		  statusCode(200);

	
	
	}
	
	
}
