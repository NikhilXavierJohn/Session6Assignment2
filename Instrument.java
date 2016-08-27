public abstract class Instrument {

		String nameOfInstrument;
		
		abstract public void play(String name, int strings);
		
		}

class StringedInstrument extends Instrument {

	int numberOfStrings;
	
	public void play(String name,int strings){
		
		System.out.println("Number of Strings in an " + name + " is " + strings);	
		
	}
	
}
