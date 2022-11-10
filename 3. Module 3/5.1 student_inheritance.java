package com.doxalearn.LearnJava;

public class Student {//Single Level Inheritance
    public  String name; // public: object of derived class can be treated as object of the super clas
    public double test1, test2, test3;
    protected String department; // allows derived class to know details of super class
    private String schoolEmail; // prevents objects of derived class to be treated as objects of super class

    public Student(){
        test1 = 82;
        test2 = 93;
        test3 = 77;
    }

    public void SetEmail(String email){
        this.schoolEmail = email;
    }

    public void GetEmail(){
        System.out.println(this.schoolEmail);
    }

    public double GetAverage(){
        return (test1 + test2 + test3) / 3;
    }
}
package com.doxalearn.LearnJava;

public class UnderGrad extends Student{

    public UnderGrad(){
        test1 = 90;
        test2 = 80;
        test3 = 75;
    }
	
	
	    public static void main(String[] args) {

        Student s1 = new Student();
        UnderGrad s2 = new UnderGrad();

        s1.name = "Jen Brooks";
        s1.department = "Information Technology";
        s1.SetEmail("jenbrooks@gmail.com");

        s2.name = "Mark Chang";
        s2.department = "Communications";

        System.out.println(s1.name);
        System.out.println(s1.department);
        System.out.println(s1.GetAverage());
        s1.GetEmail();

        System.out.println(s2.name);
        System.out.println(s2.department);
        System.out.println(s2.GetAverage());
    }
}