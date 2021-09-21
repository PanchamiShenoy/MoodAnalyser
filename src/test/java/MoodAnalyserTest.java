import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	/**
	 * test case to check for sad mood.
	 */
	@Test
	public void moodIsSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalyserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 * test case to check for happy mood.
	 */
	@Test
	public void moodIsHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalyserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

	/**
	 * test case to check for null
	 */
	@Test
	public void moodIsNull() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalyserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}

	}

	/**
	 * test case to check for empty message
	 */
	@Test
	public void moodIsEmpty() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalyserException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());

		}

	}

}