package forfiter13.NaviGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList list1= new ArrayList<Ship>();
        ArrayList list2= new ArrayList<Ship>();
       Main m= new Main();
        String name1=m.readName("imie gracza pierwszego");
        m.addOneMast(list1);
     //   m.addTwoMast(list1);
    //    m.addThreeMast(list1);
    //    m.addFourMast(list1);

        String name2=m.readName("imie gracza drugiego");
        m.addOneMast(list2);
    //    m.addTwoMast(list2);
      //  m.addThreeMast(list2);
    //    m.addFourMast(list2);
System.out.println("TESTOWY 1:\n \n \n");
                for (Object i :list1)
                {
                    System.out.println(i);
                }
System.out.println("TESTOWY 2:\n\n\n");
        Player player1=new Player(name1,list1);
        Player player2=new Player(name2,list2);
        Game newGame=new Game(player1,player2);


    }

    public int readPoint(String i){
        System.out.println("podaj "+i);
        Scanner reading=new Scanner(System.in);
        return reading.nextInt();
    }


    public String readName(String i){
        System.out.println("podaj "+i);
        Scanner reading=new Scanner(System.in);
        return reading.nextLine();
    }


    public void addOneMast(ArrayList<Ship> list){
        Main m = new Main();
        OneMastedShip one = new OneMastedShip(readPoint("x jednomasztowca"), m.readPoint("y jednomasztowca"));
        list.add(one);
    }

    public void addTwoMast(ArrayList list){
        Main m=new Main();
        int[] x = new int[2];
        int[] y = new int[2];
        for (int i = 0; i < x.length; i++)
        {
            x[i]=m.readPoint("x"+(i+1));
            y[i]=m.readPoint("y"+(i+1));
        }
        TwoMastedShip two = new TwoMastedShip(x, y);
        list.add(two);
    }



    public void addThreeMast(ArrayList list){
        Main m=new Main();
        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < x.length; i++)
        {
            x[i]=m.readPoint("x"+(i+1));
            y[i]=m.readPoint("y"+(i+1));
        }
        ThreeMastedShip three = new ThreeMastedShip(x, y);
        list.add(three);
    }

    public void addFourMast(ArrayList list){
        Main m=new Main();
        int[] x = new int[4];
        int[] y = new int[4];
        for (int i = 0; i < x.length; i++)
        {
            x[i]=m.readPoint("x"+(i+1));
            y[i]=m.readPoint("y"+(i+1));
        }
        FourMastedShip four = new FourMastedShip(x, y);
        list.add(four);
}

}
