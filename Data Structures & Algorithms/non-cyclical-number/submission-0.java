class Solution {
    public static int getnext(int n){
    int total=0;
    while(n>0){
      int temp=n%10;
      total+=temp*temp;
      n=n/10;
    }
    return total;
  }
    public boolean isHappy(int n) {
        Set<Integer> s1=new HashSet<>();
     while(n!=1 && !s1.contains(n)){
       s1.add(n);
       n=getnext(n);
     }
     return n==1;
    }
}
