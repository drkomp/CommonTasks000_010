package Task_002;

import java.util.Arrays;

/**
 * Created by drkomp on 16.08.2016.
 * 2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 */
public class FindZerros {
    public static int[] getNumZeros(int[] arr){
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)zeroCount++;
        }
        int[] zeroPack = new int[zeroCount];
        int k=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==0) zeroPack[k++]=i;
        }
        return zeroPack;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(FindZerros.getNumZeros(new int[]{2,3,77,0,6,-4,0,324,0,0,0,456,8})));
    }
}
