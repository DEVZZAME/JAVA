package ex5_interface;

public class Kitchen implements Menu3{
	//인터페이스는 추상메서드만 존재하기 때문에 다중구현이 가능
	
	@Override
	public String jjajang() {
		return "중면  + 춘장 + 완두콩";
	}
	
	@Override
	public String jjambbong() {
		return "담치 + 오징어 + 꼴뚜기";
	}

	@Override
	public String tangsuyuck() {
		return "돼지고기 + 당근 + 양파";
	}

	@Override
	public String nanjawans() {
		return "난자 + 완스";
	}

	@Override
	public String friedrice() {
		return "짜장소스 + 달걀";
	}






}
