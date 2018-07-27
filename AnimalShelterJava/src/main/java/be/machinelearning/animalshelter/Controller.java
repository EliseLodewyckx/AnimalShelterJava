package be.machinelearning.animalshelter;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @PostMapping(path = "/predict")
    @CrossOrigin
    public String makePrediction() {
        return "Alive";
    }
}
