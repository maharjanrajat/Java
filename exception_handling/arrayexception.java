class arrayexception {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5};

        try{
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae.toString());
        }
        finally{
            System.out.println("Program completed");
        }
    }
}
