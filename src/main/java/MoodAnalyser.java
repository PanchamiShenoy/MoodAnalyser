
public class MoodAnalyser {
	private String message;

	public enum errortypes {
		EMPTY_MOOD_ERROR, NULL_MOOD_ERROR
	}

	public MoodAnalyser() {

	}

	public MoodAnalyser(String message) {
		this.message = message;
	}

	/**
	 * @param message - message which needs to be analysed
	 * @return mood-sad or happy
	 */
	public String analyseMood() throws MoodAnalyserException {

		try {
			if (message.length() == 0)
				throw new MoodAnalyserException(errortypes.EMPTY_MOOD_ERROR.toString());
			else if (message.contains(("sad"))) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalyserException(errortypes.NULL_MOOD_ERROR.toString());
		}
	}

}
