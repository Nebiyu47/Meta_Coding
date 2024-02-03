package Arrays.Arrays.Medium;

import java.util.HashMap;
import java.util.Map;

public class maximumSwap {
    public static void main(String[] args) {
        System.out.println(maximumSwap(5719));
    }
    public static int maximumSwap(int num){

        char [] digts= Integer.toString(num).toCharArray();

        Map<Character,Integer> lastOccurrrence = new HashMap<>();

        for(int i=0;i<digts.length;i++) {

          lastOccurrrence.put(digts[i],i);
        }



        for(int i=0;i<digts.length;i++){
            for (char d='9';d>digts[i];d--){
                if(lastOccurrrence.containsKey(d)&&lastOccurrrence.get(d)>i){
                    char temp=digts[i];
                    digts[i]=d;
                    digts[lastOccurrrence.get(d)]=temp;
                //  return Integer.parseInt(new String(digts));
                }
            }
        }
        for(int i=0;i<digts.length;i++) {
            for (char d = '9'; d > digts[i]; d--) {
                if (lastOccurrrence.containsKey(d)&&lastOccurrrence.get(d)>i) {
                    System.out.println(digts[i]);
                }
            }
        }
        return -1;
    }
}
