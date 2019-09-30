import java.util.Scanner;

public class reverse_Elements_Array {
    public static void main(String[] args) {

        int size;
        int [] array;
        Scanner sc =new Scanner(System.in);

        do{
            System.out.println("Enter a size");
            size =sc.nextInt();
            if(size >20){
                System.out.println("Size should not exceed 20");
            }
        }while(size >20);
        //nhap mang
        array =new int[size];
        for(int i =0;i<size;i++){
            System.out.println("enter element "+(i+1)+":");
            array[i] =sc.nextInt();
        }
        //xuat mang
        System.out.println("Porperty list :");
        for (int i =0 ;i<array.length;i++){
            System.out.print(array[i]+ "\t");
        }
        //Đảo ngược mảng  :


        for(int i =0 ;i<array.length/2;i++){
          int temp =array[i];
          array[i] =array[size-1-i];
          array[size -1 -i] =temp;
        }
        //in ra các phần tử  đảo  ngược
       System.out.printf("%-20s%s","Reverse array:",""+"\n");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] +"\t");
        }
    }
}
