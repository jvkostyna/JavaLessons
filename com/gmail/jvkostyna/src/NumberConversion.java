import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
public class NumberConversion{
    static final String INT_NEGATIVE = "(-)+[0-9]+";
    static final String INT_POSITIVE = "[0-9]+";
    static final String DOUBLE_NEGATIVE = "(-)+[0-9]+\\.[0-9]+";
    static final String DOUBLE_POSITIVE = "[0-9]+\\.[0-9]+";
    public static void main(String[] args){
        ArrayList<Integer>  arrayList = new ArrayList<Integer>(2);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(1,7);
        System.out.println(arrayList.indexOf(6));
        arrayList.remove(1);
        System.out.println(arrayList.indexOf(6));

    }

    public static String toString(int x){
        StringBuilder sb = new StringBuilder();
        int tempInt = (x<0) ? -x:x;
        if (x == Integer.MIN_VALUE){
            return "-2147483648";
        }for(int a=tempInt; a>0; a/=10){
            sb.insert(0, a % 10);
        }
        return (x<0) ? "-"+ sb.toString():sb.toString();

    }
    public static int toInt(String str){
        boolean sign = (str.charAt(0) == '-') ? true: false;
        String tempString;
        if ("-2147483648".equals(str)  ){
            return Integer.MIN_VALUE;
        }
        int conversInt = 0;
        if (sign) {
            tempString = str.substring(1);
        }else{
            tempString = str;
        }
        for (int i = 0; i < tempString.length(); i++){
            conversInt += Character.digit(tempString.charAt(i),10)*Math.pow(10,tempString.length()- 1- i);
        }
        return  (sign) ? -conversInt:conversInt;
    }
    public static String toString(double value){
        if (value == 0){
            return "0.0";
        }
        StringBuilder strDouble = new StringBuilder();
        double tempValue = (value<0) ? -value:value;
        double wholePartValue = Math.floor(tempValue);
        long intermediateValue,tempLong;
        int grade = 0;
        int comma = 0;
        while (!((tempValue-wholePartValue) == 0)){
            grade++;
            tempValue *=10;
            wholePartValue = Math.floor(tempValue);
        }
        intermediateValue = (long)(Math.abs(value)*Math.pow(10, grade));
        tempLong = intermediateValue;
        for (long i = tempLong; i > 0 ; i/=10){
            if (comma == grade){
                strDouble.insert(0, '.');
                strDouble.insert(0, i % 10);
            }else
                strDouble.insert(0, i % 10);
            comma++;
        }
        return   (value<0) ? "-"+ strDouble.toString():strDouble.toString();
    }

    public static double toDouble(String str){
        return Double.parseDouble(str); //new Double(str);
    }
}