package com.polymophism;

public class OverLoading_Cricket {
	
     public void worldcupMatch(String team_name) {
    	 
    	 System.out.println(team_name);
	
	}
     
     public void worldcupMatch(String captain,String vicecaptain,int squad_players) {
	
    	 System.out.println(captain + "  " + vicecaptain + "  " + squad_players);

	}

     public void worldcupMatch(int captain_score, int vicecaptian_score ) {
    	 
    	 System.out.println(captain_score + "       " + vicecaptian_score);

	}
     
     public static void main(String[] args) {
		
    	 OverLoading_Cricket obj = new OverLoading_Cricket();
    	 
    	 
    	 obj.worldcupMatch("India");
    	 
         obj.worldcupMatch("Rohit", "Virat",15);
         
         obj.worldcupMatch(75, 40);
         
    	 
     } 
     
     
	}

 