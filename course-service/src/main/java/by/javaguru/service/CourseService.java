package by.javaguru.service;

import by.javaguru.dao.CourseDAO;
import by.javaguru.dto.CourseResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CourseService {
    private final static Logger LOGGER = LoggerFactory.getLogger(CourseService.class);
    private final static String ID = UUID.randomUUID().toString();

    @Autowired
    private CourseDAO courseDAO;

    public String greeting() {
        return "Welcome to Java Guru courses";
    }

    public CourseResponseDto getCourse(String orderId) {
        LOGGER.info("Course service instance = {}", ID);
        return courseDAO.getOrders(orderId);
    }
}
