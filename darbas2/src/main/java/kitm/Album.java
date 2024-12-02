package kitm;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;

    private ArrayList<Song> songs = new ArrayList<>();

    public Album(String name, String artist)
    {
        this.name = name;
        this.artist = artist;
    }

    public int getSize()
    {
        return songs.size();
    }

    public Song findSong(String title)
    {
        for (Song i : songs)
        {
            if (i.getTitle().equals(title))
            {
                return i;
            }
        }

        return null;
    }

    public Song findSong(int number)
    {
        if (number <= songs.size())
        {
            return songs.get(number);
        }

        return null;
    }

    public boolean addSong(String title, double duration)
    {
        if (findSong(title) == null)
        {
            songs.add(new Song(title, duration));

            return true;
        }

        return false;
    }

    public boolean addToPlayList(int number, LinkedList<Song> Playlist)
    {
        Song song = findSong(number);

        if (song != null)
        {
            Playlist.add(song);

            return true;
        }

        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> Playlist)
    {
        Song song = findSong(title);

        if (song != null)
        {
            Playlist.add(song);

            return true;
        }

        return false;
    }

}
