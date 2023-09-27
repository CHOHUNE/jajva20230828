package LeetCode;

import java.util.Stack;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        int[] temp = new int[arr.length];
        int tempnum=0;
        for (int i = 0; i < queries.length; i++) {
           int s = queries[i][0];
           int e = queries[i][1];
           int k = queries[i][2];

            for( int j=s ; j<=e;j++){
                if( j%k==0){
                  tempnum=arr[j]++;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            temp[i]=arr[i];
        }

        return temp;
    }
}