package SMS;

public class Functions {

    static double[] avg;
    static void aboveAvgSubjects(Student[] students){
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Above Average Subject of Each Student");
        for (Student student : students) {
            int n = 0;
            StringBuilder subs = new StringBuilder();
            subs.append("| ");
            for (int i = 0; i < student.getSubjects().length; i++) {
                if(student.getSubjects()[i].getMarks() >= avg[i]){
                    subs.append(student.getSubjects()[i].getName()).append(" | ");
                    n++;
                }
            }
            System.out.println("----------------------------------------------------------------------");
            System.out.printf("%-15s %-50s %-5d\n",student.getName(),subs,n);
        }
        System.out.println("----------------------------------------------------------------------");
    }


    static void subWiseReport(Student[] students){
        System.out.println("Subject Wise Report");
        System.out.println("----------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(students[0].getSubjects()[i].getName());
            System.out.println("----------------------------");
            for (Student student : students) {
                System.out.printf("|%-15s | %-5d|\n",student.name,student.getSubjects()[i].getMarks());
            }
            System.out.println("----------------------------");
        }
        System.out.println("----------------------------");
    }

    static void topScorer(Student[] students){
        System.out.println("Top Scoring Students");
        System.out.println("----------------------------");
        Student currentTop = students[0];
        for (int i = 0; i < 5; i++) {
            System.out.println("Top Scorer in "+students[0].getSubjects()[i].getName());
            for (int j = 1; j < students.length; j++) {
                if(students[j].getSubjects()[i].getMarks() > currentTop.getSubjects()[i].getMarks()){
                    currentTop = students[j];
                }
            }
            System.out.println("----------------------------");
            for (int j = 0; j < students.length; j++) {
                if(students[j].getSubjects()[i].getMarks() == currentTop.getSubjects()[i].getMarks()){
                    System.out.printf("|%-15s | %-5d|\n",students[j].name,students[j].getSubjects()[i].getMarks());
                }
            }
            System.out.println("----------------------------");
        }
        System.out.println("----------------------------");
    }

    //Write a function to display the students with
    // marks higher than or equal to the over all average marks of each subject.
    static void aboveAvg(Student[] students){
        System.out.println("Above Average Students");
        System.out.println("----------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println("Above Average in "+students[0].getSubjects()[i].getName());
            for (Student student : students) {
                if(student.getSubjects()[i].getMarks()>=avg[i]){
                    System.out.printf("|%-15s | %-5d|\n",student.name,student.getSubjects()[i].getMarks());
                }
            }
        }
        System.out.println("----------------------------");
    }

    //Write a function to display the over all average mark of each subject.
    static void subjectAvg(Student[] students){
        double[] arr = new double[]{0,0,0,0,0};
        for (Student student : students) {
            arr[0] += student.subjects[0].getMarks();
            arr[1] += student.subjects[1].getMarks();
            arr[2] += student.subjects[2].getMarks();
            arr[3] += student.subjects[3].getMarks();
            arr[4] += student.subjects[4].getMarks();
        }

        arr[0] = arr[0]/students.length;
        arr[1] = arr[1]/students.length;
        arr[2] = arr[2]/students.length;
        arr[3] = arr[3]/students.length;
        arr[4] = arr[4]/students.length;

        System.out.println("Subject Average");
        System.out.println("----------------------------");
        System.out.printf("%-15s %-5s\n","Subject","Average");

        for (int i = 0; i < students[0].getSubjects().length; i++) {
            System.out.printf("%-15s %-5.2f\n",students[0].getSubjects()[i].getName(),arr[i]);
        }

        System.out.println("----------------------------");
        avg = arr;
    }

    //Write a function to display the rank based report of all students with total marks.
    static void ranks(Student[] students){
        bubbleSort(students);
        System.out.println("Student Ranking");
        System.out.println("----------------------------");
        System.out.printf("%-5s %-15s %-5s\n","Rank", "Name", "Total");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-5d %-15s %-5d\n",(i+1), students[i].getName(), students[i].getTotal());
        }
        System.out.println("----------------------------");
    }

    static void bubbleSort(Student[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].getTotal() < arr[j + 1].getTotal()) {
                    // swap arr[j+1] and arr[j]
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    String isPassed(int n){
        return (n>33)? "PASS":"FAIL";
    }
}
