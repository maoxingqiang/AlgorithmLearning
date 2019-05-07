package com.company.easy;

/**
 * Created by richardMao on 3/28/19.
 */
public class MissingInteger570 {
        /**
         * Giving a string with number from 1-n in random order, but miss 1 number.Find that number.

         Example
         Example1

         Input: n = 20 and str = 19201234567891011121314151618
         Output: 17
         Explanation:
         19'20'1'2'3'4'5'6'7'8'9'10'11'12'13'14'15'16'18
         Example2

         Input: n = 6 and str = 56412
         Output: 3
         Explanation:
         5'6'4'1'2
         Notice
         n <= 30
         *
         *
         * @param n: An integer
         * @param str: a string with number from 1-n in random order and miss one number
         * @return: An integer
         *
         */
        public int findMissing2(int n, String str) {
            int[] fullArray = new int[n];
            for (int i = n ; i > 0; i--) {
                if (str.indexOf(Integer.toString(i)) == -1) {
                    return i;
                } else {
                    str.replace(Integer.toString(i), "");
                }
            }
            return 0;
        }
}
