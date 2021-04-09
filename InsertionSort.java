
import java.util.Scanner;

public class InsertionSort {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan banyak data: ");
        
        int N = in.nextInt();
        int data [] = new int[N];
        
        for(int i=0;i<N;i++){
            System.out.print("Data ke-"+(i+1)+": ");
            data[i] = in.nextInt();
        }
        
        //proses insertion sort
        for(int i=1;i<data.length;i++){
            int key = data[i];
            int j=i;
            while(j>0 && data[j-1] > key){
                data[j]=data[j-1];
                j--;
            }
            data[j] = key;
        }
        //Hasil pengurutan
        System.out.println("Data yang telah terurut: ");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
