import java.util.*;

class linked_list {

    public static void main(String[] args){
        LinkedList<String> al = new LinkedList<String>();

        al.add("Ravi"); al.add("Vijay");
        al.add("Ravi"); al.add("Ajay");

        Iterator<String> itr = al.iterator();
        System.out.println(al);
    }
}