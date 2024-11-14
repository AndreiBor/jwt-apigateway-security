package by.javaguru.client;

import by.javaguru.dto.CourseResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CourseServiceClient {

    @Autowired
    private RestTemplate template;

    public CourseResponseDto getCourseInfo(String courseId) {
//        return template.getForObject("http://localhost:8085/course/" + courseId, CourseResponseDto.class);
        return template.getForObject("http://COURSE-SERVICE/course/" + courseId, CourseResponseDto.class);
    }
}
