package sortingproject;
/*
1. Two pointers -> begin & end;
2.Сначала мы проходим массив слева направо
и зацепляем самый "тяжелый" элемент и тянем его на верх.
2.1 После того как прошли на самый верх - уменьшили значение 
указателя "end"
3. Потом мы разворачиваемся и в обратном порядке проходим весь массив.

*/
class CocktailSort extends CreateArrayForSorting{
    private int begin;
    private int end;
    private int arr[];
    private int checker;
    private int temps;
    CocktailSort(){
        super();
        super.createRandomArray();
        //super.createArrayManually();// - if you want
        this.arr = super.returnArray();
        begin = 0;
        end = (length-1);
        checker = 1;
        temps = 0;
    }
    void getCocktailBubbleRight(){
        System.out.print("First out::");
        display();
        
        for(;checker == 1;){
            LeftRightsort();
            display();
            RighLefttsort();
            display();
        }
    }
    void display(){
        System.out.print("Display::");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    void LeftRightsort(){
        checker = 0;
        for(int i = begin; i<end; i++){
            if(arr[i]>arr[i+1]){
                temps = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temps;
                checker = 1;
            }
        }
        getNewEnd();
    }
    void RighLefttsort(){
        checker = 0;
        for(int i = end; i>begin; i--){
            if(arr[i]<arr[i-1]){
                temps = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temps;
                checker = 1;
            }
        }
        getNewBegin();
    }
    int getNewBegin(){
      if(begin <= length/2){
          begin++;
            return begin; 
        }  
      return -1;
    }
    int getNewEnd(){
       if(end >= length/2){
          end--;
          return end;
        }
       return -1;
    }
}