package springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email;
	private String team;
	public CricketCoach() {
		System.out.println("crcoach constructor");
	}

	@Override 
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return " Daiy workout for cricket coach ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "cricket  coach fs -> "+ fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
}
