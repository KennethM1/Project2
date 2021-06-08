package org.schlarb.service.Impl;


import org.schlarb.exception.SchlarbException;
import org.schlarb.model.User;
import org.schlarb.repository.UserRepository;
import org.schlarb.service.UserSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSearchServiceImp implements UserSearchService {
    @Autowired
    private UserRepository schlarbUserRepository;

    @Override
    public List<User> getAllUsers()
    {
        return schlarbUserRepository.findAll();
    }

    @Override
    public User getUserByUsername(String name){
        return schlarbUserRepository.findByUsername(name);
    }

    public User loginUser(String username, String password){
        User user = schlarbUserRepository.findByUsername(username);
        if (user.getPassword().equals(password)){
            return user;
        }
        else throw new SchlarbException("Password does not match user credentials. Check your password and username and try again");
    }


//    public List<User> getUsersByArtist(Artist artist) {
//        return userRepository.findByArtist(Artist artist);
//    } //this may be problematic...

//    @Override
//    public List<User> getUsersByName(String name){
//        return schlarbUserRepository.findByUsername(name);
//    }
    //WIP   ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //these need fixing; put shouldnt require a ful user object as an input...
    //or at least, should not save that entire object if it comes in void...



//    @Override
//    public List<User> getUserByFirstName(String firstName) {
//        // TODO Auto-generated method stub
//        return userRepository.findByUserFirstName(firstName);
//    }
//
//    @Override
//    public List<User> getUserByLastName(String lastName) {
//        // TODO Auto-generated method stub
//        return userRepository.findByUserLastName(lastName);
//    }


//    @Override
//    public List<User> getUserByEmail(String email) {
//        // TODO Auto-generated method stub
//        return userRepository.findByUserEmail(email);
//    }










}
