import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSubtract() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 8;
        x.subtract(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }

    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }

    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }

    @Test
    public void equals() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        Rational z = new Rational();
        z.numerator = 1;
        z.denominator = 2;
        boolean a = x.equals(y);
        Assert.assertEquals(false, a);
        boolean b = x.equals(x);
        Assert.assertEquals(true, b);
        boolean c = x.equals(z);
        Assert.assertEquals(true, c);
    }

    @Test
    public void compareTo() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 5;
        Rational y = new Rational();
        y.numerator = 5;
        y.denominator = 2;
        Rational z = new Rational();
        z.numerator = 5;
        z.denominator = 2;
        Assert.assertEquals(-1, x.compareTo(y));
        Assert.assertEquals(0, x.compareTo(x));
        Assert.assertEquals(0, y.compareTo(z));
        Assert.assertEquals(1, y.compareTo(x));
    }

    @Test
    public void itoString() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 5;
        Rational y = new Rational();
        y.numerator = 6;
        y.denominator = 2;

        Assert.assertEquals("1/5", x.toString());
        Assert.assertEquals("3/1", y.toString());
    }
}
