package com.example.examplemod.materials;

import com.example.examplemod.Reference;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ExampleMaterials {

	public static final ToolMaterial EXAMPLE_TOOL = EnumHelper.addToolMaterial(Reference.MODID + ":" + "example_tool", 2, 625, 7.0F, 2.5F, 10);
}
