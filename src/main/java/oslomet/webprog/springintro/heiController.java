package oslomet.webprog.springintro;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class heiController {
    @GetMapping("/")
    public String hei(String navn) {
        //telle opp antall bokstaver i navnet
        int antallBokstaver = navn.length();
        return "Hei verden " + navn + "! Navnet ditt er " + antallBokstaver + " lang." ;
    }
}
