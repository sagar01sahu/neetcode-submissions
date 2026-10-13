/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        List<Interval>l=new ArrayList<>(intervals);
        Collections.sort(l,(a,b)-> a.start-b.start);
        if(l.size()==0)
        return true;
        Interval g=l.get(0);
        int start=g.start;
        int end=g.end;
        for(int i=1;i<l.size();i++){
            Interval p=l.get(i);
            if(p.start<end){
                return false;
            }
            else{
                start=p.start;
                end=p.end;
            }
        }
        return true;

    }
}
