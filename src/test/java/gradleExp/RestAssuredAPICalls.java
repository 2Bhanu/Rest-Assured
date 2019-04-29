package gradleExp;

import io.restassured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class RestAssuredAPICalls {

	public static void main(String[] args) {
		RequestSpecification rsp = RestAssured.given();
		RestAssured rsa = new RestAssured();
		
		rsp.baseUri("http://localhost:3000");
		rsp.basePath("/posts");
		//rsp.contentType("application/json");
		rsp.body("{\"ef\":\"gh\"}");
		Response rs = rsp.post();
		//rsp.get().then().assertThat()
		String value = rs.jsonPath().getString("ef");
		rs.then().body("a.b", equalTo(""));
		System.out.println(value + " " 
		//+ rs.asString()
		);

	}

}
