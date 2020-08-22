package com.sam.moosemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class GreenBlock extends Block {

    public GreenBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f, 4.0f)
                .harvestTool(ToolType.PICKAXE)
                .sound(SoundType.STONE)
                .harvestLevel(3)
        );
    }
}
