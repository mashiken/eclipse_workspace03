package sample;

public class Sample_if {

	public static void main(String[] args) {
		int percent = 30;
		// int�^�ϐ��@percent��錾
		// ���̕ϐ��͍~���m����ݒ肷��
		
		// �~���m����50%�ȏ�̏ꍇ
		if(percent >= 50) {
			System.out.println("�P�������Ă���");
		}else if(percent >= 30){
			System.out.println("�܂��ݎP�������Ă���");
		}else{
			System.out.println("�P�����");
		}

	}

}
