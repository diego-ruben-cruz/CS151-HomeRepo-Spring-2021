package prob2;

public class LongStringsFilter implements Filterator {

	@Override
	public boolean accept(String s) {
		if (s.length() > 10) {
			return true;
		} else {
			return false;
		}
	}

}