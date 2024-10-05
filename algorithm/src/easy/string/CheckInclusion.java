package easy.string;

import java.util.HashMap;
import java.util.Map;

public class CheckInclusion {
    
    public static void main(String[] args) {
        System.out.println(checkInclusion("hello", "ooolleoooleh"));
    }
    
    public static boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        char[] s1Array = s1.toCharArray();
        for (char c : s1Array) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int i = 0;
        int j = s1.length();
        String temp;
        while(j < s2.length() + 1) {
            int found = 0;
            temp = s2.substring(i,j);
            for (int n = 0; n < s1.length(); n++) {
                if (temp.contains(String.valueOf(s1.charAt(n)))) {
                    found++;
                } else {
                    break;
                }
            }
            if (found == s1.length()) return true;
            i++;
            j++;
        }
        return false;
    }
}
