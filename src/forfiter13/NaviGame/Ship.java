package forfiter13.NaviGame;

abstract public class Ship implements Drowned, shotCheckField
{
   protected boolean drowned;
    @Override
    public String toString() {
        StringBuilder out =new StringBuilder();
        out.append("Abstract Class Ship");
        return out.toString();
    }
}
