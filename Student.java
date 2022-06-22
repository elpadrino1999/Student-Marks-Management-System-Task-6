package SMS;

public class Student {
    String name;
    Subject[] subjects;

    int total;

    Student(String name){
        this.name = name;
        subjects = new Subject[]{
                new Subject("Tamil"),
                new Subject("English"),
                new Subject("Maths"),
                new Subject("Science"),
                new Subject("Social Science")
        };
        total= -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public int getTotal() {
        if (total==-1){
            total = 0;
            for (Subject subject : subjects) {
                total+= subject.getMarks();
            }
        }
        return total;
    }
}
