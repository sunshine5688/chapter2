package spring.cloud.chapter2.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication(scanBasePackages = "spring.cloud.chapter2.*")
@Controller
@RequestMapping("/chapter2")
public class Chapter2Application {
    public static void main(String[] args) {
        SpringApplication.run(Chapter2Application.class,args);
    }

    public ModelAndView index(ModelAndView mav, @PathVariable("value") String value){
        mav.getModelMap().addAttribute("key",value);
        mav.setViewName("index");
        return mav;
    }

}
