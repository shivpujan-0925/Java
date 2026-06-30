package Problems;
public class ShortestPath {
    
    public static float getShortestDist(String path){

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
      int X2 = x_cordinate*x_cordinate;
      int Y2 = y_cordinate*y_cordinate;

       return  (float)Math.sqrt(X2 + Y2);


    }

    public static void main(String[] args) {
        String path = "NSEESNWWWSSSSSSSNNNNWWWWSEWEW";
       System.out.println( getShortestDist(path));
    }
}
