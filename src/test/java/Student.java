import java.util.ArrayList;

public class Student {
    public static long id;
    public static String name;
    public static ArrayList<Integer> grades;

    public Student(long id, String name, ArrayList<Integer> grades) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
        return sum;
    }
}
