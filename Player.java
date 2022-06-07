package submit;

public class Player {
	
	public int hp;
    public int mp;
    public int str;
    //public String type;
    //final private String[] TYPE = {"FIRE", "WATER", "EARTH", "AIR"};
    String name = null;
    
    public Player(String name) {
        this.name = name;
        this.hp = 100;
        this.mp = 100;
        this.str = 10;
        //this.type = this.TYPE[((int) (Math.random() * (this.TYPE.length)))];
        
    }
    
    public void attack(Monster target) {
        target.hp -= this.str;
    }
    
    public void defense() {
        this.mp -= 10;
    }

}
