package com.charly1307.decorock;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.charly1307.decorock.core.init.BlockInit;
import com.charly1307.decorock.core.init.ItemInit;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("decorock")
@Mod.EventBusSubscriber(modid = DecoRockMain.MOD_ID, bus = Bus.MOD)
public class DecoRockMain {

	private static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "decorock";

	public DecoRockMain() {

		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);

		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			event.getRegistry().register(new BlockItem(block, new Item.Properties().tab(ItemGroup.TAB_MISC))
					.setRegistryName(block.getRegistryName()));
		});
	}

}