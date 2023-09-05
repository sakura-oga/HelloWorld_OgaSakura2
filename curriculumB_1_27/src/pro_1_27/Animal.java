package pro_1_27;

public class Animal {
	// 配列を宣言
	String[] data;

	// コンストラクタを作成
	public Animal(String d) {
		// 引数値を[:]で区切り配列に代入
		data = d.split(":");
	}

	// メソッドを作成
	public void display() {
		// コンソールへ出力
		System.out.println("動物名：" + data[0]);
		// コンソールへ出力
		System.out.println("体長：" + data[1] + "m");
		// コンソールへ出力
		System.out.println("速度：" + data[2] + "km/h");

		// 配列値で条件分岐
		switch(data[0]) {
			// ライオンの場合
			case "ライオン":
				// コンソールへ出力
				System.out.println("学名：パンテラ レオ\n");
				// 処理を終える
				break;
			// ゾウの場合
			case "ゾウ":
				// コンソールへ出力
				System.out.println("学名：ロキソドンタ・サイクロティス\n");
				// 処理を終える
				break;
			// パンダの場合
			case "パンダ":
				// コンソールへ出力
				System.out.println("学名：アイルロポダ・メラノレウカ\n");
				// 処理を終える
				break;
			// チンパンジーの場合
			case "チンパンジー":
				// コンソールへ出力
				System.out.println("学名：パン・トゥログロディテス\n");
				// 処理を終える
				break;
			// シマウマの場合
			case "シマウマ":
				// コンソールへ出力
				System.out.println("学名：チャップマンシマウマ\n");
				// 処理を終える
				break;
			// インコの場合
			case "インコ":
				// コンソールへ出力
				System.out.println("学名：不明\n");
				// 処理を終える
				break;
		}
	}
}
