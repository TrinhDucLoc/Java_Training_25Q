package Recode_001;

public class Q8_nUpCount {
    public static void main(String[] args) {
        System.out.println(nUpCount(new int[]{2,3,1,-6,8,-3,-1,2}, 5));
    }

    static int nUpCount(int[] a, int n) {
        int previousSum = a[0];
        int currentSum = 0;
        int count = 0;
        for(int i=1; i<a.length; i++) {
            currentSum = previousSum + a[i];
            if(previousSum <= n && currentSum > n) {
                count++;
            }
            previousSum = currentSum;
        }
        return count;
    }
}
