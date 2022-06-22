package SMS;

public class Subject {
    String name;
    int marks;

    Subject(String name){
         this.name = name;
         marks = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
