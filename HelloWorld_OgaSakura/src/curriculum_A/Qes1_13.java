package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// バイト型を定義し初期値を代入
		byte myByte = 10;
		// 短整数型を定義し初期値を代入
		short myShort = 1000;
		// 整数型を定義し初期値を代入
		int myInt = 2000000;
		// 長整数型を定義し初期値を代入
		long myLong = 3000000000L;
		// 単精度浮動小数点数型を定義し初期値を代入
		float myFloat = 3.14f;
		// 倍精度浮動小数点数型を定義し初期値を代入
		double myDouble = 3.14159;
		// 文字型を定義し初期値を代入
		char myChar = 'A';
		// 文字列型を定義し初期値を代入
		String myString = "Hello";
		// ブーリアン型を定義し初期値を代入
		boolean myBoolean = true;
		
		
		// バイト型に値を代入
		myByte = 10;
		// 短整数型に値を代入
		myShort = 100;
		// 整数型に値を代入
		myInt = 1000;
		// 長整数型に値を代入
		myLong = 10000;
		// 単精度浮動小数点数型に値を代入
		myFloat = 9.5f;
		// 倍精度浮動小数点数型に値を代入
		myDouble = 10.5;
		// 文字型に値を代入S
		myChar = 'a';
		// 文字列型に値を代入
		myString = "ハロー";
		// ブーリアン型に値を代入
		myBoolean = true;
		
		// 11110を出力。
		// 変数の定義	
		myByte = 11;
		myShort = 110;
		myInt = 10000;
		myLong = 0;
		// 定義したものを出力
		long result = myByte + myShort + myInt + myLong;
		System.out.println(result);

		// 20を出力。
		// 変数の定義	
		myByte = 1;
		myShort = 2;
		myInt = 3;
		myLong = 14;
		// 定義したものを出力
		result = myByte + myShort + myInt + myLong;
		System.out.println(result);
		
		// a ハロー trueを出力。
		// 変数の定義
		myByte = 97;
		myShort = 0;
		myInt = 0;
		myLong = 0;
		myChar = (char) myByte;
		myString = "ハロー";
		myBoolean = true;
		// 定義したものを出力
		System.out.println(myChar + " " + myString + " " + myBoolean);
        
		// 11130を出力
		// 変数の定義
		myByte = 11;
		myShort = 110;
		myInt = 10000;
		myLong = 9;
		// 定義したものを出力
		result = myByte * 1000 + myShort + myInt + myLong;
		System.out.println(result);
		
		// 10000000000を出力。
		// 変数の定義
		myByte = 0;
		myShort = 0;
		myInt = 0;
		myLong = 10000000000L;
		// 定義したものを出力
		System.out.println(myLong);
		
		// 0.105を出力。
		// 変数の定義
		myByte = 0;
		myShort = 0;
		myInt = 0;
		myLong = 0;
		myFloat = 0.105f;
		// 定義したものを出力
		System.out.println(myFloat);
		
		// -90を出力。
		// 変数の定義
		myByte = 0;
		myShort = 0;
		myInt = 0;
		myLong = 0;
		myFloat = 0;
		myDouble = -90.0;
		// 定義したものを出力
		System.out.println(myDouble);
        
        //ハローJAVA43と出力したい
		String num = "20";
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + String.valueOf(num1)));

		
		// 問7 自己紹介1
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String favoriteFood = "寿司";

        // 自己紹介1を出力
        System.out.println("初めまして" + name + "です。");
        System.out.println("年齢は" + age + "歳です。");
        System.out.println("身長は" + height + "cmです。");
        System.out.println("体重は" + weight + "kgです。");
        System.out.println("好きな食べ物は" + favoriteFood + "です。");

        // BMIの計算
        double bmi = weight / ((height / 100) * (height / 100));

        // BMIを出力
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

        
        // 問8 自己紹介2
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        favoriteFood = "オムライス";

        // 自己紹介2を出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");

        // BMIの計算
        bmi = weight / ((height / 100) * (height / 100));

        // BMIを出力
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");


        // 問9 自己紹介3
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        favoriteFood = "オムライス";

        // 自己紹介3を出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");

        // BMIの計算
        bmi = weight / ((height / 100) * (height / 100));

        // BMIを出力
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");  
	
        
        // 問10
        // 変数を定義
        age = 24;
        height = 168.5;
        weight = 64.2;

        age *= 2;
        height *= 2;
        weight *= 2;

        name = "鈴木一郎";
        favoriteFood = "オムライス";

        double heightInMeter = height / 100.0;
        bmi = weight / (heightInMeter * heightInMeter);

        // 処理を実行
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

		    
        // 問11
        // 変数を定義
        age = 24;
        height = 168.5;
        weight = 64.2;

        age *= 2;
        height *= 2;
        weight *= 2;

        name = "鈴木一郎";
        favoriteFood = "オムライス";

        // BMIの計算
        heightInMeter = height / 100.0;
        bmi = weight / (heightInMeter * heightInMeter);

        // 処理を実行
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
        
		
        // 問12のコード
        // 変数を定義
        age = 24;
        height = 168.5;
        weight = 64.2;

        // 2倍に更新
        age *= 2;
        height *= 2;
        weight *= 2;

        name = "鈴木一郎";
        favoriteFood = "オムライス";

        bmi = weight / ((height / 100) * (height / 100));
        boolean isOver25 = age >= 25;

        // 処理を実行
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
        System.out.println("25歳以上：" + isOver25);


        // 問13
        // 問13での処理を実行
        boolean isTall = height >= 160.0;
        System.out.println("身長160cm以上：" + String.valueOf(isTall));

        
	}
}
