//Question 6

package com.packages;

public class Student_
{
    String name;
    int roll_no;
    String[] subjects;
    int c = 0;

    public Student_()
    {
        name = "";
        subjects = new String[5];
        for(int i = 0; i < 5; i++)
        {
            subjects[i] = "";
        }

        roll_no = ++c;
    }

    public Student_(String name, String[] subjects)
    {
        this.name = name;
        this.subjects = new String[subjects.length];
        for(int i = 0; i < subjects.length; i++)
        {
            this.subjects[i] = subjects[i];
        }

        roll_no = ++c;
    }

    public void studentDetails()
    {
        String studentName = name;
        int studentRollNo = roll_no;
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Subject " + (i + 1) + " : " + subjects[i]);
        }
    }
}
