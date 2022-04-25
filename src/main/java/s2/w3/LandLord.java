package s2.w3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LandLord {

    static ArrayList<Land> lands = new ArrayList<>();
    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How much land you wanna buy : ");
        int totalLand = scanner.nextInt();
        fillTheLand(totalLand);

        int widest = lands.stream().sorted().collect(Collectors.toList()).get(0).getWide();
        System.out.printf("The widest land you have is : %d", widest);

    }

    public static void fillTheLand(int total) {

        for (int i = 0; i < total; i++) {
            System.out.printf("Land %d \n", (i + 1));
            Land tempLand = new Land();
            System.out.print("Length : ");
            int length = scanner.nextInt();
            tempLand.setLength(length);
            System.out.print("Width : ");
            int width = scanner.nextInt();
            tempLand.setWidth(width);
            tempLand.setWide(width * length);
            lands.add(tempLand);
        }

    }



}
