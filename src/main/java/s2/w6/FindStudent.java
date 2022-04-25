package s2.w6;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Random;

public class FindStudent {

    static ArrayList<Student> students = new ArrayList<>();
    static Faker faker = new Faker();
    static Random random = new Random();

    public static void seedData() {
        for (int i = 1; i < 6; i++) {
            String nim = faker.idNumber().ssnValid();
            String name = faker.name().firstName();
            int age = random.nextInt((22 - 18) + 1) + 18;
            double score = random.nextDouble() * 100;
            students.add(new Student(i, name, age, score));
        }
    }

    public static void main(String[] args) {
        seedData();
        showAllData();
        Student pickedStudent = students.get(binarySearch(2, 0, students.size() - 1));
        System.out.println("");
        System.out.println("Picked Student");
        System.out.printf("Name : %s \n", pickedStudent.getName());
        System.out.printf("NIM : %s \n", pickedStudent.getNim());
        System.out.printf("Age : %d \n", pickedStudent.getAge());
        System.out.printf("Score : %f \n", pickedStudent.getScore());
        System.out.println("==========");
    }

    public static int sequentialSearch(int targetNim) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getNim() == targetNim) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int binarySearch(int targetNim, int left, int right) {

        int middle = (left + right) / 2;

        if (right >= left) {
            if (students.get(middle).getNim() == targetNim) {
                return  middle;
            } else if (students.get(middle).getNim() > targetNim) {
                // actually this will divide a process
                return binarySearch(targetNim, left, middle - left);
            } else {
                // actually this will divide a process
                return binarySearch(targetNim, middle + left, right);
            }
        } else {
            return -1;
        }

    }

    public static void showAllData() {
        for (Student student : students) {
            System.out.printf("Name : %s \n", student.getName());
            System.out.printf("NIM : %d \n", student.getNim());
            System.out.printf("Age : %d \n", student.getAge());
            System.out.printf("Score : %f \n", student.getScore());
            System.out.println("==========");
        }
    }

}
