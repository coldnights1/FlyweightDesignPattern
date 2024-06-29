
public class HumanRobot implements Robots{
    //name and size does not change
    private String symbol; //lets say this is heavy
    private String name;
    private  int sizeOfRobot;
    HumanRobot(String name,int sizeOfRobot,String symbol){
        this.name=name;
        this.sizeOfRobot=sizeOfRobot;
        this.symbol=symbol;
    }
    public void PlaceRobot(int x, int y, String[][] grid){
        if(this.name == "HUMAN") grid[x][y]=this.symbol;
        else if(this.name=="ANIMAL") grid[x][y]=this.symbol;
        else grid[x][y]=null;
    }

}
