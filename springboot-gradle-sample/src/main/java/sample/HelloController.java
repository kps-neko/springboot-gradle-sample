package sample;
import java.util.Locale;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/test")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }

	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String hello2(Locale locale, Model model) {
		String message = "サンプル<br/>サンプル";
		model.addAttribute("thymeleaf", message );
		return "test";
	}
}