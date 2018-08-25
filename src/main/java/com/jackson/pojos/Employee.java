/**
 * 
 */
package com.jackson.pojos;

import java.util.Arrays;

/**
 * @author Suleman
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.ToString;
@ToString

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "permanent", "salary", "dateOfBirth", "addresses", "phoneNumbers", "role",
		"cities" })


public class Employee {

	/**
	 * 
	 */
	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", permanent=" + permanent + ", salary=" + salary
				+ ", dateOfBirth=" + dateOfBirth + ", addresses=" + addresses + ", phoneNumbers="
				+ Arrays.toString(phoneNumbers) + ", role=" + role + ", cities=" + cities + "]";
	}

	/**
	 * @param id
	 * @param name
	 * @param permanent
	 * @param salary
	 * @param dateOfBirth
	 * @param addresses
	 * @param ls
	 * @param role
	 * @param cities
	 */
	public Employee(Integer id, String name, Boolean permanent, Salary salary, String dateOfBirth,
			List<Address> addresses, long[] ls, String role, List<String> cities) {
		super();
		this.id = id;
		this.name = name;
		this.permanent = permanent;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
		this.addresses = addresses;
		this.phoneNumbers = ls;
		this.role = role;
		this.cities = cities;
	}

	private Integer id;
	private String name;
	private Boolean permanent;
	private Salary salary;
	@JsonIgnore
	private String dateOfBirth;
	private List<Address> addresses = null;
	@JsonProperty("phoneNumbers")
	private long[] phoneNumbers = null;
	private String role;
	@JsonProperty("cities")
	private List<String> cities = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("permanent")
	public Boolean getPermanent() {
		return permanent;
	}

	@JsonProperty("permanent")
	public void setPermanent(Boolean permanent) {
		this.permanent = permanent;
	}

	@JsonProperty("salary")
	public Salary getSalary() {
		return salary;
	}

	@JsonProperty("salary")
	public void setSalary(Salary salary) {
		this.salary = salary;
	}

	@JsonProperty("dateOfBirth")
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	@JsonProperty("dateOfBirth")
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@JsonProperty("addresses")
	public List<Address> getAddresses() {
		return addresses;
	}

	@JsonProperty("addresses")
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@JsonProperty("phoneNumbers")
	public long[] getPhoneNumbers() {
		return phoneNumbers;
	}

//	@JsonProperty("phoneNumbers")
//	public void setPhoneNumbers(Long[] phoneNumbers) {
//		this.phoneNumbers = phoneNumbers;
//	}

	@JsonProperty("role")
	public String getRole() {
		return role;
	}

	@JsonProperty("role")
	public void setRole(String role) {
		this.role = role;
	}

	@JsonProperty("cities")
	public List<String> getCities() {
		return cities;
	}

	@JsonProperty("cities")
	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}