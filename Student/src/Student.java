import java.util.ArrayList;
import java.util.Iterator;

class Student {
   int rollno;
   String name;
   int age;

Student(int rollno,String name, int age){
	this.rollno = rollno;
	this.name=name;
	this.age=age;
}
}

class Test{
	public static void main(String args[]){
	Student s1 = new Student(101,"sonu",22);
	Student s2 = new Student(102,"monu",23);
	Student s3 = new Student(103,"tonu",24);

ArrayList <Student> al = new ArrayList<Student>();

al.add(s1);
al.add(s2);
al.add(s3);

Iterator itr = al.iterator();

while(itr.hasNext()){
 Student st = (Student)itr.next();
System.out.println(st.rollno+" "+st.name+" "+st.age);
}
}
}

	
