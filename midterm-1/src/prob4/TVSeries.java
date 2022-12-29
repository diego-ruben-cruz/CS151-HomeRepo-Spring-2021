package prob4;

public class TVSeries implements Comparable<TVSeries> {
	private String name;
	private int year;

	public TVSeries(String name, int year) {
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return name + ", " + year;
	}

	@Override
	public int compareTo(TVSeries other) {
		if (this.name.compareTo(other.name) == 0) {
			return this.year - other.year;
		} else {
			return this.name.compareTo(other.name);
		}
	}

	@Override
	public boolean equals(Object other) {
		return this.compareTo((TVSeries) other) == 0;
	}
}