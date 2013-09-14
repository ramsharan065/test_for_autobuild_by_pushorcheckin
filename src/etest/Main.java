package etest;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Day day;
//		day = Day.MONDAY;
//		System.out.println(day);
//		
//		switch(day){
//		case SUNDAY:
//			System.out.println("this is sunday");
//		default:
//			System.out.println("this is default");
//		}
//		for(Day d : Day.values()){
//			System.out.println(d);
//		}
		Planet p;
		p = Planet.MERCURY;
		System.out.println(p.getmass()+"             "+p.getradius());
		System.out.println("changed to trigger build in cloudbees");
		System.out.println("triggering the cloudbees to build again");
		//one two
	}
}
