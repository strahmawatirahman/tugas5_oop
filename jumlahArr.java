import java.util.Scanner;
public class jumlahArr {

    public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);
	int n=4;
       int[] array = new int[n];
       int sum = 0;
       System.out.println("Masukan 10 Nilai Elemen Dalam Array :");
       for (int i=0; i<=n; i++)
       {
        array[i] = scanner.nextInt();
       }
       for( int num : array) {
           sum = sum+num;
       }
       System.out.println("Jumlah Dari Semua Elemen Array Adalah :"+sum);
    }
 }
