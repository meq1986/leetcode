package com.maeq.leetcode;

// https://leetcode.com/problems/roman-to-integer/

/*
- 罗马数字的所在位置 没有权 概念
- 必须自左向右 读数 ， 其他读法是没有意义的
- 从左到右 做加法
 */
/*
    参考网上方案 想到的一些改进的点
    - if else 结构比较冗余 使用swith case结构 逻辑更加清晰
    - 编译器会对switch结构进行优化 swith case结构比if else 效率更高一些
    - 还有常见的一种方案 用hashmap 将判断条件作为key 结构上看也更加简洁
 */

public class RomanToInteger {

    /*
    *   使用了 swith case  语句 时间居然变大了
    *   理论上 swith case 应该比ifelse 更高效才对
    *
    *   将最后一个条件 更改为default 运行时间 变为 5ms
     *  Runtime: 8 ms
     *  Memory Usage: 45 MB
     */
    public int romanToInt(String s) {
        if(null == s || s.length() == 0){
            return 0;
        }

        int cnt = 0;

        for(int i=0;i<s.length();){
            switch(s.charAt(i)){
                case 'I':
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
                    break;
                case 'V':
                    cnt += 5;
                    i++;
                    break;
                case 'X':
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
                    break;
                case 'L':
                    cnt +=50;
                    i++;
                    break;
                case 'C':
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
                    break;
                case 'D':
                    cnt += 500;
                    i++;
                    break;
                default:   // M
                    cnt += 1000;
                    i++;
//                    break;
            }
        }

        return cnt;
    }

    // 原始的 第一版方案
    /*
     *    Runtime: 3 ms
     *    Memory Usage: 41.9 MB
     */
    /*
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
     */

}
