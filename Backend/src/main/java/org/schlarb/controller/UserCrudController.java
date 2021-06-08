package org.schlarb.controller;


import org.schlarb.model.User;
import org.schlarb.service.UserCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserCrudController {

//    public ResponseEntity<Object>

    @Autowired
    private UserCrudService userCrudService;


//    @GetMapping("/user/id/{id}")
//    public User getUserById


    @PostMapping("/user")
    public User addUser(@RequestBody User user){
//        return userCrudService.addUser(user);
        User resUser = userCrudService.addUser(user);
//        resUser.setPassword(null); //need to make sure lombok isnt conflicting with my setter
        return resUser;
    }


    //needs pw auth... to dangerous to be implmented without some safeguard
//    @PutMapping("/user")
//    public User updateUser(User user) {
//        User resUser = userCrudService.updateUser(user);
//        resUser.setPassword(null); //lombok
//        return resUser;
//    }

    @GetMapping("/user/id/{userId}")   //returns user info
    public User getUserByUserId(int userId) {
        // TODO Auto-generated method stub
        User resUser = userCrudService.getUserById(userId);
//        resUser.setPassword(null); //need to make sure lombok isnt conflicting with my setter
        return resUser;
    }

    //needs pw verification - too dangerous to implement without safeguard
//    @DeleteMapping ("/user/{userId}")
//    public void deleteUser(int userId) {
//        // TODO Auto-generated method stub
//        userCrudService.deleteUser(userId);
//
//    }






//    @PutMapping
//
//    @PostMapping
//
//    @DeleteMapping

//    @PostMapping("/login")
//    //this needs to take a username and pw...
//    //and return full user (no pw?)
//    public User loginUser(String username, String password){
//
//        //i could get by username, then get by pw...
//        //
//    }

//
//    public User addUser(@RequestBody User user){
////        return userCrudService.addUser(user);
//        User resUser = userCrudService.addUser(user);
//        resUser.setPassword(null); //this works, thanks to lombok
//        //disregard the above red text!!!
//        return resUser;
//    }


}
