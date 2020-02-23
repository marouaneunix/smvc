package ma.naf.cinatis.web;

import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping(value = "/v1/cinatis")
public class HomeController {

    @GetMapping
    public String index(Model model) {
        System.out.println();
        model.addAttribute("now", LocalDateTime.now());
        return "index";
    }

    @GetMapping("/path")
    public String path(@RequestParam("petId") List<Integer> petId) {
        for (Integer integer : petId) {
            System.out.println("ok "+integer);
        }
        return "index";
    }
}
