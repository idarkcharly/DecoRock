package com.charly1307.decorock.core.init;

import com.charly1307.decorock.DecoRockMain;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			DecoRockMain.MOD_ID);

	public static final RegistryObject<Item> SODA = ITEMS.register("soda",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

	public static final RegistryObject<Item> BOTELLA = ITEMS.register("botella",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));

	public static final RegistryObject<Item> CERVEZA = ITEMS.register("cerveza",
			() -> new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
}
