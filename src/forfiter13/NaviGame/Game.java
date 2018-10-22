package forfiter13.NaviGame;

public class Game {
    Game(Player player1,Player player2){
        boolean noend=true;
    do{
Main m=new Main();
int x=m.readPoint("x");
int y=m.readPoint("y");
System.out.println("TESTOWY GAME 1");
        Round player1Round=new Round(player1,player2,x,y);
        System.out.println("TESTOWY GAME 2");
        System.out.println(player1Round.toString());
        if(player1Round.endGame)
            noend=false;
        x=m.readPoint("x");
        y=m.readPoint("y");
        Round player2Round=new Round(player2,player1,x,y);
        System.out.println(player2Round.toString());
        if(player2Round.endGame)
            noend=false;
        }while (noend);

    }
}
class Round{
    int shotTry;
    boolean drownedCheck=false;
    boolean endGame=false;
    String winnerName;
    Round(Player shotingPlayer,Player shotedPlayer,int x,int y)
    {
        //System.out.println("GTEST0:\nshottry-"+shotTry+"\nDrownecheck-"+drownedCheck+"\nendgame-"+endGame+"\nwinnerName-"+winnerName);
         shotTry = shotedPlayer.searchPoints(x,y); // if shotTry == 0 is miss, else shotTry is shipnumber on list+1
      //  System.out.println("GTEST1:\nshottry-"+shotTry+"\nDrownecheck-"+drownedCheck+"\nendgame-"+endGame+"\nwinnerName-"+winnerName);
       if(shotTry>0) {
           ((Ship)(shotedPlayer.getShipList().get(shotTry-1))).setDrowned();
        //   System.out.println("GTEST3:\nshottry-"+shotTry+"\nDrownecheck-"+drownedCheck+"\nendgame-"+endGame+"\nwinnerName-"+winnerName);
           drownedCheck = ((Ship) (shotedPlayer.getShipList().get(shotTry-1))).drowned;
        //   System.out.println("GTEST4:\nshottry-"+shotTry+"\nDrownecheck-"+drownedCheck+"\nendgame-"+endGame+"\nwinnerName-"+winnerName);
           if (drownedCheck)
               shotedPlayer.getShipList().remove(shotTry-1);
       }
     //   System.out.println("GTEST5:\nshottry-"+shotTry+"\nDrownecheck-"+drownedCheck+"\nendgame-"+endGame+"\nwinnerName-"+winnerName);
       if (shotedPlayer.getShipList().isEmpty())
       {
       System.out.println("Lista statków jestpusta");
           endGame=true;
           winnerName=shotingPlayer.getName();
       }
     //   System.out.println("GTEST6:\nshottry-"+shotTry+"\nDrownecheck-"+drownedCheck+"\nendgame-"+endGame+"\nwinnerName-"+winnerName);
    }
    public String toString() {
        StringBuilder out = new StringBuilder();
        if (shotTry > 0)
            out.append("TRAFIONY ");
        if (drownedCheck)
            out.append("ZATOPIONY!!");
        if (endGame == true) {
            out.append("WYGRYWA " + winnerName + " GRATULACJE!!!!");
        }
            return out.toString();

        }
    }