/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Данный проект посвящен учению об использовании сортировок. 
Здесь будут разобраны самые легки и самые сложные виды сортировок
всем, кому нужна помощь -> смотрите, учитесь, понимайте вместе со мной :)
*/
package sortingproject;
import java.util.Scanner;
/**
 *
 * @author DonViktorash
 * @author WinterMute
 */
public class SortingProject {
    public static void main(String[] args) {
       System.out.println("Hello Github!");
       Scanner in = new Scanner(System.in);
       int ins;
       System.out.println("Insert:");
       ins = in.nextInt();
       switch(ins){
           case 1:
                BubbleSort1 bSort = new BubbleSort1(); 
                bSort.start();
            break;
           case 2:
               System.out.println("Open");
               CocktailSort cSort = new CocktailSort();
               cSort.getCocktailBubbleRight();
               break;
           case 3:
               Selection s = new Selection();
               s.test();
               break;
           default:
               System.out.println("Default");
               break;
       }
    }
}
