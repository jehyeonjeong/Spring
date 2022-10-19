package polymorphism;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	
	@Resource(name="sony")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("LgTV 객체생성");
	}
	
	
	
	
	public void powerOn() {
		System.out.println("전원을 키다");
	}
	public void powerOff() {
		System.out.println("전원을 끄다");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
	
}
