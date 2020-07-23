import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static long repeatedString(String s, long n) {
    final long quotient = n/s.length();
    final long remainder = n%s.length();
    long aCount = 0;

    if((s.length() == 1) && (s.charAt(0) == 'a')){
        return n;
    }
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i) == 'a'){
            aCount++;
        }
    }
    aCount = aCount * quotient;
    for(int i=0; i<remainder; i++){
        if(s.charAt(i) == 'a'){
            aCount++;
        }
    }
    return aCount;
}