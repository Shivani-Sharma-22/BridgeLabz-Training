package leetcodecodebase;

import java.util.Scanner;

public class cntMaxPosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(maximumCount(nums));
    }
    public static int maximumCount(int[] nums) {
        int positive=0;
        int negative=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negative=negative+1;
            }
            if(nums[i]>0){
                positive=positive+1;
            }
         }
        int ans = Math.max(positive,negative);
        return ans;
        
    }
}
