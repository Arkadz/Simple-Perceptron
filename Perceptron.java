
public class Perceptron {
	public static int numb = 15;
	public static int[] input = new int[numb];
	public static int[] weight = new int[input.length];
	
	public static int porog = 7;
	public static boolean output;
	
	public static int[] num0 = {1,1,1,1,0,1,1,0,1,1,0,1,1,1,1};
	public static int[] num1 = {0,0,1,0,0,1,0,0,1,0,0,1,0,0,1};
	public static int[] num2 = {1,1,1,0,0,1,1,1,1,1,0,0,1,1,1};
	public static int[] num3 = {1,1,1,0,0,1,1,1,1,0,0,1,1,1,1};
	public static int[] num4 = {1,0,1,1,0,1,1,1,1,0,0,1,0,0,1};
	public static int[] num5 = {1,1,1,1,0,0,1,1,1,0,0,1,1,1,1};
	public static int[] num6 = {1,1,1,1,0,0,1,1,1,1,0,1,1,1,1};
	public static int[] num7 = {1,1,1,0,0,1,0,1,0,0,1,0,0,1,0};
	public static int[] num8 = {1,1,1,1,0,1,1,1,1,1,0,1,1,1,1};
	public static int[] num9 = {1,1,1,1,0,1,1,1,1,0,0,1,1,1,1};
	
	static int[] num51 = new int[]{1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1};
    static int[] num52 = new int[]{1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1};
    static int[] num53 = new int[]{1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1};
    static int[] num54 = new int[]{1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1};
    static int[] num55 = new int[]{1, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1};
    static int[] num56 = new int[]{1, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1};
	
	
	public static int[][] num = {
	/* 0 */		{1,1,1,1,0,1,1,0,1,1,0,1,1,1,1},
	/* 1 */		{0,0,1,0,0,1,0,0,1,0,0,1,0,0,1},
	/* 2 */ 	{1,1,1,0,0,1,1,1,1,1,0,0,1,1,1},
	/* 3 */		{1,1,1,0,0,1,1,1,1,0,0,1,1,1,1},
	/* 4 */		{1,0,1,1,0,1,1,1,1,0,0,1,0,0,1},
	/* 5 */		{1,1,1,1,0,0,1,1,1,0,0,1,1,1,1},
	/* 6 */ 	{1,1,1,1,0,0,1,1,1,1,0,1,1,1,1},
	/* 7 */ 	{1,1,1,0,0,1,0,1,0,0,1,0,0,1,0},
	/* 8 */		{1,1,1,1,0,1,1,1,1,1,0,1,1,1,1},
	/* 9 */		{1,1,1,1,0,1,1,1,1,0,0,1,1,1,1},
	};

	public static void crtWght () {
		for (int i = 0; i<input.length; i++) {
			weight[i] = 0;
		}
	}
	public static void increase() {
		for (int i=0; i<weight.length; i++) {if (input[i]==1) ++weight[i];}
			}
	public static void decrease() {
		for (int i=0; i<weight.length; i++) {if (input[i]==1) --weight[i];}
	}
	public static void learning (int x, int number) {
		crtWght();
				//int i = 0;
		for (int y=0;y<=x;y++) {
			int sum = 0;
			int i = (int)(Math.random()*10);
						
			for (int k=0; k<input.length; k++) {
				input[k] = num[i][k];
				sum += input[k]*weight[k]; 
			}
		if (sum<=porog && i==number) increase();
		if (sum>porog && i!=number) decrease();
		//i++;
		//if (i==10) i=0;
		}
		
	
	}	
	
	public static boolean testing (int[] number) {
		int net = 0;
		for (int i=0;i<number.length;i++) {
			net += weight[i]*number[i];
		}
		if (net > porog) {return true;}
		else return false;
		
	}
	
	public static void result() {
				
		for (int x=1; x<=weight.length; x++) {
			if (x%3==0 && x!=0) {
				System.out.println(" " + weight[--x]);++x;
				} else {
					System.out.print(" " + weight[--x]);++x;
			}
		}
		
	}
		
	public static void main(String[] args) {
		 		int x = 5;
				learning(1000000, x);
				result();
		System.out.println("Является ли цифра 0 цифрой "+x+" ? " + testing(num0));
		System.out.println("Является ли цифра 1 цифрой "+x+" ? " + testing(num1));
		System.out.println("Является ли цифра 2 цифрой "+x+" ? " + testing(num2));
		System.out.println("Является ли цифра 3 цифрой "+x+" ? " + testing(num3));
		System.out.println("Является ли цифра 4 цифрой "+x+" ? " + testing(num4));
		System.out.println("Является ли цифра 5 цифрой "+x+" ? " + testing(num5));
		System.out.println("Является ли цифра 6 цифрой "+x+" ? " + testing(num6));
		System.out.println("Является ли цифра 1 цифрой "+x+" ? " + testing(num7));
		System.out.println("Является ли цифра 1 цифрой "+x+" ? " + testing(num8));
		System.out.println("Является ли цифра 1 цифрой "+x+" ? " + testing(num9));
		System.out.println("*Тестовая выборка*");
		System.out.println("Является ли цифра 5-1 цифрой "+x+" ? " + testing(num51));
		System.out.println("Является ли цифра 5-2 цифрой "+x+" ? " + testing(num52));
		System.out.println("Является ли цифра 5-3 цифрой "+x+" ? " + testing(num53));
		System.out.println("Является ли цифра 5-4 цифрой "+x+" ? " + testing(num54));
		System.out.println("Является ли цифра 5-5 цифрой "+x+" ? " + testing(num55));
		System.out.println("Является ли цифра 5-6 цифрой "+x+" ? " + testing(num56));
		}
}
