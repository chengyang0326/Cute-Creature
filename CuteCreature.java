import java.util.Random;

public class CuteCreature{
	protected String species;
	private int experienceForNextLevel;
	protected int level;
	private int currentHitPonts;
	protected int maxHitPoints;
	protected int attackRating;
	protected int defenseRating;
	private int experiencePonts;
	protected int experenceValue;
	private boolean isSpecial;

	public String getSpecies(){
		return species;
	}
	public int getLevel(){
		
			return level;

		
		
	}
	public int getCurrentHitPoints(){
		
			return currentHitPonts;
		
		
	}
	public int getExperienceForNextLevel(){
		
			return experienceForNextLevel;
		
		
	}
	public int getMaxHitPoints(){
		
			return maxHitPoints;
		
		
	}
	public int getAttackRate(){
		
			return attackRating;
		
		
	}
	public int getDefenseRating(){
		return defenseRating;
	}
	public int getExperiencePoints(){
		
			return experiencePonts;

		
		
	}
	public int getExperienceValue(){
		
			return experenceValue;

		
		
	}
	public boolean getIsSpecial(){
		return isSpecial;
	}

	public void setSpecies(String value){
		
		species= value;
	}
	public void setExperienceForNextLevel(int value){
		
		experienceForNextLevel= value;
	}

	public void setLevel (int value){
		if(value >0){
			level = value;

		}

	}
	public void setCurrentHitPoints(int value){
		if(value>=0){
			currentHitPonts = value;
		}
	}
	public void setMaxHitPoints(int value){
		if(value>=0){
			maxHitPoints = value;

		}
		
	}
	public void setAttackRate(int value){
		if(attackRating>=0){
			attackRating = value;

		}
		
	}
	public void setDefenseRating(int value){
		defenseRating =value;
	}
	public void setExperiencePoints(int value){
		if(experiencePonts>=0){
			experiencePonts=value;
		}
	}
	public void setExperienceValue(int value){
		if(experenceValue>=0){
			experenceValue = value;
	}

		}
		
	public void setIsSpecial(boolean value){
		isSpecial=value;
	}
	public CuteCreature(String species,int maxHitPoints,int attackRating,int defenseRating,int experenceValue,boolean special ){
		setSpecies(species);
		setMaxHitPoints(maxHitPoints);
		setAttackRate(attackRating);
		setDefenseRating(defenseRating);
		setExperienceValue(experenceValue);
		setIsSpecial(special);
		setLevel(1);
		setCurrentHitPoints(maxHitPoints);
		setMaxHitPoints(maxHitPoints);
		setExperiencePoints(0);
		if(level ==1){
			setExperienceForNextLevel(200);
		}
		else{
			setExperienceForNextLevel(200+(level-1)*75);
		}
	}
	public void levelUp(){

		level++;
		experenceValue+=15;
		currentHitPonts = maxHitPoints;
		if (level >=2 && level <=9){
			maxHitPoints +=7;
			attackRating +=3;
			defenseRating +=3;

		}
		if (level >=10){
			maxHitPoints +=2;
			attackRating +=1;
			defenseRating +=1;
		}
		System.out.println("Level Up !!!");

	}
	public void gainExp(int exp){
		experiencePonts += exp;
		System.out.println("Gain "+exp+" exp!");
		experienceForNextLevel=200;
		int cumulativeExperience;
		if(level == 1){
			experienceForNextLevel = 200;
		}
		else{
			experienceForNextLevel = 200+75*(level -1);
		}
		if(experiencePonts >= experienceForNextLevel){
			levelUp();

		}

	}
	public void takeDamage (int dmg){
		if(dmg<0){
			dmg = 1;
		

		}
		currentHitPonts -=dmg;
		
		
		if(currentHitPonts <= 0){
			System.out.println(species+" incapacitated!");
		}

		if(dmg>=0){
			System.out.println(" took "+dmg + " Damage!");
		}
		else{
			System.out.println(" took "+ 1 + " Damage!");
		}
		
	}
	public void attack (CuteCreature c){
		System.out.println(species + " attacks " +c.species+"! ");
		Random rand = new Random();
		int attack = rand.nextInt(100);
		if (attack <=15){
			System.out.print("Critical hit! "+species);
				c.takeDamage(2*(attackRating -c.defenseRating));
			

		}
		else if(attack <=35){
			System.out.println("Miss!");
		}
		else{
			System.out.println("Hit! "+species);
				c.takeDamage((attackRating -c.defenseRating));
			

		}
		if(c.currentHitPonts <= 0){
			gainExp(c.experenceValue);
		}
	}
	public String toString(){
		if(level==1){
			experienceForNextLevel=200;
		}
		else
		{
			experienceForNextLevel =200+(level-1)*75;


		}
		
		System.out.println("Level "+level +" "+ species);
		System.out.println("Level "+level +" "+ species);
		if(isSpecial){
			System.out.println("***** Special! *******");


		}
		System.out.println("HP: 	"+currentHitPonts) ;
		System.out.println("atk: 	"+attackRating);
		System.out.println("DEF: 	"+defenseRating);
		System.out.println("XP:	 	"+ experiencePonts +"/"+experienceForNextLevel) ;
		return "XP  Val: "+experenceValue;

		

	}
	

}