/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author S541669
 */
public class enumDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Directions dir = Directions.EAST;  
	if(dir == Directions.EAST) {
	    System.out.println("Direction: East");
	} else if(dir == Directions.WEST) {
	    System.out.println("Direction: West");
	  } else if(dir == Directions.NORTH) {
	      System.out.println("Direction: North");
  	    } else {
		System.out.println("Direction: South");
	      }

    }
    
}
