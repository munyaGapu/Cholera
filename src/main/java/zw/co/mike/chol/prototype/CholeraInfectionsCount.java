package zw.co.mike.chol.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CholeraInfectionsCount {
    static int counter;

    public int counterMethod(){
       return ++counter;
    }

}
