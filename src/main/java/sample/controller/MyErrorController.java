package sample.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error(HttpServletResponse res) {
        if (404 == res.getStatus()) {
            return "error/404";
        }

        return "error";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
}