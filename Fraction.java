import java.lang.reflect.Array;
import java.util.*;

public class Fraction {
    Fraction(){
    }
    public String toStrin(char[] ss){
       String s = Arrays.toString(ss) ;
       return s ; 
    }

}
class Main{
    public static void main(String[] args) {

        char[] charArr = new char[] { 'g', 'e', 'e', 'k', 's' };
        Fraction fr = new Fraction();
        String o = fr.toStrin(charArr).replace(" ", "").replace(",", "").replace("]", "").replace("[", "");
        System.out.println("String : "+o);
    }
}