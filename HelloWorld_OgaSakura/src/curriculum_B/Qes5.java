package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// [課題5]をコンソールに出力
		System.out.println("課題5");

		// iの値が9以下の時ループ処理を行なう
		for(int i = 1; i <= 9; i++) {
			// iの値が変わる毎に改行する
			System.out.println();

			// jの値が20以下の時ループ処理を行なう
			for(int j = 1; j <= 20; j++) {
				// [i * j = (i * j)]の値を三桁表示でコンソールに出力
				System.out.print(String.format("%03d", j) + " * " + String.format("%03d", i) + " = " + String.format("%03d", (j * i)));
				
				// 式と式の間に[ || ]を入れる
				if(j <= 19) {
					System.out.print(" || ");
				}
			}
		}
	}
}
