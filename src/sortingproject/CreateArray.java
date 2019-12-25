package sortingproject;
import java.util.Scanner;
abstract class CreateArrayForSorting{
    private int[] array;
    protected int length;
    Scanner in;
    CreateArrayForSorting(){
        length = 10;
        array = new int[length];
        in = new Scanner(System.in);
    }
    void createRandomArray(){
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*100);
        }
    }
    void createArrayManually(){
        for(int i = 0; i < array.length; i++){
            array[i] = in.nextInt();
        }
    }
    
    protected int[] returnArray(){
        return array;   
    }
}