package HwExt;


public abstract class Hero {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	
    private MoveStrategy moveStrategy; //
    private DefendStrategy defendStrategy; //
	
    public void info() { //
    	System.out.println(name +  "\t\t" + level + "lv" + "\t" + exp);
    }
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	
    public void setMoveStrategy(MoveStrategy moveStrategy) { //
        this.moveStrategy = moveStrategy;
    }
    
    public void setDefendStrategy(DefendStrategy defendStrategy) { //
        this.defendStrategy = defendStrategy;
    }
    
    
	public abstract void attack();
	
    public void move() { //
        if (moveStrategy != null) {
            moveStrategy.move();
        }
    }
    
    public void defend() { //
        if (defendStrategy != null) {
            defendStrategy.defend();
        }
    }
}

