import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;


public class MatrixTest {
    Matrix testMatrix;

    @Before
    public void init() {
        testMatrix = new Matrix();
    }
    @After
    public void delete(){
        testMatrix = null;
    }

    @Test
    public void matrixTest(){
        int[][] mas1 = {
                {1,2,3,4},
                {1,2,-1,4},
                {1,2,3,4},
                {1,2,3,4}
        };
        assertEquals(-1,testMatrix.calculate(mas1));

        int[][] mas2 = {
                {0,-2,3,-2},
                {1,2,-1,4},
                {1,2,-5,4},
                {1,2,3,-9}
        };
        assertEquals(-19,testMatrix.calculate(mas2));

        int[][] mas3 = {
                {-1,-2,3,-2},
                {1,2,-1,4},
                {1,2,-5,4},
                {1,2,-11,-9}
        };
        assertEquals(-31,testMatrix.calculate(mas3));
    }
}
