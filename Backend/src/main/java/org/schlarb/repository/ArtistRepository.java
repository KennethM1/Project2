package org.schlarb.repository;

import org.schlarb.model.Artist;
import org.schlarb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

    public List<Artist> findByName(String name);
    //that should be all I need here...
//    public List<User> findByUsername(String name);

}
