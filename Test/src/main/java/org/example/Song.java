package org.example;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Song{
    private final String title;
    private final String artist;
    Set<String> listened = new HashSet<String>();

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public  int howMany(List<String> names){
        int count = 0;
        for(String name : names){
            if(!listened.contains(name.toLowerCase())){
                listened.add(name.toLowerCase());
                count++;
            }
        }
        return count;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
