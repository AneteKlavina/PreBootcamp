package App_package;

import java.util.Scanner;


public class Mainn {

    public static void main(String[] args) {


        int points, rebounds, assists, steals, blocks, foulsDrawn, missedFieldGoals, missedFreeThrows, turnovers, shotsRejected, foulsCommitted;
        String s;


        BasketballPlayer[] players = new BasketballPlayer[4];
        int[] functionValues = new int[4];
        Scanner in = new Scanner(System.in);


        //Start
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a basketball player surname");
            s = in.nextLine();
            System.out.println("You entered a basketball player surname: " + s);

            System.out.println("Enter a points");
            points = in.nextInt();
            System.out.println("You entered points: " + points);

            System.out.println("Enter a rebounds");
            rebounds = in.nextInt();
            System.out.println("You entered rebounds: " + rebounds);

            System.out.println("Enter a assists");
            assists = in.nextInt();
            System.out.println("You entered assists: " + assists);

            System.out.println("Enter a steals");
            steals = in.nextInt();
            System.out.println("You entered steals: " + steals);

            System.out.println("Enter a blocks");
            blocks = in.nextInt();
            System.out.println("You entered blocks: " + blocks);

            System.out.println("Enter a foulsDrawn");
            foulsDrawn = in.nextInt();
            System.out.println("You entered foulsDrawn: " + foulsDrawn);

            System.out.println("Enter a missedFieldGoals ");
            missedFieldGoals = in.nextInt();
            System.out.println("You entered missedFieldGoals: " + missedFieldGoals);

            System.out.println("Enter a missedFreeThrows ");
            missedFreeThrows = in.nextInt();
            System.out.println("You entered missedFreeThrows: " + missedFreeThrows);

            System.out.println("Enter a turnovers ");
            turnovers = in.nextInt();
            System.out.println("You entered turnovers: " + turnovers);

            System.out.println("Enter a shotsRejected ");
            shotsRejected = in.nextInt();
            System.out.println("You entered shotsRejected: " + shotsRejected);

            System.out.println("Enter a foulsCommitted ");
            foulsCommitted = in.nextInt();
            System.out.println("You entered foulsCommitted: " + foulsCommitted);


            BasketballPlayer player = new BasketballPlayer();
            player.setAssists(assists);
            player.setPoints(points);
            player.setRebounds(rebounds);
            player.setSteals(steals);
            player.setBlocks(blocks);
            player.setFoulsDrawn(foulsDrawn);
            player.setMissedFieldGoals(missedFieldGoals);
            player.setMissedFreeThrows(missedFreeThrows);
            player.setTurnovers(turnovers);
            player.setShotsRejected(shotsRejected);
            player.setFoulsCommitted(foulsCommitted);

            players[i] = player;
            int functionValue = player.testFunction();
            functionValues[i] = functionValue;
            System.out.println(s + " performance index rating is: " + functionValue);

            //End


        }

        BubbleSort.bubbleSort(functionValues);

        System.out.println("Basketballplayers performance index rating from smaller to bigger: ");
        for(int i=0; i < functionValues.length; i++){
            System.out.print(functionValues[i] + " ");
        }

//        BasketballPlayer gersons = new BasketballPlayer();
//        gersons.setAssists(assists);
//        gersons.setPoints(points);
//        gersons.setRebounds(rebounds);
//        gersons.setSteals(steals);
//        gersons.setBlocks(blocks);
//        gersons.setFoulsDrawn(foulsDrawn);
//        gersons.setMissedFieldGoals(missedFieldGoals);
//        gersons.setMissedFreeThrows(missedFreeThrows);
//        gersons.setTurnovers(turnovers);
//        gersons.setShotsRejected(shotsRejected);
//        gersons.setFoulsCommitted(foulsCommitted);
//
//        gersons.testFunction();
//
//
//        BasketballPlayer miska = new BasketballPlayer();
//        miska.setAssists(assists);
//        miska.setPoints(points);
//        miska.setRebounds(rebounds);
//        miska.setSteals(steals);
//        miska.setBlocks(blocks);
//        miska.setFoulsDrawn(foulsDrawn);
//        miska.setMissedFieldGoals(missedFieldGoals);
//        miska.setMissedFreeThrows(missedFreeThrows);
//        miska.setTurnovers(turnovers);
//        miska.setShotsRejected(shotsRejected);
//        miska.setFoulsCommitted(foulsCommitted);
//
//        miska.testFunction();
//
//        BasketballPlayer berzins = new BasketballPlayer();
//        berzins.setAssists(assists);
//        berzins.setPoints(points);
//        berzins.setRebounds(rebounds);
//        berzins.setSteals(steals);
//        berzins.setBlocks(blocks);
//        berzins.setFoulsDrawn(foulsDrawn);
//        berzins.setMissedFieldGoals(missedFieldGoals);
//        berzins.setMissedFreeThrows(missedFreeThrows);
//        berzins.setTurnovers(turnovers);
//        berzins.setShotsRejected(shotsRejected);
//        berzins.setFoulsCommitted(foulsCommitted);
//
//        berzins.testFunction();


//        player.points();
//        player.rebounds();
//        player.assists();
//        player.steals();
//        player.blocks();
//        player.foulsDrawn();
//        player.missedFieldGoals();
//        player.missedFreeThrows();
//        player.turnowers();
//        player.shotsRejected();
//        player.foulsCommitted();
//
//        gersons.points();
//        gersons.rebounds();
//        gersons.assists();
//        gersons.steals();
//        gersons.blocks();
//        gersons.foulsDrawn();
//        gersons.missedFieldGoals();
//        gersons.missedFreeThrows();
//        gersons.turnowers();
//        gersons.shotsRejected();
//        gersons.foulsCommitted();
//
//        miska.points();
//        miska.rebounds();
//        miska.assists();
//        miska.steals();
//        miska.blocks();
//        miska.foulsDrawn();
//        miska.missedFieldGoals();
//        miska.missedFreeThrows();
//        miska.turnowers();
//        miska.shotsRejected();
//        miska.foulsCommitted();
//
//        berzins.points();
//        berzins.rebounds();
//        berzins.assists();
//        berzins.steals();
//        berzins.blocks();
//        berzins.foulsDrawn();
//        berzins.missedFieldGoals();
//        berzins.missedFreeThrows();
//        berzins.turnowers();
//        berzins.shotsRejected();
//        berzins.foulsCommitted();


    }
}
