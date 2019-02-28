package example.micronaut

import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.MediaType

@CompileStatic
@Controller("/hello") // <1>
class HelloController {
    @Get("/") // <2>
    @Produces(MediaType.TEXT_PLAIN) // <3>
    String index() {
        "Hello World" // <4>
    }

    @Get("/{name}")
    public String greet(String name) {
        return "Hiya " + name;
    }


    @Get("/color/{name}")
    public String getColor(String name) {
        return "Your eyes are " + name;
    }

}
