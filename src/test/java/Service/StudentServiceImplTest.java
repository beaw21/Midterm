package Service;

import Dao.StudentDao;
import Entity.Student;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.number.IsCloseTo.*;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceImplTest {

    StudentDao studentDao = null;
    @BeforeEach
    public void init(){
        studentDao = mock(StudentDao.class);
        when(studentDao.getStudents()).thenReturn(Arrays.asList(
                new Student("CC","sam","2020567890"),
                new Student("CC","sam","2020567891"),
                new Student("CC","sam","2019567888"),
                new Student("CC","sam","2018567123")
        ));
    }
    @Test
    void getStudents() {
        StudentServiceImpl studentService = new StudentServiceImpl();
        studentService.setStudentDao(studentDao);

        List<Student> actual = studentService.getStudents();
        assertThat(actual.size(),is(4));
        assertThat(actual, containsInAnyOrder(
                new Student("CC","sam","2020567890"),
                new Student("CC","sam","2020567891"),
                new Student("CC","sam","2019567888"),
                new Student("CC","sam","2018567123")
        ));
    }
}