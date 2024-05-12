import java.util.*;

class SortingArrayInArrayList {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Kathmandu");
        al.add("Pokhara");
        al.add("Butwal");

        System.out.println("Before sorting :" + al);
        Collections.sort(al);

        System.out.println("After sorting :" +al);

        System.out.println("Before sorting :" + al);
        Collections.sort(al,Collections.reverseOrder());

        System.out.println("After sorting :" +al);
    }
}


