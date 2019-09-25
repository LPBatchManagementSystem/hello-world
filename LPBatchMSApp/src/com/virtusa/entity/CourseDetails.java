package com.virtusa.entity;

public class CourseDetails {
	
	private int courseDetailsId;
	private String courseName;
	private double courseFees;
	private String courseDescription;
	public int getCourseDetailsId() {
		return courseDetailsId;
	}
	public void setCourseDetailsId(int courseDetailsId) {
		this.courseDetailsId = courseDetailsId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	@Override
	public String toString() {
		return "CourseDetails [courseDetailsId=" + courseDetailsId + ", courseName=" + courseName + ", courseFees="
				+ courseFees + ", courseDescription=" + courseDescription + "]";
	}


}
