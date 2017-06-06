package Java_BigInteger;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger X = in.nextBigInteger();
        BigInteger Y = in.nextBigInteger();
        System.out.println(X.add(Y));
        System.out.println(X.multiply(Y));
    }
}
