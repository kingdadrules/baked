package bathisworld;

import java.util.List;

import javax.annotation.Nullable;

import main.baked;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CrabshellBoots extends net.minecraft.item.ItemArmor {
	
	private String name;

	public CrabshellBoots(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}
	
	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
	stack.addEnchantment(Enchantment.getEnchantmentByID(8), 3);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		tooltip.add("Underwater Strolling");
    }
	
	public void registerItemModel(Item item) {
		baked.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public CrabshellBoots setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}

}
