public class EvolableCuteCreatureClient{
	public static void main(String[] args) {
		//light
		EvolableCuteCreature Bulbasur = new EvolableCuteCreature("Bulbasur",55,15,8,210,true,2);
		//tech
		EvolableCuteCreature Vulpix = new EvolableCuteCreature("Vulpix", 40,18,5,210,true,2);
		//nature
		EvolableCuteCreature Pikachu = new EvolableCuteCreature ("Pikachu",35,23,3,210,true,2);
		//dark
		EvolableCuteCreature Jigglypuff= new EvolableCuteCreature("Jigglypuff", 75,10,12,210,true,2);
		//light 
		EvolableCuteCreature Charmander  =new EvolableCuteCreature("Charmander",35,23,5,true,2);


		//case #1
		//check error message
		System.out.println(Bulbasur);
		System.out.println(Charmander);
		Bulbasur.specialAttack(Charmander);
		Charmander.specialAttack(Bulbasur);
		System.out.println(Bulbasur);
		System.out.println(Charmander);

		//case #2
 		//same type

 		Bulbasur.levelup();
 		Charmander.levelup();
		System.out.println(Bulbasur);
		System.out.println(Charmander);
		Bulbasur.specialAttack(Charmander);
		Charmander.specialAttack(Bulbasur);
		System.out.println(Bulbasur);
		System.out.println(Charmander);

		//case#3
		//resists

		Bulbasur.levelup();
 		Vulpix.levelup();
 		System.out.println(Bulbasur);
 		System.out.prinyln(Vulpix);
 		Bulbasur.specialAttack(Vulpix);
 		System.out.println(Bulbasur);
 		System.out.prinyln(Vulpix);

 		//case#4
 		//vulnerable

 		Charmander.levelup();
 		Jigglypuff.levelup();
 		System.out.println(Charmander);
 		System.out.println(Jigglypuff);
 		Charmander.specialAttack(Jigglypuff);
 		System.out.println(Charmander);
 		System.out.println(Jigglypuff);

 		//case #5
 		//other
 		Charmander.levelup();
 		Pikachu.levelup();
 		System.out.println();
 		System.out.println();
 		Charmander.specialAttack(Pikachu);
 		System.out.println();
 		System.out.println();


 		//case #6
 		//chaek gainExp method 

 		while (true){
 			Charmander.levelup();
 		Pikachu.levelup();
 		System.out.println();
 		System.out.println();
 		Charmander.specialAttack(Pikachu);
 		System.out.println();
 		System.out.println();

 		if(Charmander.getCurrentHitPoints<=0||Pikachu.getCurrentHitPoints<=0){
 			break;
 		}
 		}







	}

}