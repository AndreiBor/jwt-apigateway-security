package by.javaguru.dao;

import by.javaguru.dto.CourseResponseDto;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CourseDAO {

    public CourseResponseDto getOrders(String orderId) {
        return getCourses().get(orderId);
    }

    private Map<String, CourseResponseDto> getCourses() {
        Map<String, CourseResponseDto> orderMap = new HashMap<>();
        orderMap.put("cs-1", new CourseResponseDto("cs-1", "Computer Science", 0));
        orderMap.put("jc-2", new CourseResponseDto("jc-2", "Java Core", 47200));
        orderMap.put("je-3", new CourseResponseDto("je-3", "Java Enterprise", 64900));
        orderMap.put("jd-4", new CourseResponseDto("jd-4", "Java Developer", 100000));
        orderMap.put("jg-5", new CourseResponseDto("jg-5", "Java Guru", 100000));
        return orderMap;
    }

}
