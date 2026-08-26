class Solution {
    class Pair implements Comparable<Pair>{
        int data;
        int substract;
        Pair(int data,int substract){
            this.data=data;
            this.substract=substract;
        }
        public int compareTo(Pair p){
            if(p.substract==this.substract)
            return Integer.compare(this.data,p.data);
            return Integer.compare(this.substract,p.substract);
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr){
            pq.add(new Pair(i,Math.abs(x-i)));
            while(pq.size()>k){
                pq.remove();
            }
        }
        List<Integer> l=new ArrayList<>();
        while(!pq.isEmpty()){
            Pair res=pq.poll();
            l.add(res.data);
        }
        Collections.sort(l);
        return l;

    }
}