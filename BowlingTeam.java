// Chapter 8 exercise

public class BowlingTeam {
        
        //Instance variables for this class
        private String teamName;
        private String[] members = new String[4];

        //Class methods for the temaName variable
        public void setTeamName(String team){
            teamName = team;
        }// end of the setTeamName()
        
        public String getTeamName(){
            return teamName;
        }// end of getTeamName()

        public void setMember(int number, String name){
            members[number] = name;
        } // end of setMember()

        public String getMember(int number){
            return members[number];

        }
}
