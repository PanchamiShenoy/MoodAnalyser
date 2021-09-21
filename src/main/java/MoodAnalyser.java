
public class MoodAnalyser {
	private String message;

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	/**
	 * @param message - message which needs to be analysed
	 * @return mood-sad or happy
	 */
	public String analyseMood() {

		if (message.contains("sad")) {
			return "SAD";
		}
		return "HAPPY";
	}

}
