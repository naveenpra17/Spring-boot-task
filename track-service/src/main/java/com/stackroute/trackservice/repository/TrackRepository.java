package com.stackroute.trackservice.repository;

import com.stackroute.trackservice.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * this is an interface which extends JpaRepository interface which has its own methods which we can use in our project
 * this is also useful for interfacing our project with the database
 */
public interface TrackRepository extends JpaRepository<Track,Integer>{

    /**
     * @param track this is the name of the track which we want to search
     * @return returning the list of tracks for the given track name
     */
    @Query("select track1 from Track track1 where track1.track like ?1")//this  is an user defined query
    public List<Track> findByTrack(String track);
}
