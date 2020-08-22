package com.sam.moosemod.items;

import com.sam.moosemod.MooseMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class MooseMeat extends Item {
    public MooseMeat () {
        super(new Item.Properties()
                .group(MooseMod.TAB)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(4.0f)
                        .effect(() -> new EffectInstance(Effects.UNLUCK, 12000, 5), 9.5f)
                        .meat()
                        .build())


        );
    }
}
