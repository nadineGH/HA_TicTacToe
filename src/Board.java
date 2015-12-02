
public class Board {
	private char [][] board;
	
	   public Board(){
		   board = new char [3][3];
	   }   
	   public void setMark(String mark, int x, int y) throws InvalidPositionException {
		   if (mark.equals("x") || mark.equals("o")){
			   
		   }
		   else{
			   throw new InvalidPositionException("Fehler");
		   }
	   } 
	public boolean hasWinner(){ 
	for (int i = 0; i < 3; i++) {
		
		       if (board[0][i], board[1][i], board[2][i] == true) {

			                return true;
		
			            }
			}
			return false;
	}
}