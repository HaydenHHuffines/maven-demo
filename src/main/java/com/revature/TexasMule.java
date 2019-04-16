/**
 * 
 */
package com.revature;

/**
 * @author Hayden
 *
 */
public class TexasMule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ingredient1 = "Horse";
		String ingredient2 = "Donkey";
		
		TexasMule firstDrink = new TexasMule();
		String finishedfirstDrink = firstDrink.add(ingredient1, ingredient2);
		
		System.out.println(finishedfirstDrink);

	}

	public String add(String a, String b) {
		return a + b;
	}
	
}
