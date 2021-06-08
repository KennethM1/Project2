package org.schlarb.service;

import org.schlarb.model.User;

public interface UserCrudService {
    //I do not think I need an artist searchService...
    public User addUser(User user);
    public User updateUser(User user);
    public User getUserById(int id);
    public void deleteUser(int id);

}
