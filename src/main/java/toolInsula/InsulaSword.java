package toolInsula;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class InsulaSword extends ItemSword {

	private String name;
	public InsulaSword(ToolMaterial material, String name) {
	    super(material);
	    setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	public void registerItemModel(Item item) {
		main.baked.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		stack.addEnchantment(Enchantments.SHARPNESS, 4);
		stack.addEnchantment(Enchantments.KNOCKBACK,1);
		stack.addEnchantment(Enchantments.LOOTING,2);
		stack.addEnchantment(Enchantments.SMITE,4);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		tooltip.add("The Harvester");
    }
    
	
	@Override
	public InsulaSword setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}