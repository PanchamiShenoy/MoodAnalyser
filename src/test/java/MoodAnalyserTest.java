import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	/**
	 * test case to check for sad mood.
	 */
	@Test
	public void moodIsSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am sad");
		Assert.assertEquals("SAD", mood);
	}

	/**
	 * test case to check for sad mood.
	 */
	@Test
	public void moodIsHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am having fun");
		Assert.assertEquals("HAPPY", mood);
	}

}