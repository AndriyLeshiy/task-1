import java.util.Random;

public class Matrix {
    private int masiv[][] = new int[4][4];

    public int[][] getMasiv() {
        return masiv;
    }

    Random random = new Random();
    public Matrix(){
       for(int i=0;i<4;i++){
           for(int j=0;j<4;j++){
               masiv[i][j] = random.nextInt(21) - 10;
           }
       }
    }

    public int calculate(int mas[][]){
        int suma = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] < 0) {
                    suma+=mas[i][j];
                }

            }
        }
        return suma;
    }
}
