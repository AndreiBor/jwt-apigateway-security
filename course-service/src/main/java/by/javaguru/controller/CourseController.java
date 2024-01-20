package by.javaguru.controller;

import by.javaguru.dto.CourseResponseDto;
import by.javaguru.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping
    public String greetingMessage() {
        return service.greeting();
    }

    @GetMapping("/{courseId}")
    public CourseResponseDto getCourse(@PathVariable String courseId) {
        return service.getCourse(courseId);
    }
}

