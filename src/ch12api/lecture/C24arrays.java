package ch12api.lecture;

import java.util.Arrays;

public class C24arrays {
    public static void main(String[] args) {
        /*Arrays
        equals  동일
        fill    채우기
        sort
        binarySearch 특정 원소의 위치 찾기
        toString
   */
        int[] i =new int[5];
        Arrays.fill(i,5);
        System.out.println(i); // 출력이 참조주소로 나옴
        System.out.println(Arrays.toString(i)); // Arrays.toString 으로 문자 변환 후 출력

        //binarySeacrh  : 2진법 탐색
        // 반으로 쪼개서 범위를 좁혀나가는 search
        // 정렬이 된 상태에서 찾아야 하며
        // 해당 값이 없으면 해당 값이 위치해야하는 인덱스 - 하고 +1 해서 도출한다
    }
}
