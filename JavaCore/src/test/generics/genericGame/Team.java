package test.generics.genericGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {
    private String teamName;
    List<T> participantList = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;

    }

    public void addParticipant(T participant){
        participantList.add(participant);
        System.out.println("Participant " + participant.getName() + " added to the team " + teamName);
    }

    public void playGame(Team<T> team) {
        String winnerName;
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if (randomNumber == 0) {
            winnerName = this.teamName;
        }
        else{
                winnerName = team.teamName;
            }
        System.out.println("Team " + winnerName + " win!!!");
        }

    }
