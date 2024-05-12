import java.util.*;
class testemp {
    
    public static void main(String args[]){

        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Your identification?");
        System.out.println("Enter 1 for full_time and 2 for part_time programmer:");
        choice = sc.nextInt();

        if (choice ==1){
            full_time ft = new full_time();
            int sal = ft.calculateSalary();
            System.out.println(sal);
        } else{
            part_time ft = new part_time();
            int sal = ft.calculateSalary();
            System.out.println(sal);
        }
    }
}
