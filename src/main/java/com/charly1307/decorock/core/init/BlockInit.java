package com.charly1307.decorock.core.init;

import com.charly1307.decorock.DecoRockMain;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			DecoRockMain.MOD_ID);

	public static final RegistryObject<Block> BRICK = BLOCKS
			.register("ladrillos",
						() -> new Block(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK)
									   	.strength(2.0f, 15f)
									   	.harvestLevel(12)
									   	.harvestTool(ToolType.PICKAXE)
									   	.sound(SoundType.STONE)));
}