package main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;

public class MyItemFood extends ItemFood {

	private String name;
	public MyItemFood(String name) {
		super((int) 1.5, 1.5f, false);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.name = name;
	}
	
	public void registerItemModel(Item item) {
		main.baked.proxy.registerItemRenderer(this, 0, name);
	}
	
	public void initOreDict() {
		OreDictionary.registerOre(name, this);
	}
	
	@Override
	public MyItemFood setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}