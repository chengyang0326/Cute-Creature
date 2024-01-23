public class CuteCreatureClient{
	public static void main(String[] args) {
		CuteCreature Tore_Chick = new CuteCreature("Tore_Chick",35,18,3,210,false);
		CuteCreature Slacking = new CuteCreature("SLacking",50,6,8,210,true);
		System.out.println(Tore_Chick);
		System.out.println(Slacking);
		while (true){
			Tore_Chick.attack(Slacking);

			Slacking.attack(Tore_Chick);
			System.out.println(Tore_Chick);
		System.out.println(Slacking);
			if (Slacking.getCurrentHitPoints()<=0 || Tore_Chick.getCurrentHitPoints()<=0){
				
				break;
			}
		}
		System.out.println(Tore_Chick);
		System.out.println(Slacking);

	}
}