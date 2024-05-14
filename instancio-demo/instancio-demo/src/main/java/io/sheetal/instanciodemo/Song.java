package io.sheetal.instanciodemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public record Song(

        @Id
        Long songId,

        String title,

        String artist,

        String album,

        int duration,

        String albumCover,

        String lyrics,

        String lyricsUrl,

        String downloadUrl,

        Integer version

) {

}
