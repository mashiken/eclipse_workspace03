package sample;

public class Sample_if {

	public static void main(String[] args) {
		int percent = 30;
		// int型変数　percentを宣言
		// この変数は降水確率を設定する
		
		// 降水確率が50%以上の場合
		if(percent >= 50) {
			System.out.println("傘を持っていく");
		}else if(percent >= 30){
			System.out.println("折り畳み傘を持っていく");
		}else{
			System.out.println("傘いらぬ");
		}

	}

}
