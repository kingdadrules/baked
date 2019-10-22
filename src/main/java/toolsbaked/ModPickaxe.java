package toolsbaked;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ModPickaxe extends ItemPickaxe {

	private String name;
	public ModPickaxe(ToolMaterial material, String name) {
	    super(material);
	    setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	public void registerItemModel(Item item) {
		main.baked.proxy.registerItemRenderer(this, 0, name);
	}
	@Override
	public ModPickaxe setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}