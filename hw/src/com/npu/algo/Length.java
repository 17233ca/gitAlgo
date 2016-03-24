package com.npu.algo;


/**
 * File Name: Length.java
 *
 *
 * @author Jagadeesh Vasudevamurthy
 * @year 2015
 */

class Length {

    private static final IntUtil u = new IntUtil();
    private static boolean debug = true;
    //static int l=0;

    private static int length_easy(int[] s, int x) {
        int l = 0;
        int gx = x;
        while (true) {
            if (s[x] == gx) {
                return l;
            }
            x = s[x];
            ++l;
        }
    }

    private static int length(int[] s, int x) {

        return recursion(s, x, 0);
    }

    private static int recursion(int[] s, int x, int count) {

        int gx = x;
        return recursion2(s, x, gx, count);

    }

    private static int recursion2(int[] s, int x, int gx, int count) {
  
        if (s[x] == gx) {
            return count;
        } else {
            x = s[x];
            count++;
            return recursion2(s, x, gx, count);
        }
    }

	// YOU CANNOT CHANGE ANYTHING BELOW
    // ALL ASSERTS MUST PASS
    public static void testbed() {
        int s[] = {5, 1, 0, 4, 2, 3}; // declared an array
        int y = length_easy(s, 3);
        System.out.println("length_easy y = " + y);
        u.myassert(y == 4);
        int b[] = {5, 1, 0, 4, 2, 3};
        int x = length(s, 3);
        System.out.println("length x = " + x);
        u.myassert(x == y);
        for (int i = 0; i < s.length; ++i) {
            u.myassert(s[i] == b[i]);
        }
        System.out.println("Assert passed");
    }

    public static void testbed1() {
        int s[] = {5, 1, 0, 4, 2, 3};
        int b[] = {5, 1, 0, 4, 2, 3};
        int l = s.length;
        for (int j = 0; j < l; ++j) {
            System.out.println("---------------------j = " + j + " ------------------");
            int y = length_easy(s, j);
            System.out.println("length_easy y = " + y);
            int x = length(s, j);
            System.out.println("length x = " + x);
            u.myassert(x == y);
            for (int i = 0; i < s.length; ++i) {
                u.myassert(s[i] == b[i]);
            }
            System.out.println("---------------------Assert passed--------------------");
        }
    }

    public static void main(String[] args) {
        System.out.println("Length.java");
        testbed();
        testbed1();
    }
}
