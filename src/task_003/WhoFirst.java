package task_003;

/**
 * Created by drkomp on 16.08.2016.
 * 3. Дана последовательность целых чисел a1, a2, ..., an.
 * Выяснить, какое число встречается раньше – положительное или отрицательное.
 */
enum FirstIs{Positive,Negative,AllNumIsZero}

public class WhoFirst {
    public static FirstIs lookingFor(int[] arr){
        FirstIs rezult = FirstIs.AllNumIsZero;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>0){
                rezult = FirstIs.Positive;
                break;
            }
            if(arr[i]<0){
                rezult = FirstIs.Negative;
                break;
            }
        }
        return rezult;
    }

    public static void main(String[] args) {
        System.out.println("First number is "+WhoFirst.lookingFor(new int[]{0,-3,6,0,88,0,0}));
    }
}
