package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 1 ローカル変数の宣言
		byte myByte; // バイト型
		short myShort; // 短整数型
		int myInt; // 整数型
		long myLong; // 長整数型
		float myFloat; // 単精度浮動小数点数型
		double myDouble; // 倍精度浮動小数点数型
		char myChar; // 文字型
		String myString; // 文字列型
		boolean myBoolean; // ブーリアン型
		
		
		// TODO 2 ローカル変数の初期値
		myByte = 0; // バイト型
		myShort = 0; // 短整数型
		myInt = 0; // 整数型
		myLong = 0L; // 長整数型
		myFloat = 0.0F; // 単精度浮動小数点数型
		myDouble = 0.0; // 倍精度浮動小数点数型
		myChar = '\u0000'; // 文字型
		myString = null; // 文字列型
		myBoolean = false; // ブーリアン型
		
		
		// TODO 3 値の代入 
		myByte = 10; // バイト型
		myShort = 100; // 短整数型
		myInt = 1000; // 整数型
		myLong = 10000; // 長整数型
		myFloat = 9.5f; // 単精度浮動小数点数型
		myDouble = 10.5; // 倍精度浮動小数点数型
		myChar = 'a'; // 文字型
		myString = "ハロー"; // 文字列型
		myBoolean = true; // ブーリアン型
		
		
		// TODO 4 
		System.out.println(myByte + myShort + myInt + myLong); // 11110を出力
		System.out.println(2 * myByte); // 20を出力
		System.out.println(myChar + myString + myBoolean); // a ハロー trueを出力
		System.out.println(myByte + myShort + myInt + myLong + 2 * myByte); // 11130を出力
		System.out.println(myByte * myShort * myInt * myLong); // 10000000000を出力
		System.out.println(myDouble / myShort); // 0.105を出力
		System.out.println(myByte - myShort); // -90を出力
        
        // TODO 5 ハローJAVA43と出力したい
		int num = 20; // 20を文字列として判断されないようにint型に置き換える
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));

		
		// TODO 6 山田太郎 18歳 170.5cm 62.2kg 寿司 と出力
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String favoriteFood = "寿司";
        System.out.println("初めまして" + name + "です。");
        System.out.println("年齢は" + age + "歳です。");
        System.out.println("身長は" + height + "cmです。");
        System.out.println("体重は" + weight + "kgです。");
        System.out.println("好きな食べ物は" + favoriteFood + "です。");

        
        // TODO 7 作成した自己紹介に続いてBMIが出力されるように
        double bmi = weight / Math.pow(height / 100, 2);
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

        
        // TODO 8 6で宣言した変数に再代入し出力
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        favoriteFood = "オムライス";
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        bmi = weight / Math.pow(height / 100, 2);
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

        
        // TODO 9 8で使用した変数（年齢・身長・体重）の数値を和算で自己代入し出力
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
        int ageSum = age + age;
        double heightSum = height + height;
        double weightSum = weight + weight;
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + ageSum + "歳です");
        System.out.println("身長は" + heightSum + "cmです");
        System.out.println("体重は" + weightSum + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        bmi = weightSum / Math.pow(heightSum / 100, 2);
        System.out.println("BMIは" + String.format("%.1f", bmi) + "です");

        
        // TODO 10 8で使用した年齢が25歳以上ならtrueと出力されるようにする
        boolean isAbove25 = age >= 25;
        System.out.println(isAbove25);
	
        
        // TODO 11 型変換 文字型
        String ageStr = String.valueOf(age);
        String heightStr = String.valueOf(height);
        String weightStr = String.valueOf(weight);
        System.out.println(ageStr + heightStr + weightStr);
        
        
        // TODO 12 型変換 整数型
        int ageInt = (int) age;
        int heightInt = (int) height;
        System.out.println(ageInt);
        System.out.println(heightInt);
		
        
        // TODO 13 12で変換した年齢。身長で年齢が25もしくは身長が160以上であればtrueと出力
        boolean check = ageInt == 25 || heightInt >= 160;
        System.out.println(check);
	}
}
