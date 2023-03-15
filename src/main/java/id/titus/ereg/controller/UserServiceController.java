package id.titus.ereg.controller;

import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;

import id.titus.ereg.model.User;
import id.titus.ereg.service.UserService;

@RestController
@RequestMapping("/user")
public class UserServiceController {
    private UserService userService;

    private Logger logger=LoggerFactory.getLogger(UserServiceController.class);


    //Note: The @Named("bookService") is not required in this example (as there only instance of BookService around)
    @Inject
    public UserServiceController(@Named("bookService") UserService userService )
    {
        this.userService=userService;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public User getBook(@PathVariable("id") String id) {
        logger.debug("Provider has received request to get person with id: " + id);
        return userService.getUser(id);
    }

    @RequestMapping(value = "/add",  method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public User addBook(@RequestBody User user)
    {
        return userService.addUser(user);
    }
}
