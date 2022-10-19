package polymorphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	int price;

	public SamsungTV() {
		System.out.println("Samsung TV (1) 객체 생성");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker() 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("===> setPrice() 호출");
		this.price = price;
	}

	@Override
	public void powerOn() {
		System.out.println("Samsung TV를 켠다. (가격 : " + price + ")");
	} 
	@Override
	public void powerOff() {
		System.out.println("Samsung TV를 끈다");
	} 
	@Override
	public void volumeUp() {
		speaker.volumeUp();
	} 
	@Override
	public void volumeDown() {
		speaker.volumeDown();
	}
}
