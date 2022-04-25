package s2.quiz1;

import java.util.*;

public class MscApplication {

    public static ArrayList<Album> albums = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            Album tempAlbum = new Album();
            System.out.printf("Input Music : %d\n ", (i + 1));
            System.out.print("Music Title : ");
            tempAlbum.setTitle(scanner.next());
            System.out.print("Artist : ");
            tempAlbum.setArtist(scanner.next());
            System.out.print("Total Sold : ");
            tempAlbum.setTotal(scanner.nextInt());
            System.out.print("Price : ");
            tempAlbum.setPrice(scanner.nextInt());
            albums.add(tempAlbum);
            System.out.println("");
        }

        // instead of writing a looping for sorting, i just using `Comparable` that
        // implemented in Album `POJO`, so Bye, bye looping, welcome declarative programming
        Collections.sort(albums);

        System.out.println("The most `laris` music is : ");
        System.out.printf("Title : %s \n ", (albums.get(0).getTitle()));
        System.out.printf("Artist : %s \n ", (albums.get(0).getArtist()));
        System.out.printf("Total Sold : %d \n ", (albums.get(0).getTotal()));
        System.out.printf("Price : %d \n ", (albums.get(0).getPrice()));
        System.out.printf("Total : %d \n ", (albums.get(0).calculateSale()));

        System.out.println("The most `kurang laku` music is : ");
        System.out.printf("Title : %s \n ", (albums.get(albums.size() - 1).getTitle()));
        System.out.printf("Artist : %s \n ", (albums.get(albums.size() - 1).getArtist()));
        System.out.printf("Total Sold : %d \n ", (albums.get(albums.size() - 1).getTotal()));
        System.out.printf("Price : %d \n ", (albums.get(albums.size() - 1).getPrice()));
        System.out.printf("Total : %d \n ", (albums.get(albums.size() - 1).calculateSale()));


    }

}
