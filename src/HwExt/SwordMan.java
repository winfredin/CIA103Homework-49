package HwExt;


public class SwordMan extends Hero {
	
	public SwordMan() {
		super();
        setMoveStrategy(new RunMoveStrategy()); //
        setDefendStrategy(new DefaultDefendStrategy()); //
	}
	
	public SwordMan(String name, int level, double exp) {
		super(name, level, exp);
        setMoveStrategy(new RunMoveStrategy()); //
        setDefendStrategy(new DefaultDefendStrategy()); //
	}
	
	@Override
	public void attack() {
		System.out.println("揮劍");
	}
	

}
