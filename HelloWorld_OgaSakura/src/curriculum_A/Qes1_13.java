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
		byte myByte = 10;
		// 短整数型に値を代入
		short myShort = 100;
		// 整数型に値を代入
		int myInt = 1000;
		// 長整数型に値を代入
		long myLong = 10000;
		// 単精度浮動小数点数型に値を代入
		float myFloat = 9.5f;
		// 倍精度浮動小数点数型に値を代入
		double myDouble = 10.5;
		// 文字型に値を代入S
		char myChar = 'a';
		// 文字列型に値を代入
		String myString = "ハロー";
		// ブーリアン型に値を代入
		boolean myBoolean = true;
		
		// 11110を出力。
		// 変数の定義	
		byte myByte = 11;
		short myShort = 110;
		int myInt = 10000;
		long myLong = 0;
		// 定義したものを出力
		long result = myByte + myShort + myInt + myLong;
		System.out.println(result);

		// 20を出力。
		// 変数の定義	
		byte myByte = 1;
		short myShort = 2;
		int myInt = 3;
		long myLong = 14;
		// 定義したものを出力
		long result = myByte + myShort + myInt + myLong;
		System.out.println(result);
		
		// a ハロー trueを出力。
		// 変数の定義
		byte myByte = 97;
		short myShort = 0;
		int myInt = 0;
		long myLong = 0;
		char myChar = (char) myByte;
		String myString = "ハロー";
		boolean myBoolean = true;
		// 定義したものを出力
		System.out.println(myChar + " " + myString + " " + myBoolean);
        
		// 11130を出力
		// 変数の定義
		byte myByte = 11;
		short myShort = 110;
		int myInt = 10000;
		long myLong = 9;
		// 定義したものを出力
		long result = myByte * 1000 + myShort + myInt + myLong;
		System.out.println(result);
		
		// 10000000000を出力。
		// 変数の定義
		byte myByte = 0;
		short myShort = 0;
		int myInt = 0;
		long myLong = 10000000000L;
		// 定義したものを出力
		System.out.println(myLong);
		
		// 0.105を出力。
		// 変数の定義
		byte myByte = 0;
		short myShort = 0;
		int myInt = 0;
		long myLong = 0;
		float myFloat = 0.105f;
		// 定義したものを出力
		System.out.println(myFloat);
		
		// -90を出力。
		// 変数の定義
		byte myByte = 0;
		short myShort = 0;
		int myInt = 0;
		long myLong = 0;
		float myFloat = 0;
		double myDouble = -90.0;
		// 定義したものを出力
		System.out.println(myDouble);
        
        //ハローJAVA43と出力したい
		String num = "20";
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + String.valueOf(num1)));

		// 自己紹介
		// 氏名
		String name = "山田太郎";
		// 年齢
		int age = 18;
		// 身長
		double height = 170.5;
		// 体重
		double weight = 62.2;
		// 好きな食べ物
        String favoriteFood = "寿司";
        //自己紹介を出力する処理
        System.out.println("初めまして" + name + "です。");
        System.out.println("年齢は" + age + "歳です。");
        System.out.println("身長は" + height + "cmです。");
        System.out.println("体重は" + weight + "kgです。");
        System.out.println("好きな食べ物は" + favoriteFood + "です。");       
        
        // BMIの計算
	    public static double calculateBMI(double height, double weight) {
	        double heightInMeter = height / 100.0;
	        return weight / (heightInMeter * heightInMeter);
	    }   
	    
		// 問8
	    // 変数を定義
        String name = "鈴木一郎";
        int age = 24;
        double height = 168.5;
        double weight = 64.2;
        String favoriteFood = "オムライス";

        double bmi = weight / ((height / 100) * (height / 100));
        
        // 処理を実行
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");   

		// 問9
        // 変数を定義
    	int age = 24;
        double height = 168.5;
        double weight = 64.2;

        age *= 2;
        height *= 2;
        weight *= 2;

        String name = "鈴木一郎";
        String favoriteFood = "オムライス";

        double bmi = weight / ((height / 100) * (height / 100));
        
        // 処理を実行
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");    
	
		// 問10
        // 変数を定義
        int age = 24;
        double height = 168.5;
        double weight = 64.2;

        age *= 2;
        height *= 2;
        weight *= 2;

        String name = "鈴木一郎";
        String favoriteFood = "オムライス";

        double bmi = weight / ((height / 100) * (height / 100));
        boolean isOver25 = age >= 25;
        
        // 処理を実行
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
        System.out.println("25歳以上：" + isOver25);   
		    
		// 問11
        // 変数を定義
        int age = 24;
        double height = 168.5;
        double weight = 64.2;

        age *= 2;
        height *= 2;
        weight *= 2;

        String name = "鈴木一郎";
        String favoriteFood = "オムライス";

        double bmi = weight / ((height / 100) * (height / 100));
        boolean isOver25 = age >= 25;
        
        // 処理を実行
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + String.valueOf(age) + "歳です");
        System.out.println("身長は" + String.valueOf(height) + "cmです");
        System.out.println("体重は" + String.valueOf(weight) + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
        System.out.println("25歳以上：" + String.valueOf(isOver25));   
		    
		// 問12
        // 変数を定義
        int age = 24;
        double height = 168.5;
        double weight = 64.2;

        age *= 2;
        height *= 2;
        weight *= 2;

        String name = "鈴木一郎";
        String favoriteFood = "オムライス";

        double bmi = weight / ((height / 100) * (height / 100));
        boolean isOver25 = age >= 25;

        // 処理を実行
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + (int) height + "cmです"); // heightをint型にキャスト
        System.out.println("体重は" + String.valueOf(weight) + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
        System.out.println("25歳以上：" + String.valueOf(isOver25));   
		 
		// 問13
        // 変数を定義
        int age = 24;
        double height = 168.5;
        double weight = 64.2;

        age *= 2;
        height *= 2;
        weight *= 2;

        String name = "鈴木一郎";
        String favoriteFood = "オムライス";

        double bmi = weight / ((height / 100) * (height / 100));
        boolean isOver25 = age >= 25;
        boolean isTall = height >= 160.0;

        // 処理を実行
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + (int) height + "cmです");
        System.out.println("体重は" + String.valueOf(weight) + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
        System.out.println("25歳以上：" + String.valueOf(isOver25));
        System.out.println("身長160cm以上：" + String.valueOf(isTall));           

	}
}
