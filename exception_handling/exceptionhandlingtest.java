class exceptionhandlingtest{

    public static void main(String[] args){

        int a = 5;
        int b = 0;
        int result;

        try{
            result = a/b;
            System.out.println(result);
        }
        catch(ArithmeticException ae){
            System.out.println("Divide by zero exception occurred!!!");
        }
        finally{
            System.out.println("Program completed!!");
        }
    }
}
