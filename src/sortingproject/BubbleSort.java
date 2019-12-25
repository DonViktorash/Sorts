package sortingproject;
import java.util.Scanner;

class MakeBubbleRight extends CreateArrayForSorting{
    private int flag;
    private int temps;
    private int[] arr;
    MakeBubbleRight(){
        super();
        super.createRandomArray();
        arr = super.returnArray();
        flag = 0;
        temps = 0;
    }
    void getGoodArray(){
        do{
            flag = 0;
            for(int i = 0; i<(arr.length-1); i++){
                //System.out.println("\nSort..");
                if(arr[i] > arr[i+1]){
                    temps = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temps;
                    flag = 1;
                }

            }
        }while(flag != 0);
    }
    void display(){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
    }
}
class BubbleSort1 {
    void start(){
        MakeBubbleRight mbr = new MakeBubbleRight();
        System.out.println("Before Bubble sort");
        mbr.display();
        mbr.getGoodArray();
        System.out.println("\nAfter Bubble sort");
        mbr.display();
    }
}

/*
Если за проход цикла, не было ни одной иттерации в специальную переменную
которая смотрит были ли вообще итерации - выход
*/