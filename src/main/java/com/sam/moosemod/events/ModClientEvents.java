package com.sam.moosemod.events;


import com.sam.moosemod.MooseMod;
import com.sam.moosemod.init.ModBlocks;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MooseMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

    @SubscribeEvent
    public static void clickMooseWithSaddle(PlayerInteractEvent.EntityInteractSpecific event) {

        LivingEntity player = event.getEntityLiving();
        Entity toBeSaddled = event.getTarget();
    /*    if (player.getHeldItemMainhand().getItem() == ModItems.MOOSE_SADDLE.get()) {
            if (toBeSaddled.isBeingRidden()) {
                if (toBeSaddled.getType() = ModEntities.MOOSE.get()) {
                    if (toBeSaddled.isAlive()) {

                    }
                }
            }
        }; */

        World world = player.getEntityWorld();
        world.setBlockState(player.getPosition().add(0, -1, 0), ModBlocks.GREEN_BLOCK.get().getDefaultState());

    }
}
