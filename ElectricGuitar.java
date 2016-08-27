public class ElectricGuitar extends StringedInstrument {

	public static void main(String[] args) {
		
		ElectricGuitar eg = new ElectricGuitar();
		eg.nameOfInstrument = "Electric Guitar";
		eg.numberOfStrings = 6;
		eg.play(eg.nameOfInstrument, eg.numberOfStrings);
		
	}
	
}