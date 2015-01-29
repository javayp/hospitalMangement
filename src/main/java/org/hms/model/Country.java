package org.hms.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Country {
	
	@Id
	@TableGenerator(name="id_country_gen",pkColumnName="gen_name",valueColumnName="gen_value",pkColumnValue="count_id",table="id_gen")
	@GeneratedValue(generator="id_country_gen")
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
