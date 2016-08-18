package Task_001;

import java.util.Arrays;

/**
 * Created by drkomp on 15.08.2016.
 * 1. Дан массив натуральных чисел. Найти сумму элементов, кратных данному K.
 */
public class Sum {
    //1. Дан массив натуральных чисел. Найти сумму элементов, кратных данному K.
    public static long getSumArrayK(int[] array1, int k){
        Long rez = 0L;
        for(int i=0;i<array1.length;i++ ){
            if(array1[i]%k == 0)rez+=array1[i];
        }
        return rez;
    }
    public static void main(String[] args){
        int[] arr = {10,45,66,4,14,9,18,55,6,33};
        int k=11;
        System.out.println("Сумма элементов массива "+Arrays.toString(arr)+" кратных "+k+" равна "+getSumArrayK(arr,k));

    }
}
