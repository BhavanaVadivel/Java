
public class BirdApp {

	public static void main(String[] args) {
		Sky s = new Sky();
		s.PermitsBirds(new GoldenEagle());
		s.PermitsBirds(new SerpantEagle());
		s.PermitsBirds(new MountainEagle());
		
		s.PermitsBirds(new VegSparrow());
		s.PermitsBirds(new NonVegSparrow());
	}
	

}
