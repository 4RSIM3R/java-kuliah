package s3.gemastik;

import java.util.ArrayList;
import java.util.Collections;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Anagram {
    static ArrayList<String> temps = new ArrayList<String>();
    static ArrayList<Integer> results = new ArrayList<Integer>();
    static String payload;


    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int min = Integer.MAX_VALUE;

        payload = sc.next();

        int intPayload = Integer.parseInt(payload);
        int size = payload.length();

        anagram(payload, 0, size - 1);

        for (String temp : temps) {
            int intTemp = Integer.parseInt(temp);
            int diff = Math.abs((intPayload - intTemp));

            if(diff < min) {
                min = diff;
            }
        }


        System.out.println(min);
    }

    public static void anagram(String str, int start, int end)
    {
        if (start == end)
            if (temps.contains(str) || str.equals(payload)) {
//                System.out.println("Idem");
            } else {
                temps.add(str);
            }
        else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                anagram(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}


class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            if (st.hasMoreTokens()) {
                str = st.nextToken("\n");
            } else {
                str = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
