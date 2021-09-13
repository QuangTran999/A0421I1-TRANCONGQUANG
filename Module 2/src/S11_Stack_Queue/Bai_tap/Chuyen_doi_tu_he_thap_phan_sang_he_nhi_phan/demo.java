package S11_Stack_Queue.Bai_tap.Chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;
import java.util.Scanner;

public class demo {
    public static int arr[] = new int[20];
    public static int size=0;
    public static int index=0;

    public static void change10To2(int value10){
        int value2 = 0;
        while (value10>0){
            value2 = value10%2;
            value10 = value10/2;
            arr[index]=value2;
            index++;
            size++;
            value2=0;
        }
    }

    public static void main(String[] args) {
        change10To2(555);
        for (int i = size-1; i >0 ; i--) {
            System.out.println("Change 10 to 2 is: ");
            System.out.printf("%d",arr[i]);
        }
    }
}
