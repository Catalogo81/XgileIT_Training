//Question 2

package com.packages;

public class Student
{
    String name;
    int maths, english, sotho;

    //function that sets the students details/values
    public void studentDetails(String name, int maths, int english, int sotho)
    {
        this.name = name;
        this.maths = maths;
        this.english = english;
        this.sotho = sotho;

//        name = "John";
//        maths = 85;
//        english = 50;
//        sotho = 40;
    }

    //function that computes the total average of marks
    public double marksAverage() {

        return (sotho + maths + english) / 3.0;
    }

    //function for displaying students name and total marks
    public void displayDetails() {
        int totalMarks = 0;

        totalMarks = maths + sotho + english;

        System.out.println("Name: " + name);
        System.out.println("Total marks: " + totalMarks);
    }

    public static void main(String[] args)
    {
        //creates a student new object
        Student s1 = new Student();

        //calls the studentDetails method and assigns the values of the parameters
        s1.studentDetails("Kgotso", 98,85,90);
        s1.displayDetails();

        //calls the marksAverage method and displays the average
        double average = s1.marksAverage();
        System.out.println("My average mark is: " + average);

    }
}
