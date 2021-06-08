package org.schlarb.service.Impl;


import org.schlarb.exception.SchlarbException;
import org.schlarb.model.Artist;
import org.schlarb.model.User;
import org.schlarb.repository.ArtistRepository;
import org.schlarb.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArtistServiceImp implements ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    public Artist addArtist(Artist artist){
        return artistRepository.save(artist);
    }
    public Artist update(Artist artist){
        return artistRepository.save(artist);

    }
    public Artist getArtistById(int id){
        Optional<Artist> optional = artistRepository.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        else{
            throw new SchlarbException("No user with id "+id+".");
        }
    }
    public void deleteUser(int id){
    artistRepository.deleteById(id);
    }
    //need a delete by name?


}
