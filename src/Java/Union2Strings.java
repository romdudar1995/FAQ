package Java;

import java.util.Set;
import java.util.TreeSet;

public class Union2Strings {

	public static void IntersectionOfStrings() {
        String s1 = "XYZYYP";
        String s2 = "YZOPP";
        Set setChars = new TreeSet();
        char c[] = s1.toCharArray();

        for(char x : c) {
            if(s2.indexOf(x)!=-1) {
                setChars.add(x);
            }
        }
        System.out.println(setChars.toString());
    }
}