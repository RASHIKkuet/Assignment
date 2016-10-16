
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.io.*;


public class Student
{


    int Id;
    String Name;
    String Department ;
    String University ;
    double[] GPA = new double[6];
    double[][] cgpa=new double [2][8];
    double CG;

    /**
     * Define a constructor that initilize the default properties of the Student
     */
    public Student(int id,String name,String department,String university)
    {
        Id = id;
        Name =name;
        Department = department;
        University = university ;
    }

    /**
     * Define a method to print the students details.
     */
    public void prntStdet(int id)
    {
        //write your code here
        System.out.println("ID          :" + Id);
        System.out.println("Name    :" +Name);
        System.out.println("Department :" + Department);
        System.out.println("University :" + University);
    }

    calculateCG
    /**
     * Define a method to update information of students by ID
     * Use as many arguments as required.
     */
    public void upDinfo(int id)
    {
        //Write your code here
        System.out.println("Do you want to update (write yes/no) :");
        String choice = input.nextLine();
        if(choice == "yes" )
        {
            name = input.nextLine();
            System.out.println("Enter Name : ");
            name = input.nextLine();
            System.out.println("Enter Department : ");
            Department = input.nextLine();
            System.out.println("Enter University : ");
            University = input.nextLine();
            System.out.println("Updated Name   :  " +name+ "\nDepartment   :     " +Department+ "\nUniversity   :     " +University);
        }
        else
        {
        }
    }

    /**
     * Define a method to compute the CGPA from the Given term GPA for a particular student.
     * se as many arguments as required.
     */
    public double calculateCG()
    {
        // Write your code here
        double cg = 0;
        int cnt = 0;

        for(int i=0; i<10; i++)
        {
            System.out.println("Enter GPA of Sem "+(i+1)+": ");
            GPA[i]=input.nextDouble();
        }


        for(int i=0; i<10; i++)
        {

            cnt++;
            cg+=GPA[i];
        }
        cg=cg\count;
        CGPA = cg;

        return cg;
    }


    /**
     * Define a method to compute the GPA from the given Credits and Grades of all the subjects
     */
    public double computeGPAById()
    {
        {
            double gpa =0;
            double total = 0;
            for(int i=0; i<10; i++)
            {
                System.out.println("Enter  Credit and grade for subjects: "+(i+1));
                for()
                {

                }

            }
        }

        for(int i=0; i<=10; i++)
        {
            gpa=0;
            total=0;
            for()
            {

            }

            gpa = gpa / total;
            System.out.printf("Gpa is : %d "gpa);
        }
        return gpa;
    }

    /**
     * After performing required operations on each student, save the information to a file. Use File and PrintWriter Class.
     * use as many arguments as required.
     *
     */
    public void saveSinfo() throws IOException
    {

        File outputFile = new File("output.txt");
        PrintWriter writer = new PrintWriter(outputFile);

        writer.println("  ");
        writer.println("Name : "+name);
        writer.println("ID: " + id);
        writer.println("Department: " + Department);
        writer.println("University: " + University);
        writer.printf("Current CGPA  : %.2f\n",CG);



        writer.close();
    }

    /**
     * Create a dummy files with infromations to describe the properties of a Student object and load the data files using Java File and Scanner class.
     * use as many arguments as required.
     */


    /**
     * The tasks to be carried out here:
     * 1. Create an Arrays of students using Student Class. Initlize them and perfom all the above defined operation to evualuate your code.
     * use as many arguments as required.
     */
    public static void main(String[] args) throws IOException
    {
        Student[] students = new Student[50];
        File inputFile = new File("input.txt");

        for(int i=0; in.hasNextLine() ; i++)
        {
            int m=in.nextInt();
            String n=in.next();
            String d=in.next();
            String u=in.next();
            students[i] = new Student(m,n,d,u);

            students[i].prntStdet(m);
            students[i].upDinfo(m);
            students[i].calculateCG(m);

        }
        in.close();
    }
}

