package forfiter13.NaviGame;

public class OneMastedShip extends Ship {
    Field shipFields;

    OneMastedShip(int x,int y)
    {
       Field shipField= new Field(x,y);
       shipFields=shipField;
    }

    public boolean shotCheckField(int x,int y){
        if(shipFields.shotCheckField(x,y))
            return true;
        return false;
    }
    @Override
    public void setDrowned()
    {
        if(shipFields.getshoted())
            drowned=true;
    }



}
