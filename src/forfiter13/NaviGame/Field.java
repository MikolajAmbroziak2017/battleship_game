package forfiter13.NaviGame;

public class Field
{
    private int x;
    private int y;
    private boolean shoted=false; // if shoted function return true, else return false

    Field(int x, int y) {
        setX(x);
        setY(y);
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    private void setX(int x) {
        this.x = x;
    }
    private void setY(int y) {
        this.y = y;
    }
    private void setShoted(boolean shoted) {
        this.shoted = shoted;
    }
    public boolean getshoted(){
        return shoted;
    }
    public boolean shotCheckField(int x, int y)
    {
        if(getX()==x&&getY()==y) {
            setShoted(true);
            return true;
        }
        else return false;
    }
    @Override
    public String toString() {
        StringBuilder out =new StringBuilder();
        out.append(getshoted()).append(getX()).append(getY());
        return out.toString();
    }}