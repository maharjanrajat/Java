import java.util.*;

class Treeset {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Ravi"); 
        ts.add("Vijay");
        ts.add("Ravi");
        ts.add("Ajay");

        Iterator<String> itr = ts.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
