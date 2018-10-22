package forfiter13.NaviGame;

import java.util.ArrayList;

public class Player
{
    public String name;
    private ArrayList ShipList=new ArrayList<Ship>(8);

    Player(String name, ArrayList shipList){
        setName(name);
        setShipList(shipList);
    }
    public ArrayList getShipList() {
        return ShipList;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setShipList(ArrayList shipList) {
        ShipList = shipList;
    }

    public int searchPoints(int x, int y)// return number od ship in shiplist if was shoted
    {
        for (int i=0;i<getShipList().size();i++)
        {
            if( ((Ship)getShipList().get(i)).shotCheckField(x,y))//((Field)(getShipList().get(i))).shotCheckField(x,y)
                return i+1;
        }
        return 0;
    }
}
