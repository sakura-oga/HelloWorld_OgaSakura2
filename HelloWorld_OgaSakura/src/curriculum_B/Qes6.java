package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// scanインスタンス生成
		Scanner scan = new Scanner(System.in);

		// コンソールに入力された値を変数[line]に代入
		String line = scan.nextLine();
		// 入力された値を[、]で区切って配列[values]に代入
		String values[] = line.split("、");
		// rndインスタンス生成
		Random rnd = new Random();
		// 0~11の値をランダムで取得し変数[index]に代入
		int index = rnd.nextInt(11);
		
		// 配列[values]の長さ分ループ処理。値は変数[item]に代入
		for(String item: values) {
			// [item]の値で条件指定
			switch(item) {
				// [item]の値が"パソコン"なら下記の処理を実行
				case "パソコン":
					// 0~11の値をランダムで取得し再代入
					index = rnd.nextInt(11);
					// 残り台数をコンソールへ出力
					System.out.println(item + "の残り台数は" + index +  "台です\n");
					// switch文を抜ける
					break;
					
				// [item]の値が"冷蔵庫"なら下記の処理を実行
				case "冷蔵庫":
					// 0~11の値をランダムで取得し再代入
					index = rnd.nextInt(11);
					// 残り台数をコンソールへ出力
					System.out.println(item + "の残り台数は" + index + "台です\n");
					// switch文を抜ける
					break;
					
				// [item]の値が"扇風機"なら下記の処理を実行
				case "扇風機":
					// 0~11の値をランダムで取得し再代入
					index = rnd.nextInt(11);
					// 残り台数をコンソールへ出力
					System.out.println(item + "の残り台数は" + index + "台です\n");
					// switch文を抜ける
					break;

				// [item]の値が"洗濯機"なら下記の処理を実行
				case "洗濯機":
					// 0~11の値をランダムで取得し再代入
					index = rnd.nextInt(11);
					// 残り台数をコンソールへ出力
					System.out.println(item + "の残り台数は" + index + "台です\n");
					// switch文を抜ける
					break;

				// [item]の値が"加湿器"なら下記の処理を実行
				case "加湿器":
					// 0~11の値をランダムで取得し再代入
					index = rnd.nextInt(11);
					// 残り台数をコンソールへ出力
					System.out.println(item + "の残り台数は" + index + "台です\n");
					// switch文を抜ける
					break;
				
				// [item]の値が"テレビかディスプレイ"なら下記の処理を実行
				case "テレビ":
				case "ディスプレイ":
					// テレビとディスプレイの値が変わってしまうため、[index]の再代入は行わない
					// [item]の値がテレビなら[index]値、ディスプレイなら11から[index]値を引いた数を変数[result]へ代入
					int result = item.equals("テレビ") ? index: 11 - index;
					// 残り台数をコンソールへ出力
					System.out.println(item + "の残り台数は" + result + "台です\n");
					// switch文を抜ける
					break;
					
				// [item]の値が"その他"なら下記の処理を実行
				default:
					// メッセージをコンソールへ出力
					System.out.println("『" + item +  "』" + "は指定の商品ではありません\n");
					// switch文を抜ける
					break;
			}
			
		}
		
	}

}
