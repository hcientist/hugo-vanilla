
/**
 * A driver that can be used to test the DonutPricer class.
 * 
 * @author CS159 Professors
 * @version 1
 */
public class DonutPricerTest {

	/**
	 * The entry point of the driver.
	 * 
	 * @param args The command-line arguments (which are ignored)
	 */
	public static void main(String[] args) {
		
		System.out.println("\n");
		System.out.println("Testing DonutPricer.numberOfFullBoxes()");
		System.out.printf("%s: %d\n", describe(0), DonutPricer.numberOfFullBoxes(0));
		System.out.printf("%s: %d\n", describe(5), DonutPricer.numberOfFullBoxes(5));
		System.out.printf("%s: %d\n", describe(7), DonutPricer.numberOfFullBoxes(7));
		System.out.printf("%s: %d\n", describe(12), DonutPricer.numberOfFullBoxes(12));
		System.out.printf("%s: %d\n", describe(13), DonutPricer.numberOfFullBoxes(13));
		System.out.printf("%s: %d\n", describe(23), DonutPricer.numberOfFullBoxes(23));
		System.out.printf("%s: %d\n", describe(36), DonutPricer.numberOfFullBoxes(36));
		System.out.printf("%s: %d\n", describe(98), DonutPricer.numberOfFullBoxes(98));
		
		System.out.println("\n");
		System.out.println("Testing DonutPricer.needAnExtraBox()");
		System.out.printf("%s: %b\n", describe(0), DonutPricer.needAnExtraBox(0));
		System.out.printf("%s: %b\n", describe(5), DonutPricer.needAnExtraBox(5));
		System.out.printf("%s: %b\n", describe(7), DonutPricer.needAnExtraBox(7));
		System.out.printf("%s: %b\n", describe(12), DonutPricer.needAnExtraBox(12));
		System.out.printf("%s: %b\n", describe(13), DonutPricer.needAnExtraBox(13));
		System.out.printf("%s: %b\n", describe(23), DonutPricer.needAnExtraBox(23));
		System.out.printf("%s: %b\n", describe(36), DonutPricer.needAnExtraBox(36));
		System.out.printf("%s: %b\n", describe(98), DonutPricer.needAnExtraBox(98));
		
		System.out.println("\n");
		System.out.println("Testing DonutPricer.numberOfBoxes()");
		System.out.printf("%s: %d\n", describe(0), DonutPricer.numberOfBoxes(0));
		System.out.printf("%s: %d\n", describe(5), DonutPricer.numberOfBoxes(5));
		System.out.printf("%s: %d\n", describe(7), DonutPricer.numberOfBoxes(7));
		System.out.printf("%s: %d\n", describe(12), DonutPricer.numberOfBoxes(12));
		System.out.printf("%s: %d\n", describe(13), DonutPricer.numberOfBoxes(13));
		System.out.printf("%s: %d\n", describe(23), DonutPricer.numberOfBoxes(23));
		System.out.printf("%s: %d\n", describe(36), DonutPricer.numberOfBoxes(36));
		System.out.printf("%s: %d\n", describe(98), DonutPricer.numberOfBoxes(98));
		
		System.out.println("\n");
		System.out.println("Testing DonutPricer.numberOfExtras()");
		System.out.printf("%s: %d\n", describe(0), DonutPricer.numberOfExtras(0));
		System.out.printf("%s: %d\n", describe(5), DonutPricer.numberOfExtras(5));
		System.out.printf("%s: %d\n", describe(7), DonutPricer.numberOfExtras(7));
		System.out.printf("%s: %d\n", describe(12), DonutPricer.numberOfExtras(12));
		System.out.printf("%s: %d\n", describe(13), DonutPricer.numberOfExtras(13));
		System.out.printf("%s: %d\n", describe(23), DonutPricer.numberOfExtras(23));
		System.out.printf("%s: %d\n", describe(36), DonutPricer.numberOfExtras(36));
		System.out.printf("%s: %d\n", describe(98), DonutPricer.numberOfExtras(98));
		
		System.out.println("\n");
		System.out.println("Testing DonutPricer.priceFor()");
		System.out.printf("%s: %5.2f\n", describe(0), DonutPricer.priceFor(0));
		System.out.printf("%s: %5.2f\n", describe(5), DonutPricer.priceFor(5));
		System.out.printf("%s: %5.2f\n", describe(7), DonutPricer.priceFor(7));
		System.out.printf("%s: %5.2f\n", describe(12), DonutPricer.priceFor(12));
		System.out.printf("%s: %5.2f\n", describe(13), DonutPricer.priceFor(13));
		System.out.printf("%s: %5.2f\n", describe(23), DonutPricer.priceFor(23));
		System.out.printf("%s: %5.2f\n", describe(36), DonutPricer.priceFor(36));
		System.out.printf("%s: %5.2f\n", describe(98), DonutPricer.priceFor(98));
	}
	
	/**
	 * A convenience method that creates a description of a test.
	 * 
	 * @param number The number of donuts in the test
	 * @return A description of the test
	 */
	private static String describe(int number) {
		return String.format("\tFor %d donuts", number);
	}
}
