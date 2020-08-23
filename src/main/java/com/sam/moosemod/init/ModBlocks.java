package com.sam.moosemod.init;

import com.sam.moosemod.MooseMod;
import com.sam.moosemod.blocks.GreenBlock;
import com.sam.moosemod.blocks.GreenOre;
import com.sam.moosemod.blocks.PermafrostBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    //Registry
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MooseMod.MOD_ID);

    //BLOCKS
    public static final RegistryObject<Block> PERMAFROST_BLOCK = BLOCKS.register("permafrost_block", PermafrostBlock::new);
    public static final RegistryObject<Block> GREEN_BLOCK = BLOCKS.register("green_block", GreenBlock::new);
    public static final RegistryObject<Block> GREEN_ORE = BLOCKS.register("green_ore", GreenOre::new);

}
