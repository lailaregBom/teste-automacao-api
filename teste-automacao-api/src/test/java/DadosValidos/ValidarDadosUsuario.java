package DadosValidos;

import java.net.URI;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class ValidarDadosUsuario {

	public void DadosValidos() {
		
		given();
		when();
		RestAssured
		.get("https://reqres.in/img/faces/12-image.jpg")
		.then()
		
		.body("data[5].id", is(12))
		.body("data[5].email",is("rachel.howell@reqres.in"))
		.body("data[5].firt_name", is("Rachel"))
		.body("data[5].last_name", is("Howell"))
		.body("data[5].avatar", is("https://reqres.in/img/faces/12-image.jpg"));
		
	
		
	}

	private ResponseAwareMatcher<Response> is(int i) {
		
		return null;
	}

	private ResponseAwareMatcher<Response> is(String string) {
		
		return null;
	}

	private void when() {
		
		
	}

	private void given() {
		
		
	}

}
