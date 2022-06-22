package SMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students");
        int studentNumber = input.nextInt();
        input.nextLine();
        Student[] students = new Student[studentNumber];

        for (int i = 0; i < students.length; i++) {
            System.out.println("----------------------------");
            System.out.println("Enter Student Name");
            students[i] = new Student(input.nextLine());
            for (Subject subject : students[i].subjects) {
                System.out.println("Enter marks of "+subject.name+":");
                subject.setMarks(input.nextInt());
            }
            input.nextLine();
            System.out.println("----------------------------");
        }

        Functions.ranks(students);
        System.out.println();
        System.out.println();

        Functions.subjectAvg(students);
        System.out.println();
        System.out.println();

        Functions.aboveAvg(students);
        System.out.println();
        System.out.println();

        Functions.topScorer(students);
        System.out.println();
        System.out.println();

        Functions.subWiseReport(students);
        System.out.println();
        System.out.println();
        
       Functions.aboveAvgSubjects(students);

    }
}
