package String;

import java.util.*;

public class frequency {
    String s1 = "Hello";System.out.println(s1);
    String s2 = "Hello";System.out.println(s2);

    int[] frequency = new int[256];for(
    int i = 0; i<s2.length();i++)
    {
        frequency[s2.charAt(i)]++;
    }

    for(
    int i = 0;i<frequency.length;i++)
    {
        if (frequency[i] > 0) {
            System.out.println((char) i + ": " + frequency[i]);
        }
    }
}