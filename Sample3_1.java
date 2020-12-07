package sample;

public class Sample3_1 {
	public static void main(String[] arg) {
		//boolean型 二値論理 論理型 true false
		boolean a = true;
		//char型　1文字(1バイト)を保持 ''で囲う
		char b = 'A';
		//byte 整数型 -128～127まで格納可能
		byte c = 127;
		//short 整数型 -32768～32767
		short d = -32768;
		//int 整数型 -2147483648～2147483647
		int e = 2147483647;
		//long 整数型 -9223372036854775808～9223372036854775807
		//末尾に必ずL
		long f = 1000000000000L;
		//float型 単精度浮動小数点数型 小数
		float g = 15;
		//double型　倍精度浮動小数点数型 小数
		double h = 555.55;
		
		//変数の出力
		System.out.println("変数aの値は" + a);
		System.out.println("変数bの値は" + b);
		System.out.println("変数cの値は" + c);
		System.out.println("変数dの値は" + d);
		System.out.println("変数eの値は" + e);
		System.out.println("変数fの値は" + f);
		System.out.println("変数gの値は" + g);
		System.out.println("変数hの値は" + h);
	}
}
