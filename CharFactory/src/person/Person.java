package person;

import Bomb.Bomb;
import Weapon.Weapon;
import type.AbstractItem;

public class Person {
	public Weapon mWeapon;
	public Bomb mBomb;
	
	public void create(AbstractItem ai) {
		mWeapon = ai.createWeapon();
		mBomb = ai.createBomb();
	}
}
