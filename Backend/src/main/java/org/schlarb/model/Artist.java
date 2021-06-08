package org.schlarb.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Artist {


//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
    @Id //test this to see if it works...
    @Column(name="Artist_Name", nullable = false)
    private String name;
//    private String url;
//    private String image_url;
//    private String facebook_page_url;
//    private String mbid;
//    private int tracker_count;
//    private int upcoming_event_count;
//    @ManyToMany
//    private List<User> userList;


}

/*
ARTIST_LIST_ARTIST_NAME = connector table

    select userid from artistlist artistname where ?=artistname
    SELECT USERNAME FROM ARTIST_LIST_ARTIST_NAME



 */
