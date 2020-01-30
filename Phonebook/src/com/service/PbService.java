package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.PUT;
import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.xml.ws.spi.http.HttpContext;

import com.model.Person;



@Path("/pbservice")
public class PbService {
	List<Person> persons = new ArrayList<Person>();

	@GET //Which method of HTTP (GET,POST,PUT,DELETE)
	@Produces("application/json") //How will the data be REspresented?(xml or Json)
	public List<Person> phoneBookHolder( @Context HttpServletResponse response){
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		//response.setHeader("Access-Control-Allow-Methods", "GET,POST");
		 //HttpContext.Current.Response.AddHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		 //   HttpContext.Current.Response.AddHeader("Access-Control-Allow-Methods", "GET,POST");
		
		
		
		Person person = new Person();
		person.setFirstName("Harshal");
		person.setLastName("Kose");
		person.setMobileNumber(9823749);
		
		persons.add(person);
		
		 person = new Person();
		person.setFirstName("Rushikesh");
		person.setLastName("naik");
		person.setMobileNumber(9823749);
		
		persons.add(person);
		
		 person = new Person();
		person.setFirstName("Rudra");
		person.setLastName("Nagthane");
		person.setMobileNumber(9823749);
		
		persons.add(person);
		
		
		return persons;	
	}
	
	  @PUT //Which method of HTTP (GET,POST,PUT,DELETE)
	  @Path("/name")
	   //How will the data be REspresented?(xml orJson) 
	  public void phoneBookHolder( @QueryParam("firstName") String firstName,@QueryParam("lastName") String lastName,@QueryParam("mobileNumber") long mobileNumber,@Context HttpServletResponse response){
	  
	  response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
	  Person person = new Person(); person.setFirstName(firstName);
	  person.setLastName(lastName); person.setMobileNumber(mobileNumber);
	  
	  persons.add(person);
	  
	  }
	 
}
