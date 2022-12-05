import org.junit.*;
import static org.junit.Assert.*;
public class StudentTest {
    Student john;
    Student steve;
    Student greg;

    @Before
    public void setUp(){
        john = new Student("John");
        john.addId(1);
        john.addGrade(40);
        john.addGrade(50);
        john.addGrade(60);
        john.getGradeAverage();
        steve = new Student("Steve");
        steve.addId(2);
        steve.addGrade(77);
        steve.addGrade(72);
        steve.addGrade(79);
        greg = new Student("Greg");
        greg.addId(3);
        greg.addGrade(68);
        greg.addGrade(90);
        greg.addGrade(80);
    }
    @Test
    public void testAdd(){
        assertEquals(3, greg.grade.size());
        greg.addGrade(99);
        assertEquals(4, greg.grade.size());
    }
    @Test
    public void testGetId(){
        assertEquals(1, john.id);
    }
    @Test
    public void testGetName(){
        assertEquals("John", john.name);
    }

}
