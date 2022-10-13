public class simcls
  {
    	 String name;
	 int rollno;
	 int age;
	void info(){
	  System.out.println("Name: "+name);
	  System.out.println("Roll Number: "+rollno);
	  System.out.println("Age: "+age);
	}  
	public static void main(String[] args) {
		simcls student = new simcls();
		student.name = "Ram";
		student.rollno = 72;
		student.age = 20;
		student.info();	
	}
}  