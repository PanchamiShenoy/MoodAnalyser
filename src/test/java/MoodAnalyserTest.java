import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	/**
	 * test case to check for sad mood.
	 */
	@Test
	public void moodIsSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	/**
	 * test case to check for happy mood.
	 */
	@Test
	public void moodIsHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

}