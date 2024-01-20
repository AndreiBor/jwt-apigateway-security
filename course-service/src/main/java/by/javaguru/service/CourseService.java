package by.javaguru.service;

import by.javaguru.dao.CourseDAO;
import by.javaguru.dto.CourseResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseDAO courseDAO;

    public String greeting() {
        return "Welcome to Java Guru courses";
    }

    public CourseResponseDto getCourse(String orderId) {
        return courseDAO.getOrders(orderId);
    }
}
