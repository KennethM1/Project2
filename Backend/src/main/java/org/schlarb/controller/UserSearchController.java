package org.schlarb.controller;


import org.schlarb.model.Artist;
import org.schlarb.model.User;
import org.schlarb.service.ArtistService;
import org.schlarb.service.UserCrudService;
import org.schlarb.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserSearchController {
    @Autowired
    private UserSearchService userSearchService;
    @Autowired
    private UserCrudService userCrudService;
    @Autowired
    private ArtistService artistService;

    //use mostly for username?
    @GetMapping("/")
    public String noThanks() {
        return "This is not that type of server, kindly bugger off.";
    }
    //need to write a function to get by userId and PW...

    @GetMapping("/user/username/{username}")   //returns user info
    public User getUserByUserId(String username) {
        User resUser = userSearchService.getUserByUsername(username);
        resUser.setPassword(null);
        return resUser;
    }


    @GetMapping("/users")
    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        return userSearchService.getAllUsers();
    }


    //WIP ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @PostMapping("/login")
    public User addUser(@RequestBody User user) {  //requires constructor!
        //call login function
        //needs try-catch... error handling should use advice though...
        User reqUser = userSearchService.loginUser(user.getUsername(), user.getPassword());
        //if this goes badly, must throw error
        //else return user
        return reqUser;
    }


    //add an artist
    @PostMapping("/user/artist/username/{username}")
    public User addArtistToUser(@RequestBody Artist artist, @PathVariable String username) {
        User user = userSearchService.getUserByUsername(username);
        System.out.println(user);
        System.out.println(artist);
        if (user.containsArtist(artist)){

        }
        else{
            artistService.addArtist(artist);
            user.addArtist(artist);
            userCrudService.updateUser(user);
            //fixme artists not connected to users
        }
        return user;
    }


}



