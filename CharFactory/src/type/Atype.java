package type;

import Bomb.Bomb;
import Bomb.C4;
import Weapon.Gun;
import Weapon.Weapon;

public class Atype implements AbstractItem {

	@Override
	public Weapon createWeapon() {
		
		return new Gun();
	}

	@Override
	public Bomb createBomb() {
		
		return new C4();
	}

}
