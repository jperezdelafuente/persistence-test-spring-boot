package org.lab.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long code;

	private String title;

	public Movie() {
		super();
	}

	public Movie(String title) {
		super();
		this.title = title;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Movie [code=");
		builder.append(code);
		builder.append(", name=");
		builder.append(title);
		builder.append("]");
		return builder.toString();
	}

}
