package S13_Thuat_toan_tim_kiem.Thuc_hanh.Cai_dat_thuat_toan_tim_kiem_nhi_phan_khong_su_dung_de_quy;

public class demo {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }
    static int recursiveBinarySearch(int[] arr,int left, int right, int value){
        int mid = (left + right)/2;
        while (right>left) {
            if (arr[mid] == value) {
                return mid;
            } else if (value > arr[mid]) {
                return recursiveBinarySearch(arr, mid + 1, right, value);
            } else {
                return recursiveBinarySearch(arr, left, mid - 1, value);
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */
    }
}
