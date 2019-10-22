package bathisworld;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CrabshellHelmet extends net.minecraft.item.ItemArmor {
	
	//private String name;

	public CrabshellHelmet(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
	}
	
	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
	stack.addEnchantment(Enchantment.getEnchantmentByID(6), 5);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		tooltip.add("King Of The Sea");
    }
	
}
