//Chapter 8 exercise

import java.util.*;

public class BowlingTeamDemo {
    public static void main(String[] args) {
        
        //Variables and constants
        String name;
        int x;
        final int NUM_TEAM_MEMBERS = 4;
        Scanner input = new Scanner(System.in);
        BowlingTeam bowlTeam = new BowlingTeam();

        //Input phase
        System.out.print("Enter team name >> ");
        name = input.nextLine();
        bowlTeam.setTeamName(name);

        for(x = 0; x < NUM_TEAM_MEMBERS; ++x){
            System.out.print("Enter team member's name >> ");
            name = input.nextLine();
            bowlTeam.setMember(x, name);
        }// end of FOR loop

        // Output phase
        System.out.print("\nMembers of team " + bowlTeam.getTeamName());
        for(x = 0; x < NUM_TEAM_MEMBERS; ++x){
            System.out.print(bowlTeam.getMember(x) + " ");
        }


    }// end of main()
}// end of class block
