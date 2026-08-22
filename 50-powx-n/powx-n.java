class Solution {
    public double myPow(double x, int n) {
        long N =n;
        if(n<0){
            x=1/x;
            N = -N;
        }
        return helper(x,N);
    }
    private double helper(double x,long N){
        if(N==0) return 1;
        double half = helper(x,N/2);
        if(N%2!=0) return x*half*half;
        else return half*half;
    }
}