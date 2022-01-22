https://practice.geeksforgeeks.org/problems/ugly-numbers2254/1/#

class Solution {
    long getNthUglyNo(int n) {
        
        TreeSet<Long> t=new TreeSet<>();
        t.add(1l);
        for(int i=0;i<n-1;i++){
            long val = t.pollFirst();
            t.add(val*2);
            t.add(val*3);
            t.add(val*5);
        }
        return t.pollFirst();
    }
}