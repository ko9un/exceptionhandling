package sec03_throwsexception.EX01_ThrowsException_1;

//#1. �����޼��忡 ���� ���ܸ� ó���ϴ� ���
class A {
	
	void abc() {
		bcd();
	}	
	void bcd() {
		try {
			Thread.sleep(1000); //�Ϲݿ��� : InterruptedException
		} catch (InterruptedException e) {
			//����ó�� ����
		} 
	}
}

//#2. ���ܸ� ȣ�� �޼���� �����ϴ� ���
class B {
	void abc() {		
		try {
			bcd(); //�Ϲݿ��� : InterruptedException
		} catch (InterruptedException e) {
			//����ó�� ����
		}
	}
	void bcd() throws InterruptedException {
		Thread.sleep(1000); //�Ϲݿ��� : InterruptedException
	}
}


public class ThrowsException_1 {
	public static void main(String[] args) {
		
	}
}












