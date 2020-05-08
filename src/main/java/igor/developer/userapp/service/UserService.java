package igor.developer.userapp.service;


import igor.developer.userapp.model.User;
import igor.developer.userapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.List;
import java.util.Optional;

@Service
@EnableWebMvc
public class UserService {
    @Autowired
    private UserRepository userRepository;

//    public User createUser(User user){
//        return userRepository.save(user);
//    }
//    public User createUser(long id, User userProfile){
//        return userRepository.save(userProfile);
//}

    public User createUser(User userProfile){
        return userRepository.save(userProfile);
    }

    public User GetUser(String id) throws Exception {
        Optional<User> optionalUser = userRepository.findById(id);

        if(!optionalUser.isPresent())
            throw new Exception("Customer Record is not available...");

        return optionalUser.get();
    }

    public List<User> ListUser(){
        return userRepository.findAll();
    }

    public User updateUser(long id, User userProfile){
        return  userRepository.save(userProfile);
    }
}
