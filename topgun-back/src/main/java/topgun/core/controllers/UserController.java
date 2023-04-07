package topgun.core.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import topgun.core.model.dtos.UserRegistrationDto;
import topgun.core.repositories.UserRepository;
import topgun.core.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @PostMapping("/users/authenticate")
    public HttpStatus authenticate(@RequestParam String username, @RequestParam String password) {
        userService.authenticate(username,password);
        return HttpStatus.OK;
    }

    @PostMapping("/users/register")
    public HttpStatus register(@RequestBody UserRegistrationDto user) {
        userService.register(user);
        return HttpStatus.OK;
    }
}
