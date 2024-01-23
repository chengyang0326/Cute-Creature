public class EvolvableCuteCreature extends CuteCreature{
	private int levelToEvolution;
	private String evolvedSpecies;
	protected String attuned;

	public int getLevelToEvolution(){
		return levelToEvolution;
	}
	public String getEvolvedSpecies(){
		return evolvedSpecies;
	}
	public String getAttuned(){
		return attuned;
	}
	public void setLevelToEvolution(int value){
		levelToEvolution= value;
	}
	public void setEvolvedSpecies(String value){
		evolvedSpecies=value;
	}
	public void setAttuned(String value){
		attuned=value;
	}

	public EvolvableCuteCreature(String species, int maxHitPoints,int attackRating,int defenseRating,int experenceValue,boolean special,int levelToEvolution){
		super(species,maxHitPoints,attackRating,defenseRating,experenceValue,special);
		setLevelToEvolution(levelToEvolution);

	}
	public void levelup(){
		super.levelUp();
		if(level ==levelToEvolution){
			System.out.println("Evolution");
			maxHitPoints+=9;
			attackRating+=4;
			defenseRating+=4;
			if(species.charAt(0)>='A'&&species.charAt(0)<='F'){
				setAttuned("light");
			}
			if(species.charAt(0)>='G'&&species.charAt(0)<='L'){
				setAttuned("dark");
			}
			if(species.charAt(0)>='M'&&species.charAt(0)<='R'){
				setAttuned("nature");
			}
			if(species.charAt(0)>='S'&&species.charAt(0)<='Z'){
				setAttuned("tech");
			}
		}
	}
	public String toString(){
		if (level<levelToEvolution) {
			return super.toString()+"\n attuned: 	hasn't evolved yet!";
			
		}
		else{
			return super.toString() +"\n attuned: 	"+ attuned;

		}
		
	}
	public void specialAttack(EvolvableCuteCreature c){
		if(getLevel()<levelToEvolution){
			System.out.println(" ERROR! this creature hasn't evelved yet");
			return;
		}

		int damage;
		int a = attackRating;
		int d = c.defenseRating;
		if(attuned.equals("light")&& c.getAttuned().equals("tech")){
			damage = a-5*d;
			if(damage<0){
				damage = 0;
			}

		}
		else if (attuned.equals("light")&& c.getAttuned().equals("dark")){
			damage=5*a-d;
			if(damage<0){
				damage=10;
			}
		}
		else if(attuned.equals("dark")&& c.getAttuned().equals("nature")){
			damage = a-5*d;
			if(damage<0){
				damage = 0;
			}

		}
		else if (attuned.equals("dark")&& c.getAttuned().equals("light")){
			damage=5*a-d;
			if(damage<0){
				damage=10;
			}
		}
		else  if(attuned.equals("nature")&& c.getAttuned().equals("dark")){
			damage = a-5*d;
			if(damage<0){
				damage = 0;
			}

		}
		else if (attuned.equals("nature")&& c.getAttuned().equals("tech")){
			damage=5*a-d;
			if(damage<0){
				damage=10;
			}
		}
		else if(attuned.equals("tech")&& c.getAttuned().equals("light")){
			damage = a-5*d;
			if(damage<0){
				damage = 0;
			}

		}
		else if (attuned.equals("tech")&& c.getAttuned().equals("nature")){
			damage=5*a-d;
			if(damage<0){
				damage=10;
			}
		}
		else if(attuned.equals(c.getAttuned())){
			damage = 0;
		}
		else{
			damage=a-d;
			if (damage<0) {
				damage=1;
				
			}
		}
		
		c.takeDamage(damage);
		if(c.getCurrentHitPoints()<=0){
			System.out.println(c.species +" has been defeated!");
			gainExp(c.experenceValue);
		}
	}
	public static void main(String[] args) {
		//light
		EvolvableCuteCreature Bulbasur = new EvolvableCuteCreature("Bulbasur",55,15,8,210,true,2);
		//tech
		EvolvableCuteCreature Vulpix = new EvolvableCuteCreature("Vulpix", 40,18,5,210,true,2);
		//nature
		EvolvableCuteCreature Pikachu = new EvolvableCuteCreature ("Pikachu",35,23,3,210,true,2);
		//dark
		EvolvableCuteCreature Jigglypuff= new EvolvableCuteCreature("Jigglypuff", 75,10,12,210,true,2);
		//light 
		EvolvableCuteCreature Charmander  =new EvolvableCuteCreature("Charmander",35,23,5,210,true,2);

		//case #1

		System.out.println("Case 1");
		//check error message
		System.out.println(Bulbasur);
		System.out.println(Charmander);
		Bulbasur.specialAttack(Charmander);
		Charmander.specialAttack(Bulbasur);
		System.out.println(Bulbasur);
		System.out.println(Charmander);
		System.out.println("");

		//case #2
 		//same type
 		System.out.println("Case 2");

 		Bulbasur.levelup();
 		Charmander.levelup();
		System.out.println(Bulbasur);
		System.out.println(Charmander);
		Bulbasur.specialAttack(Charmander);
		Charmander.specialAttack(Bulbasur);
		System.out.println(Bulbasur);
		System.out.println(Charmander);
		System.out.println("");

		System.out.println("Case 3");
		//case#3
		//resists

		Bulbasur.levelup();
 		Vulpix.levelup();
 		System.out.println(Bulbasur);
 		System.out.println(Vulpix);
 		Bulbasur.specialAttack(Vulpix);
 		System.out.println(Bulbasur);
 		System.out.println(Vulpix);
 		System.out.println("");

 		System.out.println("Case 4");

 		//case#4
 		//vulnerable

 		Charmander.levelup();
 		Jigglypuff.levelup();
 		System.out.println(Charmander);
 		System.out.println(Jigglypuff);
 		Charmander.specialAttack(Jigglypuff);
 		System.out.println(Charmander);
 		System.out.println(Jigglypuff);
 		System.out.println("");




 		System.out.println("Case 5");

 		//case #5
 		//other
 		Charmander.levelup();
 		Pikachu.levelup();
 		System.out.println(Charmander);
 		System.out.println(Pikachu);
 		Charmander.specialAttack(Pikachu);
 		System.out.println(Charmander);
 		System.out.println(Pikachu);
 		System.out.println("");

 		System.out.println("Case 6");
 		//case #6
 		//chaek gainExp method 

 		Charmander.levelup();
 		Pikachu.levelup();
 		while (true){
 			
 		System.out.println(Charmander);
 		System.out.println(Pikachu);
 		Charmander.specialAttack(Pikachu);
 		Pikachu.specialAttack(Charmander);
 		System.out.println(Charmander);
 		System.out.println(Pikachu);

 		if(Charmander.getCurrentHitPoints()<=0||Pikachu.getCurrentHitPoints()<=0){
 			break;
 		}
 		}







	}

}