package Data_Structures.LinkedList.Questions;
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(2);
        ll.insertNode(3);
        ll.insertNode(2);
        ll.insertNode(4);
        ll.insertNode(3);
        ll.insertNode(7);
        ll.insertNode(5);
        ll.traversalLL();

        Questions q = new Questions();

        //Delete Duplicates
        //q.deleteDups(ll);
        //ll.traversalLL();

        //return Nth to Last
        //System.out.println(q.nthToLast(ll,2).value);

        //Partition
        LinkedList t = q.partition(ll,4);
        t.traversalLL();
    }


}
