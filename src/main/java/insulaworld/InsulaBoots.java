package insulaworld;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class InsulaBoots extends net.minecraft.item.ItemArmor {
	
	//private String name;

	public InsulaBoots(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
	}	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
		tooltip.add("Hot Stuff!");
    }
	
}