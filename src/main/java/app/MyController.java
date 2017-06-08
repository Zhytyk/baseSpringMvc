package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Семья on 08.06.2017.
 */
@RequestMapping("/my")
@Controller
public class MyController {

    private final Logger logger = LoggerFactory.getLogger(MyController.class);

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model uiModel) {
        logger.info("index");
        return "my/index";
    }

    @RequestMapping(value="/me", method = RequestMethod.GET)
    public String me(Model uiModel) {
        logger.info("me");
        return "my/me";
    }

}