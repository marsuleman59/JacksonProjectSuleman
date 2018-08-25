package com.jacksonproject.programs.JacksonProject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.jackson.pojos.Address;
import com.jackson.pojos.Employee;
import com.jackson.pojos.Salary;

/**
 * @author Suleman
 */
public class JacksonApp {
	public static String path = "c:\\windows\\temp\\jacksonObject.json";

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		createEmployee();
		// Comment any one of the method for you to check the working of code
		serialize();
		deSerialize();

	}

	private static void deSerialize() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Check");

		ObjectMapper mapper = new ObjectMapper();
		Employee employee = mapper.readValue(new File(path), Employee.class);
		System.out.println(employee);

	}

	static Employee employee;

	private static void createEmployee() {
		List<Address> addresses = new ArrayList<Address>();
		Address address = new Address("1019Cavelry", "Tampa", "10101");
		addresses.add(address);

		Salary salary = new Salary(494394.33, 4744.44, 48484.33);
		List<String> cities = new ArrayList<String>();
		cities.add("Naperville");
		cities.add("Chicago");

		employee = new Employee(101, "Suleman", true, salary, "11/11/1111", addresses, new long[] { 123456, 987654 },
				"Manager", cities);

	}

	private static void serialize() throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		mapper.writeValue(System.out, employee);
		mapper.writeValue(new File(path), employee);
		System.out.println("Data added to the ");
	}

}