package curriculum_B;

// Javaのプログラム内で Scanner クラスを使用する為のインポート文
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Qes1_3 {
	
	public static void main(String[] args) {
		// scanインスタンスを作成
		Scanner scan = new Scanner(System.in);

		// 入力した値を取得しnameに代入
		String name = scan.nextLine();

		// 入力された値がnullの場合処理
		if(name == null) {
			// [名前を入力してください]を出力
			System.out.println("名前を入力してください");
		}
		
		// 入力された文字数が0文字以下の場合処理
		else if(name.length() <= 0) {
			// [名前を入力してください]を出力
			System.out.println("名前を入力してください");
		}
		
		// 入力された文字数が10文字より大きい場合処理
		else if(name.length() > 10) {
			// [名前を10文字以内にしてください]を出力
			System.out.println("名前を10文字以内にしてください");
		}
		
		// 入力された値が正常(文字数ok/半角英数字のみ)だった場合処理
		else if(Pattern.matches("^[A-Z a-z 0-9]+$", name)) {
			// [ユーザー名「入力値」を登録しました]を出力
			System.out.println("ユーザー名「" + name + "」を登録しました");
			// 配列にてじゃんけんの手を用意
			String janken[] = {"グー", "チョキ", "パー"};
			// 自分の出す手を変数宣言
			String myHand;
			// 相手の出す手を変数宣言
			String yourHand;
			// じゃんけん回数を0とし初期化
			int i = 0;
			// 最低１回は処理行うため、[do-while文]にてループ処理
			do {
				// Randomインスタンス作成し変数に代入
				Random rnd = new Random();
				// [janken.length]の範囲でランダムな数値を取得し代入
				int index = rnd.nextInt(janken.length);
				// ランダムに取得された自分の手を変数に代入
				myHand = janken[index];
				// 自分の手と相手の手が同じになってしまうため、再度ランダムな値を代入
				index = rnd.nextInt(janken.length);
				// ランダムに取得された相手の手を代入
				yourHand = janken[index];

				// 自分と相手の手をコンソールに出力
				System.out.println(name + "の手は「" + myHand + "」");
				System.out.println("相手の手は「" + yourHand + "」\n");

				// 自分が勝った場合処理
				if(myHand == "グー" && yourHand == "チョキ" || myHand == "チョキ" && yourHand == "パー"|| myHand == "パー" && yourHand == "グー") {
					// コンソールにメッセージ出力
					System.out.println("やるやん。\n次は俺にリベンジさせて\n");
				}
				
				// グーに負けた場合処理
				else if(myHand == "チョキ" && yourHand == "グー") {
					// コンソールにメッセージ出力
					System.out.println("俺の勝ち！\n負けは次につながるチャンスです！\nネバーギブアップ\n");
				}
				
				// チョキに負けた場合処理
				else if(myHand == "パー" && yourHand == "チョキ") {
					// コンソールにメッセージ出力
					System.out.println("俺の勝ち！\nたかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n");
				}
				
				// パーに負けた場合処理
				else if(myHand == "グー" && yourHand == "パー") {
					// コンソールにメッセージ出力
					System.out.println("俺の勝ち！\nなんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n");
				}
				
				// あいこの場合処理
				else if(myHand == yourHand) {
					// コンソールにメッセージ出力
					System.out.println("DRAW あいこ もう一回しましょう！\n");
				}
				
				// i(じゃんけん回数)に＋１する
				i++;
				
			// じゃんけんで負けた場合かあいこの場合はもう一度処理を実行
			} while(myHand == "チョキ" && yourHand == "グー" || myHand == "パー" && yourHand == "チョキ"|| myHand == "グー" && yourHand == "パー" || myHand == yourHand);	
			
			// じゃんけんの合計回数をコンソールに出力
			System.out.println("勝つまでにかかった合計回数は" + i + "回です");		
		}
		
		// 入力された値が半角英数字以外の場合出力
		else {
			// [半角英数字のみで名前を入力してください]を出力
			System.out.println("半角英数字のみで名前を入力してください"); 
		}
	}	
}
		
		




