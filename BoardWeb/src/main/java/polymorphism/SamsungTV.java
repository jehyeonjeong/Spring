package polymorphism;

public class SamsungTV implements TV {
	
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리");
	}
	
	public void destoryMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 작업 처리");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV 전원 켜!!!!!!!!");
	}
	public void powerOff() {
		System.out.println("SamsungTV 전원 꺼!!!!!!!!");
	}
	public void volumeUp() {
		System.out.println("SamsungTV 소리 올려!!!!!!!!");
	}
	public void volumeDown() {
		System.out.println("SamsungTV 소리 내려!!!!!!!!");
	}
	
}
