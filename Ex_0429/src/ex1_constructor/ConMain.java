package ex1_constructor;

public class ConMain {

	public static void main(String[] args) {

		//생성자를 통해 heap메모리에 주소값을 할당 받는 작업
		ConTest ct = new ConTest();
		//ct.ConTest(); <-- 생성자는 new를 통해 만들어질 때를 제외하면 그 이후에는 호출이 불가
	}

}
