package com.stackroute.MuzixApp.domain;

import javax.persistence.*;
@Entity
public class Track {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   
    @ApiModelProperty(value = "track Id for each track")
    private int trackId;
    @ApiModelProperty(value = "Track name")
    private String trackName;

    @ApiModelProperty(value = "Comments for the Tracks")
    private String trackComments;

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getTrackComments() {
        return trackComments;
    }

    public void setTrackComments(String trackComments) {
        this.trackComments = trackComments;
    }
}
