import java.util.*;
class HashTable1 {
    public static void main(String[] args) {
        Hashtable<String,String> hm=new Hashtable<String,String>();

        hm.put("100","Amit");
        hm.put("103","Ravi");
        hm.put("102","Vijay");
        hm.put("101","Rahul");
        
        
        // remove value
        hm.remove("101");

        Enumeration<String> keys = hm.keys();

        while(keys.hasMoreElements()){
            String key = keys.nextElement();

            /* print keys
            System.out.println(keys);*/

            //Print value
            System.out.println(hm.get(key));
        }
        
        


       // Print keys and values
       /*  for(Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }*/


    }
}

