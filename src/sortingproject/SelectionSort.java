package sortingproject;;

class Selection extends CreateArrayForSorting{
    int[] arr;
    int begin;
    Selection(){
        super();
        super.createRandomArray();
        this.arr = super.returnArray();
        begin = 0;
    }
    void test(){
        for(; begin<arr.length; begin++){
            display();
            int i = begin;
            int temps = 0;
            while(i < arr.length){
                if(arr[begin] > arr[i]){
                    temps = arr[begin];
                    arr[begin] = arr[i];
                    arr[i] = temps;
                }
                i++;
            }
        }
    }
    void display(){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
}