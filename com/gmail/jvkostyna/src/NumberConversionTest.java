import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class NumberConversionTest extends TestCase
{   static int[] arrayInt = {12,1356,-2147483648,2147483647};
    static String[] arrayStringInt = {"12","1356","-2147483648","2147483647"};
    static double[] arrayDouble = {1.125,999.999,3.66666666666999,-1234.99,9999999999.99999};
    static String[] arrayDoubleString = {"1.125","999.999","3.66666666666999","-1234.99","9999999999.99999"};
    @Test
    public static void testToStringInt(){
        //System.out.println("************");
        for (int i = 0; i < arrayInt.length;i++)
        {
            assertEquals(arrayStringInt[i], NumberConversion.toString(arrayInt[i]));

        }
    };

    @Test
    public static void testToInt(){
        for (int i = 0; i < arrayStringInt.length;i++)
        {
            assertEquals(arrayInt[i], NumberConversion.toInt(arrayStringInt[i]));
        }
    };
    @Test
    public static void testToStingDouble(){
        for (int i = 0; i < arrayDouble.length;i++)
        {
            assertEquals(arrayDoubleString[i], NumberConversion.toString(arrayDouble[i])/*, Math.abs(arrayDouble[0] - Double.valueOf(NumberConversion.toString(arrayDouble[0])))*/);

        }
    };

}