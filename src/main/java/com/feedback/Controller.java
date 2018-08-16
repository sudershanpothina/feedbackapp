package com.feedback;

import com.feedback.model.Feedback;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {
    private static final Logger LOGGER = LogManager.getLogger(Application.class);

    @GetMapping(value = "/feedback")
    public String greetingForm(Model model) {
        model.addAttribute("feedback", new Feedback());
        LOGGER.info("get request acknowledged");
        return "feedback";
    }
    @PostMapping(value = "/feedback")
    public String greetingSubmit(@ModelAttribute Feedback feedback) {
        System.out.println(feedback.getContent());
        LOGGER.info("post request acknowledged");
        return "result";
    }
}
