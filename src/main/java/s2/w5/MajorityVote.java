package s2.w5;

import java.util.HashMap;

public class MajorityVote {

    public static HashMap<String, Integer> candidates = new HashMap<String, Integer>();
    public static HashMap<Integer, String> mapCandidates = new HashMap<Integer, String>();
    public static int[] votes = {1, 2, 1, 3, 4, 1, 1, 1};

    public static void seedData() {
        candidates.put("Haris", 0);
        candidates.put("Dian", 0);
        candidates.put("Rani", 0);
        candidates.put("Bisma", 0);

        mapCandidates.put(1, "Haris");
        mapCandidates.put(2, "Dian");
        mapCandidates.put(3, "Rani");
        mapCandidates.put(4, "Bisma");
    }

    public static void main(String[] args) {

        seedData();

        divide(votes, votes.length);

        for (int i = 0; i < votes.length; i++) {
            String votedCandidates = mapCandidates.get(votes[i]);
            candidates.computeIfPresent(votedCandidates, (k, v) -> v + 1);
        }

        for (String key : candidates.keySet()) {
            System.out.printf("%s : %d \n", key, candidates.get(key));
        }



    }

    public static void divide(int[] payload, int n) {

        if (n > 2) {
            int middle = n / 2;
            int[] left = new int[middle];
            int[] right = new int[n - middle];

            // Filling the left
            for (int i = 0; i < middle; i++) {
                left[i] = payload[i];
            }

            // filling the right
            for (int j = middle; j < n; j++) {
                right[j - middle] = payload[j];
            }

            divide(left, middle);
            divide(right, n - middle);

            merge(payload, left, right, middle, n - middle);

        }

    }

    public static void merge(int[] payload, int[] left, int[] right, int leftIndex, int rightIndex) {

        int i = 0, j = 0, k = 0;

        while (i < leftIndex && j < rightIndex) {

            if (left[i] <= right[j]) {
                payload[k++] = left[i++];
            } else {
                payload[k++] = right[j++];
            }

        }


        while (i < leftIndex) {
            payload[k++] = left[i++];
        }
        while (j < rightIndex) {
            payload[k++] = right[j++];
        }

    }


}
