
package LinkedListII;

public class PlayerNode {
      PlayerNode next;
	
      int id;
      String firstName;
      String lastName;
      String playerName;
      String playerType;
      double lifePoints;
      int totalScore;
	
	
	public PlayerNode(int id,String firstName, String lastName, String playerName, String playerType,
			double lifePoints, int totalScore) {
	    this.id = id;
      this.firstName = firstName;
      this.lastName = lastName;
      this.playerName = playerName;
      this.playerType = playerType;
      this.lifePoints = lifePoints;
      this.totalScore = totalScore;
	}	

}
