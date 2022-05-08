//Question 5

package com.packages;

public class Dept
{
    String name;
    String location;
    Employee[] employees;

    //constructor for declaring reusable variables
    public Dept(String name, String location, Employee[] employees) {
        this.name = name;
        this.location = location;
        this.employees = employees;
    }

    //constructor for assigning the variables with something
    public Dept ()
    {
        name = "";
        location = "";
        employees = new Employee[1];
    }

    public void add(Employee e)
    {
        //adding a new employee
        Employee[] emp1 = new Employee[employees.length + 1];

        for (int i = 0; i < employees.length; i++)
        {
            emp1[i] = employees[1];
        }

        emp1[employees.length] = e;
        employees = emp1;
    }

    public void remove(int i)
    {
        if(employees != null || i > 0 || i < employees.length)
        {
            Employee[] removedEmp = new Employee[employees.length - 1];
            employees = removedEmp;
        }
    }

    public static void main(String[] args)
    {
        Employee[] employees1 = new Employee[5];
        double expenditure = 0;

        for(int i = 0; i < 5; i++)
        {
            //String name
            employees1[i] = new Employee("Kgotso", 4568, "ds i dhs", 52.6);
        }

        Dept dept = new Dept("Information Technology", "CUT", employees1);

        for(int i = 0; i < 5; i++)
        {
            expenditure += (dept.employees[i].salary) * 12;
        }

        System.out.println("Expenditure is: " + expenditure);

    }
}
