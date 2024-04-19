public class InverseOperator {
	public static void main(String[] args) {
		//'!' 和 '^' 演示: 
		// '!':取反操作，真变假，假变真
		System.out.println(60 > 90);
		System.out.println(!(60 > 90));
		
		//a^b: 罗技异或，当 a和b 不同时，则结果为true，否则为false
		boolean b = (10 > 1) ^ (3 > 5);
		System.out.println("b=" + b);
	}
}