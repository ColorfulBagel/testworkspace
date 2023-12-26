
package net.mcreator.yhu.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DItem extends Item {
	public DItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
