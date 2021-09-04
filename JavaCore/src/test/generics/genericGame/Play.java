package test.generics.genericGame;

public class Play {
    public static void main(String[] args) {
        School schoolPlayer1 = new School("Jack", 14);
        School schoolPlayer2 = new School("Nick", 14);
        School schoolPlayer3 = new School("Karl", 14);
        School schoolPlayer4 = new School("Bob", 14);

        College collegePlayer1 = new College("John", 16);
        College collegePlayer2 = new College("Jim", 16);
        College collegePlayer3 = new College("Erl", 16);
        College collegePlayer4 = new College("Adam", 16);

        Institute institutePlayer1 = new Institute("Robert", 19);
        Institute institutePlayer2 = new Institute("Oggy", 19);
        Institute institutePlayer3 = new Institute("Roy", 19);
        Institute institutePlayer4 = new Institute("Dede", 19);


        Team<School> schoolTeam1 = new Team<>("Dragons");
        schoolTeam1.addParticipant(schoolPlayer1);
        schoolTeam1.addParticipant(schoolPlayer2);

        Team<School> schoolTeam2 = new Team<>("Goats");
        schoolTeam2.addParticipant(schoolPlayer3);
        schoolTeam2.addParticipant(schoolPlayer4);

        Team<College> collegeTeam1 = new Team<>("Dogs");
        collegeTeam1.addParticipant(collegePlayer1);
        collegeTeam1.addParticipant(collegePlayer2);

        Team<College> collegeTeam2 = new Team<>("Pigs");
        collegeTeam2.addParticipant(collegePlayer3);
        collegeTeam2.addParticipant(collegePlayer4);

        Team<Institute> instituteTeam1 = new Team<>("Fly");
        instituteTeam1.addParticipant(institutePlayer1);
        instituteTeam1.addParticipant(institutePlayer2);

        Team<Institute> instituteTeam2 = new Team<>("Pony");
        instituteTeam2.addParticipant(institutePlayer3);
        instituteTeam2.addParticipant(institutePlayer4);

        schoolTeam1.playGame(schoolTeam2);
        collegeTeam1.playGame(collegeTeam2);
        instituteTeam1.playGame(instituteTeam2);
    }
}
