package igor.developer.userapp.controler;

import igor.developer.userapp.model.User;
import igor.developer.userapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
@RestController
public class UserController {
    @Autowired
    private UserService userService;

 User u = new User();
 User user = new User();

    @GetMapping("/users")
    @CrossOrigin
    public List<User> ListUser(){
        return userService.ListUser();
    }

    @GetMapping("/user/{id}")
    @CrossOrigin
    public User GetUser(@PathVariable("id") String id) throws Exception{
        return userService.GetUser(id);
    }

    @PostMapping("/user")
    @CrossOrigin
    public User createUser(@RequestBody User userProfile){
        return userService.createUser(userProfile);
    }

    @PutMapping("/user/{id}")
    @CrossOrigin
    public User updadeUser(@PathVariable("id") String id, @RequestBody User userProfile){
        return userService.updateUser(id, userProfile);
    }

    @DeleteMapping("/user/{id}")
    @CrossOrigin
    public void deleteUser(@PathVariable("id") String id){
        userService.deleteUser(id);
    }
}