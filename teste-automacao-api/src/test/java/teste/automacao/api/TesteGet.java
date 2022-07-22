package teste.automacao.api;

import static org.junit.Assert.assertEquals;

import java.net.URI;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class TesteGet {

	Response response = RestAssured.get("https://reqres.in/api/users?page=2");

	@Test
	public void testGet() {
		assertEquals(200, response.getStatusCode());

	}


	
	
	}


