public class AnimalRobot implements Robots{

    private String symbol; //lets say this is heavy
    private String name;
    private  int sizeOfRobot;
    AnimalRobot(String name,int sizeOfRobot,String symbol){
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
