package com.halodu;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

import com.google.appengine.api.datastore.DatastoreService;

import lombok.extern.slf4j.Slf4j;

@EnableOAuth2Sso
@Controller
@Slf4j
public class HomeController {

    /** Do something with the app engine datastore... */
    private final DatastoreService datastoreService;

    @Autowired
    public HomeController(DatastoreService datastoreService) {
        this.datastoreService = Objects.requireNonNull(datastoreService);
    }

    /**
     * Home page -> {@literal /WEB-INF/jsp/index.jsp}
     * 
     * @return home page view.
     */
    @RequestMapping("/")
    public ModelAndView home(ModelAndView modelAndView, Principal principal) {
        LOGGER.info("Loading home page..." + principal);
        modelAndView.addObject("user", principal);
        modelAndView.setViewName("index");
        return modelAndView;
    }
}
