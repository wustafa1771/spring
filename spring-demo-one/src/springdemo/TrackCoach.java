package springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "i am the track coach";
	}

	@Override
	public String getDailyFortune() {
		return "track coacth is using fortune service --> "+fortuneService.getFortune();
	}
	// initilization and destroy methods
	
	public void initMethod(){
		System.out.println("initilization method bean is initilized");
	}
	public void destroy(){
		System.out.println("bean destroyed");
	}
}
