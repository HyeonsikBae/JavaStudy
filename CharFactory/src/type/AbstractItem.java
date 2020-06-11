package type;

import Bomb.Bomb;
import Weapon.Weapon;

public interface AbstractItem {
	public Weapon createWeapon();
	public Bomb createBomb();
}
