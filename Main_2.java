package org.example;

// 배열 안의 값의 총 합 , 평균 출력
public class Main_2 {
    public static void main(String[] args) {

        int a = 10;

        String s = "안녕"; //객체

        int[] arr = new int[3];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);

        System.out.println(arr.length);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // int sum = arr[0] + arr[1] + arr[2];
        int avg = sum / arr.length;

        System.out.println("총합: " + sum);//(arr[0] + arr[1] + arr[2])
        System.out.printf("총합: %d\n", sum);

        System.out.println("평균: " + avg); //(arr[0] + arr[1] + arr[2])/3
        System.out.printf("평균: %d\n", avg);


    }
}