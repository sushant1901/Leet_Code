package com.company;
import java.util.*;
class Solution4 {
    public int fib(int n) {
        return nthFib(n,new HashMap<Integer,Integer>());
    }
    private int nthFib(int n,HashMap<Integer,Integer> memo){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int currentKey=n;

        if(memo.containsKey(n))
            return memo.get(currentKey);

        int a= nthFib(n-1,memo);
        int b= nthFib(n-2,memo);

        memo.put(currentKey,a+b);
        return(a+b);
    }
}