
package jungle.use;

import jungle.river.crocodile;

public class use {

	public static void main(String[] args) {
	
		crocodile croc = new crocodile();
		croc.swim();
		System.out.println(" defaultA   "+croc.defaultA);
		System.out.println(" publicA    "+croc.publicA);
		System.out.println(" privateA   "+croc.privateA);
		System.out.println(" protectedA "+croc.protectedA);
	}

}

