import java.util.Scanner;
 
public class inst
{
public String name;
private int marks;
public inst (String stuName) {
name = stuName;
}
public void setMarks(int stuMar) {
marks = stuMar;
}
public void printStu() {
System.out.println("Name: " + name );
System.out.println("Marks:" + marks);
}
public static void main(String args[]) {
inst StuOne = new inst("Emile");
inst StuTwo = new inst("Smith");
inst StuThree = new inst("Rowe");
StuOne.setMarks(98);
StuTwo.setMarks(89);
StuThree.setMarks(90);
StuOne.printStu();
StuTwo.printStu();
StuThree.printStu();
}
}