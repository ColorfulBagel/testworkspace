
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.yhu.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.yhu.item.DItem;
import net.mcreator.yhu.YhuMod;

public class YhuModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, YhuMod.MODID);
	public static final RegistryObject<Item> D = REGISTRY.register("d", () -> new DItem());
}
