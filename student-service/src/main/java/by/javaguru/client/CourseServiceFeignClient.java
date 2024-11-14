package by.javaguru.client;

import by.javaguru.dto.CourseResponseDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "COURSE-SERVICE")
public interface CourseServiceFeignClient {

    @GetMapping("/course/{courseId}")
    @Retry(name="course-service", fallbackMethod = "getCourseInfoFallback")
    @CircuitBreaker(name = "course-service", fallbackMethod = "getCourseInfoFallback")
    CourseResponseDto getCourseInfo(@PathVariable String courseId);

    default CourseResponseDto getCourseInfoFallback(String courseId, Throwable exception) {
        System.out.println("courseId: " + courseId);
        System.out.println("exception: " + exception.getMessage());
        return new CourseResponseDto("javaguru", "javaguru", 0);
    }


}
