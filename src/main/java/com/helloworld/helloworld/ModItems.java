package com.helloworld.helloworld;

import com.helloworld.helloworld.items.DogeCoin;
import com.helloworld.helloworld.items.IronMultiTool;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ModItems {
	//not required stored references to items
	@GameRegistry.ObjectHolder("helloworld:dogecoin")
    public static DogeCoin dogeCoin;
	
	//not required stored references to items
	@GameRegistry.ObjectHolder("helloworld:ironmultitool")
	public static IronMultiTool ironMultiTool;
	
	//inits textures for items
	@SideOnly(Side.CLIENT)
    public static void initModels() {
        dogeCoin.initModel();
        ironMultiTool.initModel();
    }
}
