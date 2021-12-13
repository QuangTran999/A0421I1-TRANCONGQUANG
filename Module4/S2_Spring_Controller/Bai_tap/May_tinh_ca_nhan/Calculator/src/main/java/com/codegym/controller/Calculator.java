import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Calculator {
    @GetMapping("/home")
    public String home(){
        return "index";
    }
}
