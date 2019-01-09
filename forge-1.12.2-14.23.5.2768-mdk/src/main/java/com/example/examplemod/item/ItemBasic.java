package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasic extends Item {

	public ItemBasic(String unlocalizedName, String registryName) {
        setUnlocalizedName(Reference.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(ExampleMod.EXAMPLE_TAB);
    }
}
