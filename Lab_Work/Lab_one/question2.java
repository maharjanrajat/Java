import java.util.Scanner;

class question2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String name;
        int roll;
        float percent;

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your roll no: ");
        roll = sc.nextInt();

        System.out.print("Enter your percentage: ");
        percent = sc.nextFloat();

        System.out.println("Name : "+name+ " " +"Roll Number : "+roll+ " " +"Percentage : "+percent);
    }
}
