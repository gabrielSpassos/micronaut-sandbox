package example.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.Secured;

import java.security.Principal;

@Secured("isAuthenticated()")
@Controller("/")
public class HomeController {

    @Get("/")
    String index(Principal principal) {
        return principal.getName();
    }
}
