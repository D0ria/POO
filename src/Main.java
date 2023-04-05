import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrangerKeyboard item1 = new ArrangerKeyboard(1, 119.00f, "Yamaha", "PSR-F52", "in stock", 88, true,
				"Electronic Sound", "DD/MM/YYYY", "Default");
		UprightPiano item2 = new UprightPiano(2, 3889.00f, "Yamaha", "B1 PE", "in stock", 81, "mahogany wood", true,
				"DD/MM/YYYY", "Default");
		ElectricGuitar item3 = new ElectricGuitar(3, 1690.00f, "Gibson", "SG'61 Standard VC", "in stock", true, 6,
				"mahogany wood", "DD/MM/YYYY", "Burstbucker 61R & 61T", "default");
		Violin item4 = new Violin(4, 289.00f, "Gewa", "Ideale Violin 4/4", "in stock", true, 4, "Lutherie wood",
				"DD/MM/YYYY", "Snakewood");
		AcousticDrum item5 = new AcousticDrum(5, 339.00f, "Millenium", "Focus 22 Drum Set Red", "in stock", true,
				"2 toms, 1 tompad, 1 kickdrum, 1 cymbal, 1 kickpad, 1 snaredrum, 1 cymbalpad by default");
		ElectronicDrum item6 = new ElectronicDrum(6, 179.00f, "Millenium", "Focus Junior Drum Set Black", "in stock",
				true, true, "2 toms, 1 tompad, 1 kickdrum, 1 cymbale, 1 charleston, 1 tompad, 1 kickpas, 1 snaredrum");
		Charleston item7 = new Charleston(7, 539.00f, "Meinl Byzance", "B15POH", "in stock", 38.1f, "bronze",
				"Hot sound");
		Cymbal item8 = new Cymbal(8, 409.00f, "Zildjian", "A21", "in stock", 53.4f, "bronze", "bright sound");
		CymbalPad item9 = new CymbalPad(9, 379.00f, "Roland", "CY-16R-T", "in stock", 40.64f, "feutre", "rich sound");
		KickDrum item10 = new KickDrum(10, 231.00f, "Stagg", "MABD-1810", "in stock", 45.72f, "linden", "Kaboom !");
		KickPad item11 = new KickPad(11, 207.00f, "Roland", "KD-10", "in stock", 40, "alluminium", "Bam");
		SnareDrum item12 = new SnareDrum(12, 284.00f, "Pearl", "MUS1455M/C227", "in stock", 35.56f, "maple",
				"clear tone");
		Tom item13 = new Tom(13, 63.00f, "Evans", "dB One", "in stocl", 35.56f, "batter head", "Schding !");
		TomPad item14 = new TomPad(14, 276.00f, "Efnote", "EFD-T12P-WS", "in stock", 30.48f, "mesh-head", "Ding");
		ElectronicDrum item25 = new ElectronicDrum(7, 790.99f, "All brands combined", "All model combined", "in stock",
				true, true, "Being customized...");
		AcousticDrum item26 = new AcousticDrum(8, 8590.99f, "All brands combined", "All model combined", "in stock",
				true, "Being customized...");

		ArrayList<Instrument> myStock = new ArrayList<Instrument>();
		myStock.add(item1);
		myStock.add(item2);
		myStock.add(item3);
		myStock.add(item4);
		myStock.add(item5);
		myStock.add(item6);
		myStock.add(item7);
		myStock.add(item8);
		myStock.add(item9);
		myStock.add(item10);
		myStock.add(item11);
		myStock.add(item12);
		myStock.add(item13);
		myStock.add(item14);
		myStock.add(item25);
		myStock.add(item26);

		// ArrayList<PercussionInstrument> Perc = new ArrayList<PercussionInstrument>();

		int choice;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1 : Show instruments in the stock");
			System.out.println("2 : Show an instrument");
			System.out.println("3 : Modify an instrument");
			System.out.println("4 : Modify the storage state of an instrument");
			System.out.println("5 : Add an instrument");
			System.out.println("6 : Delete an instrument");
			System.out.println("7 : Customize a drum");
			System.out.println("8 : Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				for (Instrument instruments : myStock) {
					System.out.println(instruments);
				}
				break;
			case 2:
				Instrument allInstrument = findInstrument(myStock);
				System.out.println(allInstrument.toString());
				break;
			case 3:
				System.out.println("Choose an instrument to modify it.");
				System.out.println("1: Percussion Instrument");
				System.out.println("2: Keyboard Instrument");
				System.out.println("3: String Instrument");
				Scanner choosenOne = new Scanner(System.in);
				int wichInstrument = choosenOne.nextInt();
				switch (wichInstrument) {
				case 1:
					System.out.println("Wich percussion ?");
					System.out.println("1 : An electronic drum");
					System.out.println("2 : An acoustic drum");
					System.out.println("3: A kick drum");
					System.out.println("4: A snare drum");
					System.out.println("5: A tom");
					System.out.println("6: A cymbal");
					System.out.println("7: A charleston");
					System.out.println("8: A kick pad");
					System.out.println("9: A tom pad");
					System.out.println("10: A cymbal pad");

					Scanner choosenFirstOne = new Scanner(System.in);
					int wichPercussion = choosenFirstOne.nextInt();
					switch (wichPercussion) {
					case 1:
						Instrument electronicDrumToModify = findInstrument(myStock);
						((ElectronicDrum) electronicDrumToModify).modify();
						break;
					case 2:
						Instrument acousticDrumToModify = findInstrument(myStock);
						((AcousticDrum) acousticDrumToModify).modify();
						break;
					case 3:
						Instrument kickDrumToModify = findInstrument(myStock);
						((KickDrum) kickDrumToModify).modify();
						break;
					case 4:
						Instrument snareDrumToModify = findInstrument(myStock);
						((SnareDrum) snareDrumToModify).modify();
						break;
					case 5:
						Instrument tomToModify = findInstrument(myStock);
						((Tom) tomToModify).modify();
						break;
					case 6:
						Instrument cymbalToModify = findInstrument(myStock);
						((Cymbal) cymbalToModify).modify();
						break;
					case 7:
						Instrument charlestonToModify = findInstrument(myStock);
						((Charleston) charlestonToModify).modify();
						break;
					case 8:
						Instrument kickPadToModify = findInstrument(myStock);
						((KickPad) kickPadToModify).modify();
						break;
					case 9:
						Instrument tomPadToModify = findInstrument(myStock);
						((TomPad) tomPadToModify).modify();
						break;
					case 10:
						Instrument cymbalPadToModify = findInstrument(myStock);
						((CymbalPad) cymbalPadToModify).modify();
						break;
					}
					break;
				case 2:
					System.out.println("Wich keyboard instrument ?");
					System.out.println("1: An upright piano");
					System.out.println("2: An arranger keyboard");

					Scanner choosenSecondOne = new Scanner(System.in);
					int otherChoice = choosenSecondOne.nextInt();
					switch (otherChoice) {
					case 1:
						Instrument UprightPianoToModify = findInstrument(myStock);
						((UprightPiano) UprightPianoToModify).modify();
						break;
					case 2:
						Instrument ArrangerKeyboardToModify = findInstrument(myStock);
						((ArrangerKeyboard) ArrangerKeyboardToModify).modify();
						break;
					}
					break;
				case 3:
					System.out.println("Wich string instrument ?");
					System.out.println("1: An electric guitar");
					System.out.println("2: A violin");

					Scanner choosenThirdOne = new Scanner(System.in);
					int anotherChoice = choosenThirdOne.nextInt();
					switch (anotherChoice) {
					case 1:
						Instrument electricGuitarToModify = findInstrument(myStock);
						((ElectricGuitar) electricGuitarToModify).modify();
						break;
					case 2:
						Instrument violinToModify = findInstrument(myStock);
						((Violin) violinToModify).modify();
						break;
					}
				}
				break;
			case 4:
				Instrument thisInstrument = findInstrument(myStock);
				thisInstrument.initializeState();
				break;
			case 5:
				System.out.println("Choose an instrument to modify it.");
				System.out.println("1: Percussion Instrument");
				System.out.println("2: Keyboard Instrument");
				System.out.println("3: String Instrument");

				Instrument newInstru;
				Scanner anotherChoosenOne = new Scanner(System.in);
				int anotherOneInstrument = anotherChoosenOne.nextInt();

				switch (anotherOneInstrument) {
				case 1:
					System.out.println("Wich percussion ?");
					System.out.println("1 : An electronic drum");
					System.out.println("2 : An acoustic drum");
					System.out.println("3: A kick drum");
					System.out.println("4: A snare drum");
					System.out.println("5: A tom");
					System.out.println("6: A cymbal");
					System.out.println("7: A charleston");
					System.out.println("8: A kick pad");
					System.out.println("9: A tom pad");
					System.out.println("10: A cymbal pad");

					Drums newDrum;
					Acoustic newAc;
					Electronic newElec;
					Scanner choosenFirstOne = new Scanner(System.in);
					int wichPercussion = choosenFirstOne.nextInt();
					switch (wichPercussion) {
					case 1:
						newDrum = new ElectronicDrum();
						newDrum.initialize();
						myStock.add(newDrum);
						break;
					case 2:
						newDrum = new AcousticDrum();
						newDrum.initialize();
						myStock.add(newDrum);
						break;
					case 3:
						newAc = new KickDrum();
						newAc.initialize();
						myStock.add(newAc);
						break;
					case 4:
						newAc = new SnareDrum();
						newAc.initialize();
						myStock.add(newAc);
						break;
					case 5:
						newAc = new Tom();
						newAc.initialize();
						myStock.add(newAc);
						break;
					case 6:
						newAc = new Cymbal();
						newAc.initialize();
						myStock.add(newAc);
						break;
					case 7:
						newAc = new Charleston();
						newAc.initialize();
						myStock.add(newAc);
						break;
					case 8:
						newElec = new KickPad();
						newElec.initialize();
						myStock.add(newElec);
						break;
					case 9:
						newElec = new TomPad();
						newElec.initialize();
						myStock.add(newElec);
						break;
					case 10:
						newElec = new CymbalPad();
						newElec.initialize();
						myStock.add(newElec);
						break;
					}
					break;
				case 2:
					System.out.println("Wich keyboard instrument ?");
					System.out.println("1: An upright piano");
					System.out.println("2: An arranger keyboard");

					KeyboardInstrument newKb;
					Scanner choosenSecondOne = new Scanner(System.in);
					int otherChoice = choosenSecondOne.nextInt();
					switch (otherChoice) {
					case 1:
						newKb = new UprightPiano();
						newKb.initialize();
						myStock.add(newKb);
						break;
					case 2:
						newKb = new ArrangerKeyboard();
						newKb.initialize();
						myStock.add(newKb);
						break;
					}
					break;
				case 3:
					System.out.println("Wich string instrument ?");
					System.out.println("1: An electric guitar");
					System.out.println("2: A violin");

					StringInstrument newStr;
					Scanner choosenThirdOne = new Scanner(System.in);
					int anotherChoice = choosenThirdOne.nextInt();
					switch (anotherChoice) {
					case 1:
						newStr = new ElectricGuitar();
						newStr.initialize();
						myStock.add(newStr);
						break;
					case 2:
						newStr = new Violin();
						newStr.initialize();
						myStock.add(newStr);
						break;
					}
					break;
				}
				break;
			case 6:
				Instrument instrumentToDelete = findInstrument(myStock);
				myStock.remove(instrumentToDelete);
				break;
			case 7:
				System.out.println("This service is not available now...");
				System.out.println("For more information, contact the customer client : 06.38.34.46.23");
				System.out.println("We apologize for this inconvenience.");
//					PercussionInstrument newAc;
//					PercussionInstrument newElec;
//					Scanner choosenChoice = new Scanner(System.in);
//					System.out.println("Wich drum would you like to customize?");
//					System.out.println("1: Acoustic drum" );
//					System.out.println("2: Electronic Drum");
//					int instru = choosenChoice.nextInt();
//					switch (instru) {
//					case 1:
//						System.out.println("Enter the bare-code of the percussion that you want to equip your drum: ");
//						choosenChoice.nextInt();
//						findInstrument(myStock);
//						newAc = findPercussion(Perc);
//						if(newAc instanceof KickDrum) {
//							Perc.add(newAc);
//							for (PercussionInstrument perc: Perc) {
//							System.out.println(perc.toString());						
//							}}
//						break;
//					case 2:
//						//Perc.add(newElec);
//					}
			}
		} while (choice != 8);
	}

	public static Instrument findInstrument(ArrayList<Instrument> myStock) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter the bare-code: ");
		int barecode = scanner.nextInt();

		Instrument findInstrument = null;
		int i = 0;
		boolean found = false;
		while (i < myStock.size() && !found) {
			if (barecode == myStock.get(i).getBarecode()) {
				findInstrument = myStock.get(i);
				found = true;
			}
			i++;
		}
		return findInstrument;
	}

//	public static PercussionInstrument findPercussion(ArrayList<PercussionInstrument> Perc) {
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please, enter the bare-code: ");
//		int barecode = scanner.nextInt();
//
//		PercussionInstrument findPercussion = null;
//		int i = 0;
//		boolean found = false;
//		while (i < Perc.size() && !found) {
//			if (barecode == Perc.get(i).getBarecode()) {
//				findPercussion = Perc.get(i);
//				found = true;
//			}
//			i++;
//		}
//		return findPercussion;
//	}
}
