package main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class ItemArmor extends net.minecraft.item.ItemArmor {
	
	private String name;

	public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	public void registerItemModel(Item item) {
		baked.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemArmor setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
