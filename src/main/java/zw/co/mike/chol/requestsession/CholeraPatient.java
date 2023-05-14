package zw.co.mike.chol.requestsession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CholeraPatient {


    private RequestDTO requestDTO;

    private SessionDTO sessionDTO;
    public CholeraPatient(RequestDTO requestDTO, SessionDTO sessionDTO) {
        this.requestDTO = requestDTO;
        this.sessionDTO = sessionDTO;
    }





    /*public RequestDTO getRequestScopeData() {
        return requestDTO;
    }

    public void setRequestScopeData(RequestDTO requestDTO) {
        this.requestDTO = requestDTO;
    }

    public SessionDTO getSessionScopeData() {
        return sessionDTO;
    }

    public void setSessionScopeData(SessionDTO sessionDTO) {
        this.sessionDTO = sessionDTO;
    }*/
    public String printRequestHashCode(){
        return " This call has hash "+ requestDTO;
    }
    public String printSessionHashCode(){
        return " This call has hash "+ sessionDTO;
    }


}
