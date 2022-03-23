package com.maeq.leetcode;

// https://leetcode.com/problems/roman-to-integer/

public class RomanToInteger {

    public int romanToInt(String s) {
        if(null == s || s.length() == 0){
            return 0;
        }

        int cnt = 0;

        for(int i=0;i<s.length();){

            if(s.charAt(i) == 'I'){

                if(i+1<s.length() && s.charAt(i+1) == 'V' ){
                    cnt += 4;
                    i += 2;
                }else if( i+1 < s.length() && s.charAt(i+1) == 'X' ){
                    cnt += 9;
                    i += 2;
                }else{
                    cnt += 1;
                    i ++;
                }


            }else if(s.charAt(i) == 'V'){
                cnt += 5;
                i++;
            }else if(s.charAt(i) == 'X'){

                if(i+1<s.length() && s.charAt(i+1) == 'L' ){
                    cnt += 40;
                    i += 2;
                }else if( i+1 < s.length() && s.charAt(i+1) == 'C' ){
                    cnt += 90;
                    i += 2;
                }else{
                    cnt += 10;
                    i ++;
                }

            }else if(s.charAt(i) == 'L'){
                cnt +=50;
                i++;
            }else if(s.charAt(i) == 'C'){

                if(i+1<s.length() && s.charAt(i+1) == 'D' ){
                    cnt += 400;
                    i += 2;
                }else if( i+1 < s.length() && s.charAt(i+1) == 'M' ){
                    cnt += 900;
                    i += 2;
                }else{
                    cnt += 100;
                    i ++;
                }
            }else if(s.charAt(i) == 'D'){
                cnt += 500;
                i++;
            }else if(s.charAt(i) == 'M'){
                cnt += 1000;
                i++;
            }


        }

        return cnt;
    }

}
