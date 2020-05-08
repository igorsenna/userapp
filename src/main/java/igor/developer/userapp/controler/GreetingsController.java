package igor.developer.userapp.controler;

/*import com.sun.org.apache.xpath.internal.objects.XString;
import igor.developer.userapp.model.Greeting; */
import igor.developer.userapp.model.Greeting;
import igor.developer.userapp.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingsController {

    private static final String template = "Hi %s, I love you";
    private final AtomicLong counter = new AtomicLong();
    private static final String template_2 = "The email is: %s@gmail.com";
    private static final String template_3 = "The email is: %s.%s@gmail.com";
    private static final String template_Sur = "%s surname is %s";

//    @RequestMapping(method = RequestMethod.GET, path = "/user/{name}")
//    public User user(@PathVariable("name") String name){
//        return new User(counter.incrementAndGet(),
//                String.format(template,name),"please insert name/surname", String.format(template_2,name));
//    }
//
//    @RequestMapping(method = RequestMethod.GET, path = "/user/{name}/{surname}")
//    public User user(@PathVariable("name") String name,@PathVariable("surname") String surname){
//        return new User(counter.incrementAndGet(),
//                String.format(template,name),String.format(template_Sur,name,surname), String.format(template_3,name,surname));
//    }

    /*@RequestMapping(method = RequestMethod.GET, path = "/test")
    public User greeting(@RequestParam(value = "name",defaultValue ="World")String name){
        return new User(counter.incrementAndGet(),
                String.format(template,name), String.format(template_2,email));
    }
     */


    @RequestMapping(method = RequestMethod.GET, path = "/")
    public String greeting() {
        return "Please insert name/surname";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/igor")
    public String user() {
        return "Hi Igor, I love you much more, please insert name/surname";
    }


}