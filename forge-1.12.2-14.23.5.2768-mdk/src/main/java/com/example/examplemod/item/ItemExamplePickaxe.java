package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.Reference;

import net.minecraft.item.ItemPickaxe;

public class ItemExamplePickaxe extends ItemPickaxe {

	public ItemExamplePickaxe(ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);
 
        setUnlocalizedName(Reference.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(ExampleMod.EXAMPLE_TAB);
    }

}
