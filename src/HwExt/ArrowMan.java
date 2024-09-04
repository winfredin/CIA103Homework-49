package HwExt;


public class ArrowMan extends Hero {
	
	public ArrowMan() {
		super();
        setMoveStrategy(new RunMoveStrategy()); //
        setDefendStrategy(new DefaultDefendStrategy()); //
	}

	public ArrowMan(String name, int level, double exp) {
		super(name, level, exp);
        setMoveStrategy(new RunMoveStrategy()); //
        setDefendStrategy(new DefaultDefendStrategy()); //
	}

	@Override
	public void attack() {
		System.out.println("放弓箭");
	}


}

