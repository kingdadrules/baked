package main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MyIgniter extends Item {

	protected String name;

	public MyIgniter(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.maxStackSize = 64;
		this.setContainerItem(this);
	}
	
	public void registerItemModel() {
		baked.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public MyIgniter setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
