public class AssignARef {
    public static void main(String[] args) {
        int[] nums1 = new int[10];
        int[] nums2 = new int [10];

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i;
        }

        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = -i;
        }

        System.out.println("Array nums1:");

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }

        System.out.println();

        System.out.println("Array nums2:");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }

        nums2 = nums1;

        System.out.println();

        System.out.println("Array nums2:");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }

        nums2[3] = 99;

        System.out.println();

        System.out.println(nums1[3]);
    }
}
