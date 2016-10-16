import java.util.Arrays;
import java.util.Random;

/**
 * Created by Leshiy on 02.10.2016.
 */
public class program {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        MatrixTest mt = new MatrixTest();
        mt.init();
        try {
            mt.matrixTest();
        }
        catch (AssertionError e){
            System.out.println("Testing error");
            return;
        }
        mt.delete();
        System.out.println(matrix.calculate(matrix.getMasiv()));
    }
}

