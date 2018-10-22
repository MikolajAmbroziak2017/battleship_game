package forfiter13.NaviGame;

public class FourMastedShip extends Ship {
    Field[] shipFields= new Field[4];

    FourMastedShip(int[] x,int[] y)
    {
        for(int i=0;i<x.length;i++){
            Field shipField= new Field(x[i],y[i]);
            shipFields[i]=shipField;
        }
    }

    @Override
    public boolean shotCheckField(int x, int y) {
        return false;
    }

    @Override
    public void setDrowned() {
        for(int i=0;i<shipFields.length;i++)
        {
            if (shipFields[i].getshoted())
                drowned = true;
            else
                drowned=false;
            break;
        }
    }
}
