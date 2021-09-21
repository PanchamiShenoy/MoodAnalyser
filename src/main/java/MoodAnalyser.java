
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

		try {
			if (message.contains("sad")) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
		}
	}

}
