package org.stu.day3;

public class Student {
	//data type
private void studentId(int Id) {
	System.out.println(Id);
	

}
//data type count or number
private void studentId(String name ,int mark,int age) {
	System.out.println(name+"\n"+mark+"\n"+age);
	}
//order
private void studentId(long rollno,float percentage) {
	System.out.println(rollno+"\n"+percentage);
}
private void studentId(float fees,long phoneno) {
	System.out.println(fees+"\n"+phoneno);
}
public static void main(String[] args) {
	Student s=new Student();
	s.studentId(1);
	s.studentId("Devi",444, 20);
	s.studentId(31182348l, 85.00f);
	s.studentId(50.555f, 9626020826l);
}
}
