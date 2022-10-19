package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	@Autowired
	@Qualifier("apple")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV 객체 생성");
	}
	@Override
	public void powerOn() {
		System.out.println("LG TV를 켠다");
	} 
	@Override
	public void powerOff() {
		System.out.println("LG TV를 끈다");
	} 
	@Override
	public void volumeUp() {
		speaker.volumeUp();
//		System.out.println("LG 소리 올린다.");
	} 
	@Override
	public void volumeDown() {
		speaker.volumeDown();
//		System.out.println("LG 소리 내린다.");
	}
}
