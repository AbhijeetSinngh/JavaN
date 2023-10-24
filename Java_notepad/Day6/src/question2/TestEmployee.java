package question2;



	public class TestEmployee {

		//all instance methods need to be called by instance/object of the class
		//static methods are accessible inside static methods directly
		//static methods get invoked using className
		public static void incrementSalary(double salary,double  amount) {
			System.out.println("---increment salary--------");
			salary=salary+amount;
			System.out.println("Salary="+salary);//7000
		}
		
		public static void incrementSalary(Employee obj,double  amount) {
			System.out.println("---increment salary--------");
			obj.setSalary(obj.getSalary()+amount);
			System.out.println("Salary="+obj.getSalary());//7000
		}
		
		
		
		public static void main(String[] args) {

			//create refVariable of Type Employee
			
			Employee emp1;//emp1 is on stack
	        emp1=new Employee();//1:default constr invoked
	        //2:memory for empid,name,salary get created on heap
	        //3:ref of heap memory assigned to emp1 on stack
			emp1.display();//instance method
			int a=20;//int is value data type,value get assign
			
			System.out.println(a);
			System.out.println("----------------");
			System.out.println(emp1);//implicitly .toString()
			System.out.println(emp1.toString());
			
			//emp1.salary=5000
			//increment salary of emp1
			TestEmployee.incrementSalary(emp1.getSalary(), 2000);
			System.out.println("----------------");
			System.out.println(emp1);//empid:1 name:ram salary:
			
			//
			System.out.println("----------------");
			TestEmployee.incrementSalary(emp1, 2000);
			
			System.out.println(emp1);//empid 101 name:ram salary:7000
			
			
			
			//Employee emp2=new 
			
			
		}

	}



