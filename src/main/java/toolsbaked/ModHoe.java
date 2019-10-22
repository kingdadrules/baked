package toolsbaked;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ModHoe extends ItemHoe {

	private String name;
	public ModHoe(ToolMaterial material, String name) {
	    super(material);
	    setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	public void registerItemModel(Item item) {
		main.baked.proxy.registerItemRenderer(this, 0, name);
	}
	@Override
	public ModHoe setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}