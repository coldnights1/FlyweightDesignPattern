// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //flyweight design pattern
        int n=10,m=10;
          String grid[][]=new String[n][m];
          RobotFactory robotFactory=new RobotFactory();
          for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                   if((i+j)%2==0) {
                       Robots robot = robotFactory.createNewRobot("HUMAN", 10,"H");
                       robot.PlaceRobot(i,j,grid);
                   }
                   else{
                       Robots robot=robotFactory.createNewRobot("ANIMAL",100,"A");
                       robot.PlaceRobot(i,j,grid);
                   }
               }
          }
          for(int i=0;i<n;i++){
               for(int j=0;j<m;j++){
                   System.out.print(grid[i][j]+" ");
               }
               System.out.println(" ");
          }
    }
}