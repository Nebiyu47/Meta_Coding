package Queens;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAveragefromDataStream {

    class MovingAverage{
        private Queue<Integer> window;
        private int maxSise;
        int sum=0;
    public MovingAverage(int size){
        window=new LinkedList<>();
        maxSise=size;
        sum=0;
    }
    public double next(int val){
        if(window.size()==maxSise){
            sum-=window.poll();
        }
        window.offer(val);
        sum+=val;
        return (double) sum/window.size();
    }
    }

}
