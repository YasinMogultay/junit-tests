import org.junit.Assert;
import org.testng.annotations.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


public class CohortTest {

    @Test
    public void addStudent_GivenValidStudent_StudentIsAdded() {
        //Arrange
        Cohort cohort = new Cohort();
        Student student = new Student (1L,"Yasin");
        //Act
        cohort.addStudent(student);
        //Assert
        assertEquals(1,cohort.getStudents().size());
    }

    @Test
    public void instanceStudent_GivenValidInstance_StudentsInstance() {
        //Arrange
        Cohort cohort = new Cohort();
        Student student = new Student (1L,"Yasin");
        //Act
        cohort.addStudent(student);

        //Assert
        assertEquals(1,cohort.getStudents().size());
    }

    @Test
    public void  instanceAverage_GivenAverageCalculation_IsCalculated() {
        //Arrange
        Cohort cohort = new Cohort();
        Student student = new Student (1L,"Yasin");

        //Act
        student.addGrade(80);
        student.addGrade(90);
        student.addGrade(100);

        //Assert
        assertEquals(90,student.getGradeAverage(), 0);
    }




}
