package toolsbaked;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class BakedSword extends ItemSword {

	private String name;
	public BakedSword(ToolMaterial material, String name) {
	    super(material);
	    setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	public void registerItemModel(Item item) {
		main.baked.proxy.registerItemRenderer(this, 0, name);
	}
	@Override
	public BakedSword setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}