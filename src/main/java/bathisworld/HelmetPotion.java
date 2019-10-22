package bathisworld;

import main.baked;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class HelmetPotion extends CrabshellHelmet {
	private final PotionEffect potionEffect;
	private String name;

	public HelmetPotion(final ArmorMaterial material, final EntityEquipmentSlot equipmentSlot, final PotionEffect potionEffect, String name) {
		super(material, equipmentSlot, name);		
		this.potionEffect = potionEffect;
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	@Override
	public void onArmorTick(final World world, final EntityPlayer player, final ItemStack itemStack) {
		//if (!player.isPotionActive(potionEffect.getPotion())) { // If the Potion isn't currently active,
			player.addPotionEffect(new PotionEffect(potionEffect)); // Apply a copy of the PotionEffect to the player
		//}
	}
	
	public void registerItemModel(Item item) {
		baked.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public HelmetPotion setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
