
public class MoodAnalyser {

	/**
	 * @param message - message which needs to be analysed
	 * @return mood-sad or happy
	 */
	public String analyseMood(String message) {
		if (message.contains("sad")) {
			return "SAD";
		}
		return "HAPPY";
	}

}
