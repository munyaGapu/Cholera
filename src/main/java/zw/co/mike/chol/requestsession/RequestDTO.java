package zw.co.mike.chol.requestsession;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.time.LocalDateTime;

@Component
@RequestScope
public class RequestDTO {

    public RequestDTO() {
        System.out.println("DataRequestScope Constructor Called at "+ LocalDateTime.now());
    }

}
