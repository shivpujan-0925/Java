package Problems;
public class ShortestPath {
    
    public static double getShortestDist(String path){

       int x_cordinate = 0;    //origin
       int y_cordinate = 0;
       
       for(int i = 0; i < path.length(); i++){
          char Dir = path.charAt(i);   //check for direction.

          //Dir - North(y-cordinate)
          if(Dir == 'N'){
              y_cordinate++;
          }

          //Dir- South
          if(Dir == 'S'){
              y_cordinate--;
          }
          
          //Dir- East
          if(Dir == 'E'){
              x_cordinate++;
          }

            //Dir- West
          if(Dir == 'W'){
              x_cordinate--;
          }

       }

        //calculating shortest distance
       double shortestPath = Math.sqrt(x_cordinate*x_cordinate + y_cordinate*y_cordinate);

       return shortestPath;


    }

    public static void main(String[] args) {
        String path = "WNEENESSSENNN";
       System.out.println( getShortestDist(path));
    }
}
