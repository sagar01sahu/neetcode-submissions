class Solution {
    public double myPow(double x, int n) {
        double res=1;
        int z=0;
        if(n<0)
         z=-n;
        else
        z=n;
        for(int i=0;i<z;i++){
            res*=x;
        }
        if(n<0)
        return (double)1/res;
        else
        return res;
    }
}
