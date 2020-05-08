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


//    @RequestMapping(method = RequestMethod.POST, path = "/users")
//    public User createUser() {
//        //User user = new User();
//        u.setId(15);
//        u.setName("Pedrooooooo");
//        u.setSurname("Silva");
//        u.setEmail("pedro@silva.com");
//        userService.createUser(u);
//
//        return u;
//    }

//    @PostMapping("/user/{id}")
//    @CrossOrigin
//    public User createUser(@PathVariable("id") long id, @RequestBody User userProfile){
//            long id_User = userProfile.getId();
//            String  name = userProfile.getName();
//            String  surname = userProfile.getSurname();
//            String  email = userProfile.getEmail();
//            System.out.println("The User id numeber is: " + id_User + "\n The User Name is: " + name + "\n The User Surname is: " + surname + "\n The User Email is: " + email);
//            return userService.createUser(id, userProfile);
//    }

    @PostMapping("/user")
    @CrossOrigin
    public User createUser(@RequestBody User userProfile){
        return userService.createUser(userProfile);
    }

    //@RequestMapping(method = RequestMethod.GET, path = "/user/{id}")
    @GetMapping("/users")
    @CrossOrigin
    public List<User> ListUser(){
        return userService.ListUser();
    }

    @GetMapping("/user/{id}")
    @CrossOrigin
    public User GetUser(@PathVariable("id") String id) throws Exception {
        System.out.println("rtyui");
        return userService.GetUser(id);
    }

//    @GetMapping("/user/{id}")
//    @CrossOrigin
//    public User GetUser(@PathVariable("id") long id, @RequestBody User getuserProfile){
//        long id_User = getuserProfile.getId();
//        String  name = getuserProfile.getName();
//        String  surname = getuserProfile.getSurname();
//        String  email = getuserProfile.getEmail();
//        getuserProfile.setId(getuserProfile.getId());
//        getuserProfile.setName(getuserProfile.getName());
//        getuserProfile.setSurname(getuserProfile.getSurname());
//        getuserProfile.setEmail(getuserProfile.getEmail());
//        System.out.println("The User id numeber is: " + id_User + "\n The User Name is: " + name + "\n The User Surname is: " + surname + "\n The User Email is: " + email);
//        return userService.GetUser(id, getuserProfile);
//    }

//    @PostMapping("/user/{id}")
//    @CrossOrigin
//    public User updateUser(@PathVariable("id") long id, @RequestBody User userProfile){
//        long id_User = userProfile.getId();
//        String  name = userProfile.getName();
//        String  surname = userProfile.getSurname();
//        String  email = userProfile.getEmail();
//        //String str = id_User +"";
//        //System.out.format("The User id numeber is: %s  ", str);
//        //System.out.println("The User id numeber is: " + id_User);
//        System.out.println("The User id numeber is: " + id_User + "\n The User Name is: " + name + "\n The User Surname is: " + surname + "\n The User Email is: " + email);
//        return userService.updateUser(id, userProfile);
//    }
//
}