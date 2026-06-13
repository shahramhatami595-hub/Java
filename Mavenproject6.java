
package com.mycompany.mavenproject6;

public class Mavenproject6 {

    public static void main(String[] args) {
        
    Teacher t = new Teacher ();
    
    Student s = new Student();
    
    Employee e = new Employee();
    
    t.attending();
    
    s.attending();
    
    e.attending();
     
    }
}


class university_member {

    protected String name;
    protected int age;
    protected String gender;
    protected String last_name;
    protected String phone;
    protected String email;
    
    void attending(){
        System.out.println("The university members are attending to the university");
    } 
} 


class Teacher extends university_member {

    String job;
    String departement;
    int salary;
    
    void teaching(){
        System.out.println("The teacher is teaching");
    }

    void taking_salary(){
        System.out.println("The teacher is taking the salary");
    }
}


class Student extends university_member {

    String faculty;
    String depertament;
    int systemer;
    
    void studying(){
        System.out.println("The students are studying their lessons");
    }
}


class Employee extends university_member {

    String position;
    int salary;
    
    void work(){
        System.out.println("The employees are working");
    }
}

