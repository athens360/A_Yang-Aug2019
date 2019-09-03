//Andrew Yang
//apcs3rd
//8/29/18
//library of math functions
public class Calculate {
	public static int square(int number) {
		int answer;
		answer=number*number;
		return answer;
	}
	public static int cube(int number) {
		int answer=number*number*number;
		return answer;
	}
	public static double average(double numberone, double numbertwo) {
		double answer=(numberone+numbertwo)/2;
		return answer;
	}
	public static double average(double numberone, double numbertwo, double numberthree) {
		double answer=(numberone+numbertwo+numberthree)/3;
		return answer;
	}
}
