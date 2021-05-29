package Map;

import java.util.*;

/* in array 10,7,8,5,4,3,2 --> 2,3,4,5 are continous so the output is 4
which ever sub array has longest sequence is returned
 */
public class Question_1 {
    public static void main(String[] args) {
        int arr [] = {10,5,9,1,11,8,6,15,13,12,2};
        HashSet<Integer> myset = new HashSet<>();

        for( int i: arr)
            myset.add(i);

        Iterator itr = myset.iterator();
        int count =1, max_length=0,temp=0;
        for( int value : arr){
            while(myset.contains( value + count)){
                temp++;
                count++;
            }
            max_length=Math.max(max_length,temp);
            temp=0;count=1;
        }

        System.out.print(max_length);

    }
}
