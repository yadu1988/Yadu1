package com.app.idemia.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


@AllArgsConstructor
@Getter @Setter
@Table
public class Student {
	
	 @PrimaryKey 
	 private @NonNull String sid;
	 private @NonNull String sfirstName;
	 private @NonNull String slastName;
	 private @NonNull String scourse;
	public Student() {
		super();
	}
	public Student(@NonNull String sid, @NonNull String sfirstName, @NonNull String slastName,
			@NonNull String scourse) {
		super();
		this.sid = sid;
		this.sfirstName = sfirstName;
		this.slastName = slastName;
		this.scourse = scourse;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSfirstName() {
		return sfirstName;
	}
	public void setSfirstName(String sfirstName) {
		this.sfirstName = sfirstName;
	}
	public String getSlastName() {
		return slastName;
	}
	public void setSlastName(String slastName) {
		this.slastName = slastName;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sfirstName=" + sfirstName + ", slastName=" + slastName + ", scourse="
				+ scourse + "]";
	}
	
	
	 
	 
	 

}
