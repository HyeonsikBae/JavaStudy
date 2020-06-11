package type;

import Bomb.Bomb;
import Bomb.Dynamite;
import Weapon.Sword;
import Weapon.Weapon;

public class Btype implements AbstractItem {

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Sword();
	}

	@Override
	public Bomb createBomb() {
		// TODO Auto-generated method stub
		return new Dynamite();
	}

}
