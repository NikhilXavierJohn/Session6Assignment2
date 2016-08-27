public class ElectricBassGuitar extends StringedInstrument {

	public static void main(String[] args) {
		
		ElectricBassGuitar ebg = new ElectricBassGuitar();
		ebg.nameOfInstrument = "Electric Bass Guitar";
		ebg.numberOfStrings = 4;
		ebg.play(ebg.nameOfInstrument, ebg.numberOfStrings);

	}

}