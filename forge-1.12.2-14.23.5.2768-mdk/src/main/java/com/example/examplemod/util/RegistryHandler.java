package com.example.examplemod.util;

import com.example.examplemod.block.BlockBasic;
import com.example.examplemod.init.ExampleBlocks;
import com.example.examplemod.item.ItemBasic;
import com.example.examplemod.item.ItemExamplePickaxe;
import com.example.examplemod.materials.*;
import com.example.examplemod.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void registerBlocks(Register<Block> event) {
        final Block[] blocks = {
                new BlockBasic(Material.ROCK, "blockBasic", "basic_block")
        };
 
        event.getRegistry().registerAll(blocks);
    }
 
    @SubscribeEvent
    public static void registerItems(Register<Item> event) {
        final Item[] items = {
                new ItemBasic("itemBasic", "basic_item"),
                new ItemExamplePickaxe(ExampleMaterials.EXAMPLE_TOOL, "itemPickaxe", "basic_pickaxe")
        };
 
        final Item[] itemBlocks = {
                new ItemBlock(ExampleBlocks.BASIC_BLOCK).setRegistryName(ExampleBlocks.BASIC_BLOCK.getRegistryName())
        };
 
        event.getRegistry().registerAll(items);
        event.getRegistry().registerAll(itemBlocks);
    }
}
