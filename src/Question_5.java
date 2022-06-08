import java.util.*;

public class Question_5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //reads the number of students the user wants to add
        System.out.print("Enter number of students to add: ");
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        //create a list for of the students
        List<Student> studentList = new ArrayList<>();

        while(numberOfStudents > 0)
        {
            try
            {
                System.out.print("ID: ");
                int id = scanner.nextInt();
                System.out.print("First Name: ");
                String fistName = scanner.next();
                System.out.print("CGPA(with a , for decimal place): ");
                double cgpa = scanner.nextDouble();
                System.out.print("-------------------------\n");

                //makes a new student object as the loop runs
                Student student = new Student(id, fistName, cgpa);
                studentList.add(student);
            }
            catch (Exception e)
            {
                System.out.print("Error: " + e.getMessage());
            }

            //decrement the number since we deal with limited number of students given from user
            numberOfStudents--;
        }

        /*the comparator sorts the student CGPA marks with on another
        then sorts them from highest to lowest*/
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2)
            {
                if (s2.getCgpa() > s1.getCgpa())
                {
                    return 1;
                } else if (s2.getCgpa() < s1.getCgpa())
                {
                    return -1;
                }
                return s1.getFname().compareTo(s2.getFname());
            }
        });

        //special for loop to run through the students and print out only their first names
        for(Student st: studentList){
            System.out.println("Sorted by highest CGPA to lowest" + st.getFname());
        }
    }
}

