package S14_Thuat_toan_sap_xep.Bai_tap.Minh_hoa_thuat_toan_sap_xep_chen;

public class InsertSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static int[] insertSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = insertSort(list);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
