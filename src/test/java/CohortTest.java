import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CohortTest {
    ArrayList cohort;
    Student kyle;
    @Before
    public void setUp(){
        cohort = new ArrayList();
        kyle = new Student();
    }
    @Test
    public void testAdd(){
        assertTrue(cohort.isEmpty());
        cohort.add(kyle);
        assertFalse(cohort.isEmpty());
    }
}
