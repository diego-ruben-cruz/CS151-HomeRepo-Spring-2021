package prob2;

public class StartsWithAFilter implements Filterator {
    @Override
	public boolean accept(String s) {
        if (s.charAt(0) == 'a' || s.charAt(0) == 'A') {
            return true;
        } else {
            return false;
        }
    }
}