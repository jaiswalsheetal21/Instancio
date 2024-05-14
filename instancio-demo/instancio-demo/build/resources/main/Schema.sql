DROP TABLE IF EXISTS song;

CREATE TABLE song (

                      song_id BIGSERIAL PRIMARY KEY,

                      title varchar(255) NOT NULL, artist varchar(255) NOT NULL,

                      album varchar(255),

                      duration int,

                      album_cover varchar(255),

                      lyrics varchar(255),

                      lyrics_url varchar(255), download_url varchar(255),

                      version int

);