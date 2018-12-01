package danghuy.deptrai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ChayNgayDiController {

    @GetMapping
    public String chayDiMa(){

        return "hihi.jsp";
    }
}
