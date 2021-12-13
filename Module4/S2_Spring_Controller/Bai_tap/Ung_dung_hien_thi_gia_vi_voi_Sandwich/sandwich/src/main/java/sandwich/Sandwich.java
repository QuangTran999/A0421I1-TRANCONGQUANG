package sandwich;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sandwich {
    public StringBuilder gettring(String[] listString){
        StringBuilder buider = new StringBuilder();
        for (String item : listString) {
            buider.append(item + " ");
        }
        return buider;
    }
    @GetMapping("")
    public String save1(){
        return "home";
    }
    @PostMapping("/choose")
    public String choose(@RequestParam("condiment") String[] condiment, Model model){
        model.addAttribute("condiment", gettring(condiment));
        return "finished";
    }
}
