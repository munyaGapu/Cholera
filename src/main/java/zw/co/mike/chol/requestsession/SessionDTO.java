package zw.co.mike.chol.requestsession;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionDTO {

    public SessionDTO() {
        System.out.println("DataSessionScope Constructor Called at "+ LocalDateTime.now());
    }

}
