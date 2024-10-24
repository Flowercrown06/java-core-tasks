import java.util.Arrays;
public class Letter {
    public static void main(String[] args) {
        String[][] kv = new String[15][16];
        for (int i = 0; i < kv.length; i++) {
            for (int j = 0; j < kv[i].length; j++) {
                if (i == 0 || i == 14) {
                    kv[i][j] = " # ";
                } else if (j == 0 || j == 15) {
                    kv[i][j] = " # ";
                } else {
                    kv[i][j] = "   ";
                }
            }
        }
        for (String[] row : kv) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
        /*

        * * * * *
        *
        *   * * *
        *       *
        * * * * *

        [0,0] [0,1] [0,2] [0.3] [0,4] [0,5]
        [1,0]
        [2,0]       [2,2] [2,3] [2,4] [2,5]
        [3,0]                         [3,5]
        [4,0] [4,1] [4,2] [4,3] [4,4] [4,5]

    */