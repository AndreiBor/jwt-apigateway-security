package by.javaguru.service;

import by.javaguru.client.CourseServiceClient;
import by.javaguru.dto.CourseResponseDto;
import by.javaguru.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceService {

    @Autowired
    private CourseServiceClient courseServiceClient;

    public String greeting() {
        return "Welcome to student service";
    }

    public CourseResponseDto getCourseInfo(String studentId) {
        return courseServiceClient.fetchCourseInfo(getStudentTable().get(studentId).getCourseId());
    }

    private Map<String, StudentDto> getStudentTable() {
        Map<String, StudentDto> studentTable = new HashMap<>();
        studentTable.put("1", new StudentDto("1", "Ivan", "cs-1"));
        studentTable.put("2", new StudentDto("2", "Petr", "jd-4"));
        studentTable.put("3", new StudentDto("3", "Vasia", "jd-4"));
        studentTable.put("4", new StudentDto("4", "Anna", "jd-4"));
        studentTable.put("5", new StudentDto("5", "Alisa", "jd-4"));
        return studentTable;
    }
}
