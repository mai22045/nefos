@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }
}