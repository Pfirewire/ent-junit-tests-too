import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class StudentTest {

    private Student emptyStudent;
    private Student actualStudent;
    private ArrayList<Integer> emptyArrayList;

    @Before
    public void setup() {
        actualStudent = new Student(1L, "Steve");
        emptyArrayList = new ArrayList<>();
    }

    @Test
    public void testStudentConstructors() {
        assertNull(emptyStudent);
        assertNotNull(actualStudent);
    }

    @Test
    public void testStudentGetters() {
        assertEquals(actualStudent.getId(), 1L);
        assertEquals(actualStudent.getName(), "Steve");

        assertNotNull(actualStudent.getGrades());
        assertEquals(actualStudent.getGrades(), emptyArrayList);
    }

    @Test
    public void testStudentAddGrade() {
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

//        ArrayList<Integer> expectedGrades = new ArrayList<>(Arrays.asList(50, 75, 100));

        assertEquals(actualStudent.getGrades(), Arrays.asList(50, 75, 100));
    }

    @Test
    public void testStudentGetGradeAverage() {
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        assertEquals(actualStudent.getGradeAverage(), 75, 0.000001);
    }
}
