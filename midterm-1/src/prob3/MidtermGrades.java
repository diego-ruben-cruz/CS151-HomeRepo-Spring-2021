package prob3;

import java.util.ArrayList;

public class MidtermGrades {
	private ArrayList<Double> grades = new ArrayList<>();

	public MidtermGrades() {
		grades.add(95.5);
		grades.add(87.0);
		grades.add(65.5);
		grades.add(92.5);
		grades.add(66.5);
		grades.add(84.0);
	}

	public GradesIterator getGrades() {
        //TODO: should return an object of anonymous class
    	return new GradesIterator() {
    		int index = 0;
    		
    		@Override
    		public double next() {
    			double current = grades.get(index);
    			index++;
    			return current;
    		}
    		
    		@Override
    		public double previous() {
    			double current = grades.get(index-1);
    			index--;
    			return current;
    		}
    		
    		@Override
    		public boolean hasNext() {
    			return index < grades.size();
    			
    		}
    		
    		@Override
    		public boolean hasPrevious() {
    			return index > 0;
    			
    		}
    	};
    }

	public static void main(String[] args) {
		// For testing
		MidtermGrades cs151Grades = new MidtermGrades();

		GradesIterator iterator = cs151Grades.getGrades();
		
		// Quick next-previous check
		System.out.println("Quick Next-Previous Check:");
		System.out.println(iterator.next());
		System.out.println(iterator.previous());
		iterator.next();
		iterator.previous();
		System.out.println("---------------------");
		System.out.println();
		
		while (iterator.hasNext()) {
			// read from left to right
			System.out.println(iterator.next());
		}
		System.out.println("Print first 3 elements in reverse:");
		GradesIterator iterator2 = cs151Grades.getGrades();
		iterator2.next();
		iterator2.next();
		while (iterator2.hasPrevious()) {
			// read from right to left
			System.out.println(iterator2.previous());
		}
	}
}