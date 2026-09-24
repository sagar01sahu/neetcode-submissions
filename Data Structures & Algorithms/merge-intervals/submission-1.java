class Solution {
    public class Pair implements Comparable<Pair>{
        int start;
        int last;
        Pair(int start,int last){
            this.start=start;
            this.last=last;
        }
        public int compareTo(Pair p){
            if(p.start==this.start)
            return Integer.compare(this.last,p.last);
            
            return Integer.compare(this.start,p.start);
        }
    }
    public int[][] merge(int[][] intervals) {
        List<Pair> l=new ArrayList<>();
        List<Pair> res=new ArrayList<>();
        for(int[] i:intervals){
            l.add(new Pair(i[0],i[1]));
        }
        Collections.sort(l);
        
        int j=0; 
        while(j < l.size()){ 
            Pair current = l.get(j);
            int start = current.start;
            int end = current.last;
            
            j++; 
            
            while(j < l.size() && l.get(j).start <= end){ 
                if(l.get(j).last > end){ 
                    end = Math.max(end, l.get(j).last); 
                } 
                j++; 
            } 
            
            res.add(new Pair(start, end)); 
        } 
      
        int[][] arr=new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            arr[i][0]=res.get(i).start;
            arr[i][1]=res.get(i).last;
        }
        return arr;
    }
}
