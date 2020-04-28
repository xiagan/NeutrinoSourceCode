package com.tutorial.neutrino;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("neutrino")
public class Neutrino {
    public Neutrino() {
        com.tutorial.neutrino.first_item.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.food.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.melee_weapons.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_block.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.first_block.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.blockstate.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.blockstate.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.nonesoildblock.ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        com.tutorial.neutrino.nonesoildblock.BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
