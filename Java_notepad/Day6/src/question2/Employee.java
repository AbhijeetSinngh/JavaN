//package question2;
//import java.util.Scanner;
//public class Emp {
////	1.1 Emp state--- id(int), name, deptId , basicSalary(double)
////	Accept all of above in constructor arguments.
////	Methods ---1.To  get emp details -- override toString((inherited from Object class)
////	1.2. compute net salary ---ret 0
////	(eg : public double computeNetSalary(){return 0;})
//	private int id;
//	private String name;
//	private int deptId;
//	private double basicSalary;
//	public Emp(int id,String name,int deptId,double basicSalary){
//		this.id=id;
//		this.name=name;
//		this.deptId=deptId;
//		this.basicSalary=basicSalary;
//		
//	}
//	public String toString() {
//		return id+" "+name;
//	}
//}
package question2;
//Every class in java by default extends(inherits) java.lang.Object
//Object is parent class for Employee
public class Employee {

	//data member:instance variable
	private int empid;
	private  String name;
	private double salary;
	
	//write getters and setters
	public int getEmpid() {
		return empid;
	}
	public void setSalary(double sal) {
		salary=sal;
	}

	public String getName() {
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setName(String nm) {
		name=nm;
	}
	public void display() {
		System.out.println("----Employee Details----");
		System.out.println(empid+"   "+name+"   "+salary);
	}
	
	
	public Employee() {
		System.out.println("----Default Constr Employee-----");
	empid=1;
	name="Ram";
	salary=5000;
	}
	
	
	//constrctr accepting parameter is parameterized constr
	
	public Employee(int empid,String name,double salary) {
		System.out.println("------parameter constr--------");
		this.empid=empid;//this.empid is instance variable and empid is parameter
		this.name=name;
		this.salary=salary;
		
		
	}
	
	
	//child class hides(override) behaviour of parent class:overriding
	//function overriding:
	//1:possible only in inheritance
	//2:same function name with same signature ,same return data type
	//3:child class implements same sunction which is present in parent class
	
	//in this example
	//Employee class hides java.lang.Object class toString()
	//why?to print empid,name salary 
	//how:keep same name and same signature
	//Object: public String toString(){return...}
	//Employee:public String toString() {return "Employee Details";}
	
	public String toString() {
		return "EmpId="+empid+" Name:"+name+"  Salary="+salary;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
