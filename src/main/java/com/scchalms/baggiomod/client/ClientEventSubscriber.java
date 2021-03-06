package com.scchalms.baggiomod.client;

import com.scchalms.baggiomod.BaggioMod;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import static com.scchalms.baggiomod.init.ModBlocks.*;
import static com.scchalms.baggiomod.init.ModItems.*;

@Mod.EventBusSubscriber(modid = BaggioMod.MODID, value = Side.CLIENT)
public class ClientEventSubscriber {
    public static final Item[] items = {
            BRUH_ITEM,
            MICROCHIP,
            ENRICHED_MICROCHIP,
            ADVANCED_MICROCHIP,
            RAINBOW_MICROCHIP,
            BAGGIUM_INGOT,
            BAGGIUM_NUGGET,
            BAGGIUM_SWORD,
            BAGGIUM_PICKAXE,
            BAGGIUM_SHOVEL,
            BAGGIUM_AXE,
            BAGGIUM_HOE,
            BAGGIUM_HELMET,
            BAGGIUM_CHESTPLATE,
            BAGGIUM_LEGGINGS,
            BAGGIUM_BOOTS,
            ENRICHED_BAGGIUM_INGOT,
            CHARGED_BAGGIUM_INGOT,
            ANSH_CHARM,
            ANSH_SHIELD,
            COLORIUM_INGOT,
    };
    public static final Block[] blocks = {
            BAGGIUM_ORE,
            BAGGIUM_BLOCK,
            BAGGIUM_CHARGER,
            MACHINE_CHASSIS,
            PASSIVE_GENERATOR,
            CHARGED_BAGGIUM_BLOCK,
            ENRICHED_BAGGIUM_BLOCK,
            COLORIUM_ORE,
    };


    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event){
        for(Item item : items){
            registerModel(item);
        }
        for(Block block : blocks){
            registerModel(Item.getItemFromBlock(block));
        }
    }
    public static void registerModel(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
