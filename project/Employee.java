package project;

public class Employee {

private String name;
private String jobTittle;
private double salary;
public Employee(String name, String jobTittle, double salary) {
	super();
	this.name = name;
	this.jobTittle = jobTittle;
	this.salary = salary;
}
private String getName() {
	return name;
}
private void setName(String name) {
	this.name = name;
}
private String getJobTittle() {
	return jobTittle;
}
private void setJobTittle(String jobTittle) {
	this.jobTittle = jobTittle;
}
private double getSalary() {
	return salary;
}
private void setSalary(double salary) {
	this.salary = salary;
}

public void raiseSaraly(double percentage) {
	salary =salary+salary*percentage/100;
}
public void printEmployeeDetails() {
	System.out.println("Name:"+name);
	System.out.println("jobTittle:"+jobTittle);
	System.out.println("saraly:"+salary);
}
}
