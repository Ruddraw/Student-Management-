package studentDatabaseApp;

import java.util.Scanner;

public class studentDatabaseApp {
    public static void main(String[] args) {
        
        //ask how many new students we want to add

        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        student[] students = new student[numOfStudents];


        //create n number of students

        for(int n = 0; n < numOfStudents; n++){
            students [n] = new student();
            students [n].enroll();
            students [n].payTuition();
            //System.out.println( students [n].toString());
        }
        for(int n = 0; n < numOfStudents; n++){
            System.out.println( students [n].toString());
        }
    }
}
