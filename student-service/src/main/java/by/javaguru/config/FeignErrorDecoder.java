package by.javaguru.config;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class FeignErrorDecoder implements ErrorDecoder {

    private final static Logger LOGGER = LoggerFactory.getLogger(FeignErrorDecoder.class);

    @Override
    public Exception decode(String methodKey, Response response) {
        switch (response.status()) {
            case 400:
                //TODO
                break;
            case 404:
                if (methodKey.contains("getCourseInfo")) {
                    return new ResponseStatusException(HttpStatusCode.valueOf(404), "Course service is not available");
                }
                LOGGER.error("Course service is not available");
                break;
            default:
                return new Exception(response.reason());
        }

        return null;
    }
}
