package net.javaguides.thymeleaf.controller;

import net.javaguides.thymeleaf.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    //handler method to handle variable expression request
    //http:localhost:8080/variable-expression
    @GetMapping("/variable-expression")
    public String variableExpression(Model model){
        User user = new User( "fele ayodeji", "feledeji@gmail.com" ,"male" , "ADMIN");
        model.addAttribute("user" , user);
        return "variable-expression";

    }

    //handler method to handle variable expression request
    //http:localhost:8080/selection-expression
    @GetMapping("/selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("fele ayodeji", "feledeji@gmail.com", "male", "ADMIN");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    //handler method to handle variable expression request
    //http:localhost:8080/message-expression
    @GetMapping("/message-expression")
    public String messageExpression() {
        return "message-expression";
    }

    //handler method to handle link expression request
    //http:localhost:8080/link-expression
    @GetMapping("/link-expression")
    public String linkExpression(Model model) {
        model.addAttribute("id" ,1);
        return "link-expression";
    }

    //handler method to handle fragment expression request
    //http:localhost:8080/fragment-expression
    @GetMapping("/fragment-expression")
    public String frgamentExpression(){
        return "fragment-expression";
    }


    //handler method to handle users request (itearation)
    //http:localhost:8080/users
    @GetMapping("/users")
    public String users(Model model) {
        // Create three User objects as seen in the image
        User admin = new User("Admin", "admin@gmail.com", "ADMIN", "Male");
        User ramesh = new User("Ramesh", "ramesh@gmail.com", "USER", "Male");
        User meena = new User("Meena", "meena@gmail.com", "USER", "FEMALE");

        // Create the list and add the users (lines 57-60)
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(ramesh);
        users.add(meena);

        // Add the list to the model under the attribute name "users"
        model.addAttribute("users", users);

        // Return the name of the Thymeleaf template
        return "users";
    }


    //http:localhost:8080/if-unless
    @GetMapping("/if-unless")
    public String ifUnless(Model model) {
        // Create three User objects as seen in the image
        User admin = new User("Admin", "admin@gmail.com", "male", "ADMIN");
        User ramesh = new User("Ramesh", "ramesh@gmail.com", "male", "ADMIN");
        User meena = new User("Meena", "meena@gmail.com", "female", "USER");

        // Create the list and add the users
        List<User> users = new ArrayList<>();
        users.add(admin);
        users.add(ramesh);
        users.add(meena);

        // Add the list to the model under the attribute name "users"
        model.addAttribute("users", users);

        // Return the name of the Thymeleaf template
        return "if-unless";
    }

    //http:localhost:8080/switch-case
    @GetMapping("/switch-case")
    public String switchCase(Model model) {
        //Creating a User object and setting the role to 'ADMIN'
        User user = new User(
                "Ramesh",
                "ramesh@gmail.com",
                "male",
                "ADMIN"

        );

        //Add the single User object to the model
        model.addAttribute("user", user);

        //Return the name of the Thymeleaf template view
        return "switch-case";
    }

}
