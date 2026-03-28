package Problems;
public class ShortestPath {
    
    public static double getShortestDist(String path){
        int n = path.length();
        int x = 0, y = 0;
        for(int i = 0; i<n; i++){
            char Dir = path.charAt(i);
            //East
            if(Dir == 'E'){
                x++;
            }
            //west
            if(Dir == 'W'){
                x--;
            }

            //North
            if(Dir == 'N'){
                y++;
            }

            //South
            if(Dir == 'S'){
                y--;
            }
       
        }
        double shortestDist = x*x + y*y;
        double res = Math.sqrt(shortestDist);
        return res;
    }

    public static void main(String[] args) {
        String path = "WNEENESSSENNN";
       System.out.println( getShortestDist(path));
    }
}
