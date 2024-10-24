//package diziler;

public class LetterB {

    public static void main(String[] args) {
        //Yıldızlar(*) ile B harfini oluşturmak
        // [0,0] [0,1] [0,2] [0,3]
        // [1,0]              [1,3]
        // [2,0]              [2,3]
        // [3,0] [3,1] [3,2] [3,3]
        // [4,0]              [4,3]
        // [5,0]              [5,3]
        // [6,0] [6,1] [6,2] [6,3]
        //  i j
        //i'nin 0 olduğu her yerde * olacak
        //i'nin 3 olduğu her yerde * olacak
        //i'nin 6 olduğu her yerde * olacak
        // i=0 || i=3 || i=6

        //j'nin 0 olduğu her yerde * olacak
        //j'nin 3 olduğu her yerde * olacak
        // j=0 || j=3

        //Çift boyutlu array oluşturuyoruz

        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if ((i == 0 || i == 3 || i == 6)) {
                    letter[i][j] = " * ";
                }
                else if ((j == 0 || j == 3)) {
                    if ((j == letter[i].length - 1)) {
                        letter[i][j] = "  * ";  //bir boşluk fazla bırakarak kıvrım verdik
                    }
                    else {
                        letter[i][j] = " * ";
                    }
                }
                else {
                    letter[i][j] = "   ";
                }
            }
        }


        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
