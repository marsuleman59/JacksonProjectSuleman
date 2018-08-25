/**
 * 
 */
package com.jackson.pojos;

/**
 * @author Suleman
 */

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
@Data@ToString
@AllArgsConstructor

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "gross", "basic", "bonus" })
public class Salary {

	/**
	 * @param gross
	 * @param basic
	 * @param bonus
	 */
	public Salary(Double gross, Double basic, Double bonus) {
		super();
		this.gross = gross;
		this.basic = basic;
		this.bonus = bonus;
	}

	/**
	 * @param gross
	 * @param basic
	 * @param bonus
	 */
	public Salary() {
		super();
	}

	@JsonProperty("gross")
	private Double gross;
	@JsonProperty("basic")
	private Double basic;
	@JsonProperty("bonus")
	private Double bonus;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("gross")
	public Double getGross() {
		return gross;
	}

	@JsonProperty("gross")
	public void setGross(Double gross) {
		this.gross = gross;
	}

	@JsonProperty("basic")
	public Double getBasic() {
		return basic;
	}

	@JsonProperty("basic")
	public void setBasic(Double basic) {
		this.basic = basic;
	}

	@JsonProperty("bonus")
	public Double getBonus() {
		return bonus;
	}

	@JsonProperty("bonus")
	public void setBonus(Double bonus) {
		this.bonus = bonus;
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