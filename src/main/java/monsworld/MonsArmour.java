package monsworld;

import java.util.List;

import javax.annotation.Nullable;

import main.baked;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MonsArmour extends net.minecraft.item.ItemArmor {
	
	private String name;

	public MonsArmour(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		stack.addEnchantment(Enchantments.PROTECTION, 4);
		stack.addEnchantment(Enchantments.THORNS, 3);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		tooltip.add("Ultimate Armour");
    }
	

	public void registerItemModel(Item item) {
		baked.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public MonsArmour setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
	
}