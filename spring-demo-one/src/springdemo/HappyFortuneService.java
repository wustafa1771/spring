package springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return " Happy fortune Service. ";
	}

}
