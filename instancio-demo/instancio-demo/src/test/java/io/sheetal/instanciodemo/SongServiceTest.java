package io.sheetal.instanciodemo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

class SongServiceTest {
    @InjectMocks

    private SongService songService;

    @Mock
    private SongRepository songRepository;

    @Test
    void addSong() {

        Song song = new Song(

                1L,

                "Song Title",

                "Artist",

                "album",

                3,

                "album cover url",

                "Lyrics",

                "LyricsURL",

                "downloadUrl",

                null

        );
        when(songRepository.save(ArgumentMatchers.any(Song.class))).thenReturn(song);
        var actual = songService.addSong(song);
        System.out.println(actual);


    }


}