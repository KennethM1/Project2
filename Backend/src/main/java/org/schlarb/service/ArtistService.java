package org.schlarb.service;

import org.schlarb.model.Artist;
import org.schlarb.model.User;

public interface ArtistService {

    //crud
    public Artist addArtist(Artist artist);
    public Artist update(Artist artist);
    public Artist getArtistById(int id);
    public void deleteUser(int id);


}
