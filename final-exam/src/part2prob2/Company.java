package part2prob2;

public class Company implements Comparable<Company> {
	private String name;
	private double capitalization;

	public Company(String name, double capitalization) {
		this.name = name;
		this.capitalization = capitalization;
	}

	public String getName() {
		return name;
	}

	public double getCapitalization() {
		return capitalization;
	}

	@Override
	public int compareTo(Company other) {
		if (this.getName().compareTo(other.getName()) == 0) {
			if (this.getCapitalization() > other.getCapitalization()) {
				return -1;
			} else if (this.getCapitalization() < other.getCapitalization()) {
				return 1;
			} else {
				return 0;
			}
		} else {
			return this.getName().compareTo(other.getName());
		}
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		} else if (other == null) {
			return false;
		} else if (this.getClass() != other.getClass()) {
			return false;
		} else {
			return this.compareTo((Company) other) == 0;
		}
	}

	@Override
	public int hashCode() {
		return this.getName().hashCode() + Double.toString(this.getCapitalization()).length();
	}

	public static void main(String[] args) {
		Company amd = new Company("AMD", 100000);
		Company intel = new Company("Intel", 1000000);
		Company amdClone = new Company("AMD", 1000000000);
		Company amd2 = new Company("AMD", 100000);

		System.out.println("Company(AMD, 100000) compared to Company(Intel, 1000000)");
		System.out.println("CompareTo Expected Behavior: -int");
		System.out.println("CompareTo Actual Behavior: " + amd.compareTo(intel));
		System.out.println("Equals Expected Behavior: false");
		System.out.println("Equals Actual Behavior: " + amd.equals(intel));
		System.out.println("HashCode Expected Behavior: false");
		System.out.println("HashCode Actual Behavior: " + (amd.hashCode() == intel.hashCode()));
		System.out.println();

		System.out.println("Company(AMD, 100000) compared to Company(AMD, 1000000000)");
		System.out.println("CompareTo Expected Behavior: +int");
		System.out.println("CompareTo Actual Behavior: " + amd.compareTo(amdClone));
		System.out.println("Equals Expected Behavior: false");
		System.out.println("Equals Actual Behavior: " + amd.equals(amdClone));
		System.out.println("HashCode Expected Behavior: false");
		System.out.println("HashCode Actual Behavior: " + (amd.hashCode() == amdClone.hashCode()));
		System.out.println();

		System.out.println("Company(AMD, 100000) compared to Company(AMD, 100000)");
		System.out.println("CompareTo Expected Behavior: 0");
		System.out.println("CompareTo Actual Behavior: " + amd.compareTo(amd2));
		System.out.println("Equals Expected Behavior: true");
		System.out.println("Equals Actual Behavior: " + amd.equals(amd2));
		System.out.println("HashCode Expected Behavior: true");
		System.out.println("HashCode Actual Behavior: " + (amd.hashCode() == amd2.hashCode()));
	}
}