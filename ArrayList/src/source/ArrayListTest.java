package source;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Student {
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class ArrayListTest {
	private static final int HashSet = 0;

	public static void main(String args[]) {
		// Creating user-defined class objects
		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumat", 25);
		// creating arraylist
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);// adding Student class object
		al.add(s2);
		al.add(s3);
		// Getting Iterator
		Iterator itr = al.iterator();
		// traversing elements of ArrayList object
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		// to remove a element or object from the list
		if (!al.isEmpty()) {
			for (Iterator iterator = al.iterator(); iterator.hasNext();) {
				Student student = (Student) iterator.next();
				if (student.getName().toString().equals("Sonoo")) {
					iterator.remove();
				}
			}
			System.out.println("After sonoo removed ");
			for (Student st : al) {
				System.out.println(st.rollno + " " + st.name + " " + st.age);
			}
		}
		// combining two list and eliminate duplicates
		List<String> a2 = new ArrayList<String>();
		a2.add("ravi");
		a2.add("ram");
		a2.add("shiva");
		a2.add("ravi");
		System.out.println(a2);
		List<String> a3 = new ArrayList<String>();
		a3.add("ram");
		a3.add("shiva");
		a3.add("robot");
		System.out.println(a3);
		//eliminating duplicates by using sets
		Set<String> set=new HashSet<String>(a2);
		System.out.println("duplicates eliminated using sets"+set);
		// MERGING by creating 3rd array and sorting
		List<String> r = new ArrayList();
		r.addAll(a2);
		for (String x : a3) {
			if (!r.contains(x)) {
				r.add(x);
			}
		}
		System.out.println("list after merging with third array and eliminating dulicates : " + r);
		// merging by methods
		a2.removeAll(a3);
		System.out.println("array removing all the elements of 2nd elements form first: " + a2);
		a2.addAll(a3);
		System.out.println("Arary after soritng" + a2);
	
		
	}
}
