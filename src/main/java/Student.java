import java.util.ArrayList;
import java.util.HashMap;


public class Student {
    public String name;
    public long id;
    public ArrayList<Integer> grade;

    public Student(String name){
        this.name=name;
        this.id=id;
        this.grade = new ArrayList<>();
    }


    public long getId(){
        return this.id;
    }
    public long addId(long x){
        return this.id = x;
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
