package by.javaguru.client;

import by.javaguru.dto.CourseResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CourseServiceClient {
    @Autowired
    private RestTemplate template;

    public CourseResponseDto fetchCourseInfo(String orderId) {
        return template.getForObject("http://COURSE-SERVICE/course/" + orderId, CourseResponseDto.class);
    }
}
