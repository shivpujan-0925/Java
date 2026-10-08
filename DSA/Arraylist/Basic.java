import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {   
      
        //(Java collection framework)
        ArrayList<Integer> list = new ArrayList<>();          //ArrayList syntax.
        ArrayList<Integer> list2 = new ArrayList<>();       
         
        //operation: Add
        list.add(1);   //O(n)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
          
        // list.add(0,10);   //at index '0' add value of '10'.   || T.C : O(n)
        // System.out.println(list);
        // System.out.println(list.size());  //SIZE of ArrayList.


        //Print ArrayList
        for(int i = 0; i < list.size(); i++){
            // System.out.print(list.get(i) + " ");
        } 
        // System.out.println();
        

        //reverse print.
        for(int i = list.size()-1; i >=0; i--){
            System.out.print(list.get(i) + " ");
        } 

        
        //Get operation:
        // int element = list.get(4);
        // System.out.println(element);

        //remove operation:
        // list.remove(2);
        // System.out.println(list);

        //Set element.
        // list.set(2, 10);
        // System.out.println(list);
        

        //check containing element
        // System.out.println(list.contains(2));
        // System.out.println(list.contains(12));
    }
}
