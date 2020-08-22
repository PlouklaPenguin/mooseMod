package com.sam.moosemod.blocks;

import com.sam.moosemod.MooseMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;


public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(MooseMod.TAB));
    }
}
