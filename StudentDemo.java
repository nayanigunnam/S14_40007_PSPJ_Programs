class Student 
{
    // Properties (or) Data members (or) Instance variables
    int Rollno;
    String name;
    int age;
    char gender;

    // Default Constructor
    Student() 
    {
        Rollno = 100;
        name = "Ravi";
        age = 17;
        gender = 'M';
    }

    // Parameterized Constructor
    Student(int no, String n, int a, char g) 
    {
        Rollno = no;
        name = n;
        age = a;
        gender = g;
    }

    // Copy Constructor
    Student(Student s) 
    {
        Rollno = s.Rollno;
        name = s.name;
        age = s.age;
        gender = s.gender;
    }

    // Method (or) Member function
    void display() 
    {
        System.out.println("Roll NO: " + Rollno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println();
    }
}

public class StudentDemo
{
    public static void main(String args[]) 
    {
        // creating Object using default constructor
        Student s2 = new Student();

        // creating Object using parameterized constructor
        Student s1 = new Student(101, "Mohith", 20, 'M');

        // creating Object using copy constructor
        Student s3 = new Student(s2);

        s1.display();
        s2.display();
        s3.display();
    }
}