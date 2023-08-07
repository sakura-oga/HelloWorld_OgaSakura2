package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// 1 ローカル変数の宣言
		
		// バイト型
		byte myByte; 
		
		// 短整数型
		short myShort;
		
		// 整数型
		int myInt; 
		
		// 長整数型
		long myLong; 
		
		// 単精度浮動小数点数型
		float myFloat; 
		
		// 倍精度浮動小数点数型
		double myDouble; 
		
		// 文字型
		char myChar; 
		
		// 文字列型
		String myString; 
		
		// ブーリアン型
		boolean myBoolean; 
		
		
		// 2 ローカル変数の初期値
		
		// バイト型
		myByte = 0; 
		
		// 短整数型
		myShort = 0; 
		
		// 整数型
		myInt = 0; 
		
		// 長整数型
		myLong = 0L; 
		
		// 単精度浮動小数点数型
		myFloat = 0.0f; 
		
		// 倍精度浮動小数点数型
		myDouble = 0.0d; 
		
		// 文字型
		myChar = '\u0000'; 
		
		// 文字列型
		myString = null; 
		
		// ブーリアン型
		myBoolean = false; 
		
		
		// 3 値の代入 
		
		// バイト型
		myByte = 10; 
		
		// 短整数型
		myShort = 100; 
		
		// 整数型
		myInt = 1000; 
		
		// 長整数型
		myLong = 10000L; 
		
		// 単精度浮動小数点数型
		myFloat = 9.5f; 
		
		// 倍精度浮動小数点数型
		myDouble = 10.5; 
		
		// 文字型
		myChar = 'a'; 
		
		// 文字列型
		myString = "ハロー"; 
		
		// ブーリアン型
		myBoolean = true; 
		
		
		// 4 
		
		// 11110を出力
		System.out.println(myByte + myShort + myInt + myLong); 
		
		// 20を出力
		myByte += myByte;
		System.out.println(myByte); 
		
		// a ハロー trueを出力
		System.out.println(myChar + myString + myBoolean); 
		
		// 11130を出力
		System.out.println(myByte + myShort + myInt + myLong + myByte); 
		
		// 10000000000を出力
		System.out.println(myByte * myShort * myInt * myLong); 
		
		// 0.105を出力
		System.out.println(myDouble / myShort); 
		
		// -90を出力
		myByte = 10;
		System.out.println(myByte - myShort); 
        
		
        // 5 ハローJAVA43と出力したい
		
		// 20を文字列として判断されないようにint型に置き換える
		int num = 20; 
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));

		
		// 6 山田太郎 18歳 170.5cm 62.2kg 寿司 と出力
		
		// 人物情報を変数指定
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String favoriteFood = "寿司";
        
        // [初めまして山田太郎です]をコンソールに出力
        System.out.println("初めまして" + name + "です");
        
        // [年齢は18際です]をコンソールに出力
        System.out.println("年齢は" + age + "歳です");
        
        // [身長は170.5cmです]をコンソールに出力
        System.out.println("身長は" + height + "cmです");
        
        // [体重は62.2kgです]をコンソールに出力
        System.out.println("体重は" + weight + "kgです");
        
        // [好きな食べ物は寿司です]をコンソールに出力
        System.out.println("好きな食べ物は" + favoriteFood + "です");

        
        // 7 作成した自己紹介に続いてBMIが出力されるように
        
        // BMIを計算し変数宣言
     	double bmi = weight / ((height / 100) * (height / 100));
     		
     	// BMIを小数点第二位で四捨五入
     	bmi = ((double)Math.round(bmi * 10)) / 10;
     		
     	// [BMIは〇〇です]をコンソールに出力
     	System.out.println("BMIは" + bmi + "です");

        
        // 8 6で宣言した変数に再代入し出力
     	
     	// 人物情報の変数を再代入
     	name = "鈴木一郎";
     	age = 24;
     	height = 168.5;
     	weight = 64.2;
     	favoriteFood = "オムライス";
     		
     	// [初めまして鈴木一郎です]をコンソールに出力
     	System.out.println("初めまして" + name + "です");
     		
     	// [年齢は24歳です]をコンソールに出力
     	System.out.println("年齢は" + age + "歳です");
     		
     	// [身長は168.5cmです]をコンソールに出力
     	System.out.println("身長は" + height + "cmです");
     		
     	// [体重は64.2kg]をコンソールに出力
     	System.out.println("体重は" + weight + "kgです");
     		
     	// [好きな食べ物はオムライスです]をコンソールに出力
     	System.out.println("好きな食べ物は" + favoriteFood + "です");
     		
     	// BMIの再計算
     	bmi = weight / ((height / 100) * (height / 100));
     		
     	// BMIを小数点第二位で四捨五入
     	bmi = ((double)Math.round(bmi * 10)) / 10;
     	
     	// [BMIは22.6です]をコンソールに出力
     	System.out.println("BMIは" + bmi + "です");

        
        // 9 8で使用した変数（年齢・身長・体重）の数値を和算で自己代入し出力
     	
     	// [年齢・身長・体重]の数値を和算で自己代入
     	age += age;
     	height += height;
     	weight += weight;
     		
     	// [初めまして鈴木一郎です]をコンソールに出力
     	System.out.println("初めまして" + name + "です");
     		
     	// [年齢は48歳です]をコンソールに出力
     	System.out.println("年齢" + age + "歳です");
     		
     	// [身長は337.0cmです]をコンソールに出力
     	System.out.println("身長は" + height + "cmです");
     		
     	// [体重は128.4kgです]をコンソールに出力
     	System.out.println("体重は" + weight + "kgです");
     		
     	// [好きな食べ物はオムライスです]をコンソールに出力
     	System.out.println("好きな食べ物は" + favoriteFood + "です");
     		
     	// BMIの再計算
     	bmi = weight / ((height / 100) * (height / 100));
     		
     	// BMIを小数点第三位で四捨五入
     	bmi = ((double)Math.round(bmi * 100)) / 100;
     		
     	// [BMIは11.31です]をコンソールに出力
     	System.out.println("BMIは" + bmi + "です");

        
        // 10 8で使用した年齢が25歳以上ならtrueと出力されるようにする
     	
     	// 8の[年齢・身長・体重]を再代入
     	age = 24;
     	height = 168.5;
     	weight = 64.2;
     		
     	// 年齢が25歳以上ならコンソールにtrueを出力
     	String result = age >= 25 ? "true" : "false";
     	System.out.println(result);
	
        
        // 11 8の年齢・身長・体重を文字型に
     	
     	// [年齢・身長・体重]を文字列に型変換
     	String strAge = String.valueOf(age);
     	String strHeight = String.valueOf(height);
     	String strWeight = String.valueOf(weight);
     		
     	// [年齢・身長・体重]を繋げてコンソールへ出力
     	System.out.println(strAge + strHeight + strWeight);
        
        
        // 12 11で使用した年齢・身長を整数型に
       
     	// [年齢]を文字列身から整数型に変換
     	age = Integer.parseInt(strAge);
     		
     	// [身長]を文字列から小数型に変換
     	height = Double.parseDouble(strHeight);
     		
     	// [身長]を小数型から整数型に変換
     	int iHeight = (int)Math.round(height);
     		
     	// 整数型に変換した[年齢・身長]をコンソールに出力
     	System.out.println(age);
     	System.out.println(iHeight);
        
		
        // 13 12で変換した年齢。身長で年齢が25もしくは身長が160以上であればtrueと出力
     	
     	// [年齢が25もしくは身長が160以上]であればtrueを出力
     	result = age == 25 || iHeight >= 160 ? "true" : "false";
     	System.out.println(result);
	}
}
