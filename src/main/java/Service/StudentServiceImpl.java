package Service;

import Dao.StudentDao;
import Entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService{

    StudentDao studentDao;
    @Override
    public List<Student> getStudents() {
        List<Student> output = studentDao.getStudents();
        return  output;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }
}
