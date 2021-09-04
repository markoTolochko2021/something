package test.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Test29 {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1Action = new ArrayList<>();
        friend1Action.add(Action.SNIPERS);
        friend1Action.add(Action.PAPER);
        friend1Action.add(Action.SNIPERS);
        List<Action> friend2Action = new ArrayList<>();
        friend2Action.add(Action.PAPER);
        friend2Action.add(Action.STONE);
        friend2Action.add(Action.STONE);

        new BestFriend("Bob", friend1Action, exchanger);
        new BestFriend("Rob", friend2Action, exchanger);


    }
}

enum Action{
    STONE, SNIPERS, PAPER;
}

class BestFriend extends Thread{

    private String name;
    private List<Action> myAction;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myAction, Exchanger<Action> exchanger) {
        this.name = name;
        this.myAction = myAction;
        this.exchanger = exchanger;
    }

    private void winner(Action myAction, Action friendAction){
        if ((myAction == Action.STONE && friendAction == Action.SNIPERS)
        || (myAction == Action.SNIPERS && friendAction == Action.PAPER)
        || (myAction == Action.PAPER && friendAction == Action.STONE)){

            System.out.println(name + " WIN!!!!");
        }
    }

    @Override
    public void run() {
        Action reply;
        for (Action action: myAction){
            try {
                reply = exchanger.exchange(action);
                winner(action,reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
