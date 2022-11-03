package s3.gemastik;

public class Bombing {

    public static void main(String[] args) {

        int result = 0;


        int[] bombCoordinate = {3, 1};
        int[] bombLevels = {5, 5};
        int[] tempResult = new int[bombLevels.length];

        int[][] playersCoordinate = {
                {4, 3},
                {-2, -2},
                {3, -2},
                {3, -4},
                {6, 1},
                {-3, 5},
                {8, 5},
        };

        for (int i = 0; i < bombLevels.length; i++) {

            result = 0;

            int minX = bombCoordinate[0] - bombLevels[i];
            int maxX = bombCoordinate[0] + bombLevels[i];
            int minY = bombCoordinate[1] - bombLevels[i];
            int maxY = bombCoordinate[1] + bombLevels[i];

            for (int j = 0; j < playersCoordinate.length; j++) {

                int x = playersCoordinate[j][0];
                int y = playersCoordinate[j][1];

                if (y == bombCoordinate[1] && (x >= minX && x <= maxX)) {
//                    System.out.printf("%d %d \n", x, y);
                    result++;
                    continue;
                }


                if (x == bombCoordinate[0] && (y >= minY && y <= maxY)) {
//                    System.out.printf("%d %d \n", x, y);
                    result++;
                    continue;
                }

                int a = Math.abs((bombCoordinate[0] - x));
                int b = Math.abs((bombCoordinate[1] - y));
                double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

                if (c <= bombLevels[i]) {
//                    System.out.printf("%d %d \n", x, y);
                    result++;
                }
            }
//
//            System.out.println("");

            tempResult[i] = result;

        }

        for (int i = 0; i < tempResult.length; i++) {
            System.out.println(tempResult[i]);
        }


    }

}
