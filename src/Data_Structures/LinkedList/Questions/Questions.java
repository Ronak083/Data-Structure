package Data_Structures.LinkedList.Questions;

import java.util.HashSet;

public class Questions {
    void deleteDups(LinkedList ll){
        HashSet<Integer> set = new HashSet<>();
        Node Current = ll.head;
        Node prev = null;
        while(Current != null){
            int curval = Current.value;
            if (set.contains(curval)){
                prev.next = Current.next;
                ll.size--;
            } else{
                set.add(curval);
                prev = Current;
            }
            Current = Current.next;
        }
    }

    Node nthToLast(LinkedList ll, int n ){
        Node back = ll.head;
        Node forw = ll.head;

        for (int i =0; i<n;i++){
            if(forw == null) return null;
            forw = forw.next;
        }
        while (forw != null){
            back = back.next;
            forw = forw.next;
        }
        return back;
    }

    LinkedList partition(LinkedList ll, int x){
        Node currNode = ll.head;
        ll.tail = ll.head;
        while(currNode != null){
            Node next = currNode.next;
            if(currNode.value< x){
                currNode.next = ll.head;
                ll.head = currNode;
            }else {
                ll.tail.next  = currNode;
                ll.tail = currNode;
            }
            currNode = next;
        }
        ll.tail.next = null;
        return ll;
    }
}
