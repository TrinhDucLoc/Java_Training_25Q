package AllQuestion;

public class Q101_isSequencedArray {
    public static void main(String[] args) {
        System.out.println(isSequencedArray(new int[]{2, 2, 3, 4, 4, 4, 5}, 2, 5));
        System.out.println(isSequencedArray(new int[]{2, 2, 3, 5, 5, 5}, 2, 5));
        System.out.println(isSequencedArray(new int[]{0, 2, 2, 3, 3}, 2, 3));
        System.out.println(isSequencedArray(new int[]{1, 1, 3, 2, 2, 4}, 1, 4));
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 3, 4, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2));
        System.out.println(isSequencedArray(new int[]{0, 1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 2, 3, 4}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1, 2, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{5, 4, 3, 2, 1}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1},1,1));
    }

    static int isSequencedArray(int[] a, int m, int n) {
        if(a[0] != m || a[a.length-1] != n || m > n) {
            return 0;
        }

        for(int j=0; j<a.length-1; j++) {
            int flagContainNum = 0;
            //ascending order
            if(a[j] > a[j+1] && j < a.length-1) {
                return 0;
            }
            // array ascending order and contain only those integers
            if((a[j] == a[j+1]) && j < a.length-1) {
                flagContainNum = 1;
            } else if(a[j] == a[j+1] -1 && j < a.length-1) {
                flagContainNum = 1;
            }
            if(flagContainNum == 0) {
                return 0;
            }
        }

        return 1;
    }
}

// array from m to n
// array ascending order and contain only those integers
// array return 1 if true and 0 if false