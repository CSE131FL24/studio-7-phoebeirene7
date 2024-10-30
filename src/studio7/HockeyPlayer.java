package studio7;

public class HockeyPlayer {
	
	private String name;
	
	private int jerseyNumber; 
	
	private boolean shootRight;
	
	private boolean rightHanded;
	
	private int goals;
	
	private int assists;
	
	private int points;
	
	private int numofGames;
	
	
	

public HockeyPlayer(){}
	

public HockeyPlayer(String pname, int pjerseyNumber, boolean shootRight, boolean rightHanded) {
	
	 name = pname;
	
	jerseyNumber = pjerseyNumber;
	
	this.shootRight = shootRight;
	
	this.rightHanded = rightHanded; 
	
	
}

	private int getGoalNumber(){
	
		return goals;
	
	}

	private void incrementGoals(){
	
		goals++;
	}


	private int getAssistsNumber(){
	
		return assists;
	
	}

	private int incrementAssists(){
	
		return assists;
	
	}

	private int getPoints(){
	
		return assists + goals;
	
	}


}


public static void main(String[] args) {
	
	HockeyPlayer player1 = new HockeyPlayer();
	
	player1.getGoalNumber()
	
	
}
