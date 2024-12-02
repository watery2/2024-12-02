package kitm;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        LinkedList<String> students = new LinkedList<>();
//
//        students.add("Jonas");
//        students.add("Karolis");
//        students.add("Ieva");
//
//        ListIterator<String> iterator = students.listIterator();
//
//        System.out.println("judam i prieki");
//
//        while (iterator.hasNext())
//        {
//            String item = iterator.next();
//            System.out.println("Dabartinis elementas " + item);
//
//            if(item.equals("Karolis"))
//            {
//                iterator.add("Naujas vardas");
//            }
//        }
//
//        System.out.println("\nNaudojam prev");
//
//        while (iterator.hasPrevious())
//        {
//            String item = iterator.previous();
//            System.out.println("Dabartinis elementas " + item);
//
//            if (item.equals("Ieva"))
//            {
//                iterator.set("Pieva");
//            }
//
//        }
//
//        System.out.println("\nGalutinis sarasas: ");
//
//        for (String i : students)
//        {
//            System.out.println(i);
//        }

        ArrayList<Album> albums = new ArrayList<>();
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        int nr = 0;

        for (Album i : albums)
        {
            nr++;
            System.out.println("--------------------------------");
            System.out.println(nr + " Albumas: ");
            System.out.println("--------------------------------");

            for (int j = 0; j < i.getSize(); j++)
            {
                System.out.println(i.findSong(j).toString());
            }
        }

        LinkedList<Song> playList = new LinkedList<Song>();

        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);

        System.out.println("\nPlaylist");

        for (Song i : playList)
        {
            System.out.println(i.getTitle());
        }


    }
}