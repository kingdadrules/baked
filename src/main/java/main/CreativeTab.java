package main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTab {
	
	public static final CreativeTabs baked = new CreativeTabs("baked") {
		@Override 
		public ItemStack getTabIconItem() {
		    return new ItemStack(ModBlocks.bakeddirt);
		}
		
	};

}