import org.junit.Assert;
import org.junit.Test;


public class Test1test {

    @Test
    public void testAdd() {
        Test1 test1 = new Test1();
        int c = test1.add(5,6);
        Assert.assertEquals(c, 11);
    }

    @Test
    public void testSubtract() {
        Test1 test1 = new Test1();
        int c = test1.subtract(6,5);
        Assert.assertEquals(c, 1);
    }
}
