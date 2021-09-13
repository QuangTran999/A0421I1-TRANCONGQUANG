package S14_Thuat_toan_sap_xep.Thuc_hanh.Minh_hoa_thuat_toan_sap_xep_noi_bot;

public class BubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = bubbleSort(list);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
