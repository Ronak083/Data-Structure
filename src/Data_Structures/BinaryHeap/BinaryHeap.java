package Data_Structures.BinaryHeap;

public class BinaryHeap {
    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int size){
        arr = new int[size-1];
        this.sizeOfTree = 0;
        System.out.println("Binary Heap has been created");
    }

    public boolean isEmpty(){
        if (sizeOfTree ==0){
            return true;
        } else return false;
    }
    public Integer peek(){
        if (isEmpty()){
            System.out.println("Binary heap is Empty");
            return null;
        }
        return arr[1];

    }
}
