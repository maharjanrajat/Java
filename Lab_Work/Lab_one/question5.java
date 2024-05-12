class question5 {
    public static void main(String[] args) {

        int[] arr = new int[] {10,20,30,45,15,37,69};
        
        int max = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max)
            max = arr[i];
        }

        System.out.println("Larhest number among the given array is : "+max);
    }
}
