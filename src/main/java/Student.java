import java.util.ArrayList;
import java.util.HashMap;


public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grade;

    public Student(){
        this.name=name;
        this.id=id;
        this.grade = new ArrayList<>();
    }


    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grade.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return this.grade;
    }

    public double getGradeAverage(){
        double avg = 0;
        for (int x : grade){
            avg += x;
        }
        return avg / grade.size();
    }
}
