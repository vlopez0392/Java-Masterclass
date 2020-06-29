package com.company;
public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        //Able to accept the type argument T - Type of player!
        Team<FootballPlayer> adelaideCrows= new Team<>("Adelaide Crows");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        adelaideCrows.addPlayer(joe);
        baseballTeam.addPlayer(pat);

        //adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());
    }
}
