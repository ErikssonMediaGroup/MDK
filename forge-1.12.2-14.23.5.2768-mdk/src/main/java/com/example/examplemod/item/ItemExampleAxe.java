package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.Reference;

import net.minecraft.item.ItemAxe;

public class ItemExampleAxe extends ItemAxe {

	public ItemExampleAxe(ToolMaterial material, float damage, float speed, String unlocalizedName, String registryName) {
        super(material, damage, speed);
 
        setUnlocalizedName(Reference.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(ExampleMod.EXAMPLE_TAB);
    }
 
    public ItemExampleAxe(ToolMaterial material, String unlocalizedName, String registryName) {
        this(material, 8.0F, -3.1F, unlocalizedName, registryName);
    }

}
