package com.cooksys.launch;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "class")
@XmlAccessorType(XmlAccessType.FIELD)
public class FastTrackDClass {
	
	@XmlAttribute(name = "date")
	private String month;
	
	private String location;
	
	@XmlElementWrapper
	@XmlElement(name = "student")
	private List<Student> students = new ArrayList<>();
	
	public FastTrackDClass() {
		// TODO Auto-generated constructor stub
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "FastTrackDClass [month=" + month + ", location=" + location + ", students=" + students + "]";
	}

}
