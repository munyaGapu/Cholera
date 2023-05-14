package zw.co.mike.chol.requestsession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private CholeraPatient choleraPatient;

    public Controller(CholeraPatient choleraPatient) {
        this.choleraPatient = choleraPatient;
    }

    @RequestMapping("/request/addNew")
    public String addNewCholeraCase() {
        System.out.println(choleraPatient.printRequestHashCode());
        return choleraPatient.printRequestHashCode();
    }
    @RequestMapping("/request/update")
    public String updateCholeraPatientStatus() {
        System.out.println(choleraPatient.printRequestHashCode());
        return choleraPatient.printRequestHashCode();
    }

    @RequestMapping("/session/update")
    public String getAllCholeraPatients() {
        System.out.println(choleraPatient.printSessionHashCode());
        return choleraPatient.printSessionHashCode();
    }

    @RequestMapping("/session")
    public String administerCholeraPreventionKits() {
        System.out.println(choleraPatient.printSessionHashCode());
        return choleraPatient.printSessionHashCode();
    }
}
