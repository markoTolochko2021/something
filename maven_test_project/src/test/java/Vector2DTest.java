import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {

    private final double EPS = 1e-9;
    private static Vector2D v1;
    @BeforeClass
    public static void createNewVector(){
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLength(){
        Assert.assertEquals(0, v1.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroXAndZeroY(){
        Assert.assertEquals(0, v1.getX(), EPS);
        Assert.assertEquals(0,v1.getY(), EPS);
    }




}
