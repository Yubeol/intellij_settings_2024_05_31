package org.example;

public class Main {
    public static void main(String[] args) {
        // 논리 (true, false) -> boolean
        int a = 10;

        String s = "안녕"; //객체
//        int [ ] arr = new 설계도 (객체를 만들 때에는 설계도 대로 만들기 떄문에 객체를 늘릴 수 없다
//        int [ ] arr -> 지역변수는 스택에 만들어 진다
//        new = 객체(를 만들겠다
//        설계도
        int[] arr = new int[3];
        //내가 설계하지 않았는데 작동이 된다는 것은 이미 내장 되어 있다는 의미
//        int[] 객체를 조작할 수 있는 리모컨
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr[0] + arr[1] + arr[2]  );
    }
}