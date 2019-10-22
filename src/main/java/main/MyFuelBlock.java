package main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

@SuppressWarnings("deprecation")
public class MyFuelBlock implements IFuelHandler 
{
public int getBurnTime(ItemStack fuel) 
{
//if(fuel.getItem() == ModItems.lichen)
	if(fuel.getItem() == Item.getItemFromBlock(ModBlocks.bakedcactus)){	
return 800;
	} else if(fuel.getItem() == Item.getItemFromBlock(ModBlocks.infusedcoalblock)){	
		return 24000;
	} else if(fuel.getItem() == Item.getItemFromBlock(ModBlocks.superinfusedcoalblock)){	
		return 48000;
	} else if(fuel.getItem() == Item.getItemFromBlock(ModBlocks.megainfusedcoalblock)){	
		return 72000;
	}	
else
return 0;
}
}

