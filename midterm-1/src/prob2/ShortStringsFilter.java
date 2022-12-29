package prob2;

public class ShortStringsFilter implements Filterator{
	@Override
	public boolean accept(String s) {
		if (s.length() < 6) {
			return true;
		} else {
			return false;
		}
	}
}