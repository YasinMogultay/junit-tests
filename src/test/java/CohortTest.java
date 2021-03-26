<<<<<<< HEAD
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


=======
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWOne;
    Cohort cohortWMany;

    @Before
    public void init(){

        emptyCohort = new Cohort();
        cohortWOne = new Cohort();
        cohortWMany = new Cohort();

        Student fer = new Student(10L, "Fer");
        Student david = new Student(20L, "David");

        fer.addGrade(100);
        fer.addGrade(40);

        david.addGrade(80);
        david.addGrade(90);
        cohortWOne.addStudent(fer);
        cohortWMany.addStudent(fer);
        cohortWMany.addStudent(david);

    }

    @Test
    public void testIfAddStudentWorks(){
        assertEquals(1, cohortWOne.getStudents().size());
        assertEquals(2, cohortWMany.getStudents().size());
    }

    @Test
    public void testIfGetStudentsWork(){
        assertEquals(10, cohortWMany.getStudents().get(0).getId());
        assertEquals(20, cohortWMany.getStudents().get(1).getId());
    }

    @Test
    public void testIfCohortAvgWorks(){
        assertEquals(70, cohortWOne.getCohortAverage(), 0.5);
        assertEquals(77.5, cohortWMany.getCohortAverage(), 0.5);
    }
>>>>>>> 804173559d04a34e439601bf6999f89f7c6d00a9


}
