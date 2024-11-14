package by.javaguru.controller;

import by.javaguru.dto.CourseResponseDto;
import by.javaguru.service.StudentServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceService service;

    @GetMapping("/home")
    public String greetingMessage() {
        return service.greeting();
    }

    @GetMapping("/{studentId}")
    public CourseResponseDto getCourseInfo(@PathVariable String studentId) {
        return service.getCourseInfo(studentId);
    }
}
