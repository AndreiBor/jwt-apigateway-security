package by.javaguru.service;

import by.javaguru.client.CourseServiceClient;
import by.javaguru.client.CourseServiceFeignClient;
import by.javaguru.dto.CourseResponseDto;
import by.javaguru.dto.StudentDto;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentServiceService {

    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceService.class);

    private final CourseServiceClient courseServiceClient;

//    private final CourseServiceFeignClient courseServiceClient;

    public String greeting() {
        return "Welcome to student service";
    }

    public CourseResponseDto getCourseInfo(String studentId) {


        CourseResponseDto courseResponseDto = courseServiceClient.getCourseInfo(getStudentTable().get(studentId).getCourseId());

        return courseResponseDto;
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
