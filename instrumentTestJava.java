package associationJava;

public class instrumentTestJava {

	public static void main(String[] args) {
		guitar g1=new guitar();
		g1.use();
		g1.play();
		g1.tuneStrings();
		
		System.out.println("=================================");
		
		voilin v1=new voilin();
		v1.use();
		v1.play();
		v1.tuneStrings();
		
	}

}
abstract class instrument{
	abstract void use();	
}
abstract class musicalInstrument extends instrument {
	abstract void play();	

}
abstract class stringBasedInstrument extends musicalInstrument{

}
class guitar extends stringBasedInstrument {
	
	void use() {
		System.out.println("using guitar.......");

	}

	void play() {
		System.out.println("playing guitar.......");
		
	}
	void tuneStrings() {
			System.out.println("tuning guitar strings.......");

	}
	
}

class voilin extends stringBasedInstrument {
	
	void use() {
		System.out.println("using voilin.......");

	}

	void play() {
		System.out.println("playing voilin.......");
		
	}
	void tuneStrings() {
			System.out.println("tuning voilin strings.......");

	}
	
}