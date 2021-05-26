package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student> {
    String name;
    int age, rollNumber;
    Student(String name,int age , int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public int compareTo(Student obj) {
        if(age == obj.age) {
            return 0;
        }
        else if(age > obj.age) {
            return 1;
        }
        else {
            return -1;
        }
    }
}

public class ComparableInterface {
    public static void main(String[] args) {
        ArrayList<Student> Students = new ArrayList();
        Students.add(new Student("Ajay", 21, 2));
        Students.add(new Student("Tanu", 19, 32));
        Students.add(new Student("Rishab", 18, 21));
        Students.add(new Student("Chau", 20, 20));

        Collections.sort(Students);

        for(Student singleStudent : Students) {
            System.out.println("Name : " + singleStudent.name + " Roll Number : " + singleStudent.rollNumber + " Age : " + singleStudent.age);
        }
    }
}
