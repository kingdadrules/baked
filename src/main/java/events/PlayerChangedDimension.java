package events;

import java.io.IOException;
import main.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;

public class PlayerChangedDimension {
	
	
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=false)	
	public void onEvent(PlayerChangedDimensionEvent event) throws IOException
	
	{
		EntityPlayer player = event.player;
		int todim = event.toDim;	
		
		//player.sendMessage(new TextComponentString("Change Dim to " + todim));
		
		
		if (todim == 10)
		{
			NBTTagCompound tag = player.getEntityData();
			NBTBase modeTag = tag.getTag("bakedLevel");
			if (modeTag == null && !event.player.world.isRemote) 
			{	
				tag.setInteger("bakedLevel", 1);
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.introbook, 1));	
				
				for (int slot = 0; slot < player.inventory.getSizeInventory(); slot++)
				{
					ItemStack stack = player.inventory.getStackInSlot(slot);
					
					if (!stack.getItem().equals(ModItems.introbook))
					{					
						player.inventory.removeStackFromSlot(slot);
					}   
				    				      
				}
				player.setItemStackToSlot(EntityEquipmentSlot.FEET, ItemStack.EMPTY);
				player.setItemStackToSlot(EntityEquipmentSlot.LEGS, ItemStack.EMPTY);
				player.setItemStackToSlot(EntityEquipmentSlot.CHEST, ItemStack.EMPTY);
				player.setItemStackToSlot(EntityEquipmentSlot.HEAD, ItemStack.EMPTY);
				
				//player.inventory.clear();
				player.sendMessage(new TextComponentString(" "));
				player.sendMessage(new TextComponentString("That loony was right after all!"));
				player.sendMessage(new TextComponentString("The space pirates are real & they kidnapped me!"));
				player.sendMessage(new TextComponentString("That apple must have been drugged and knocked me out when I ate it."));
								
				//player.inventory.addItemStackToInventory(new ItemStack(ModItems.introbook, 1));						
			}			
		}
		
		if (todim == 5)
		{ 
			if (player.inventory.hasItemStack(new ItemStack(Item.getItemById(326))))
			{
				player.sendMessage(new TextComponentString(" "));
				player.sendMessage(new TextComponentString("No water can exist in this dimension."));
				player.sendMessage(new TextComponentString("The Portal removed all your water buckets."));
			}			
			
			 player.inventory.clearMatchingItems(Item.getItemById(326), 0, 64, null) ; 
		}				
										
		if (todim == 2)
			{ 
				NBTTagCompound tag = player.getEntityData();
				NBTBase modeTag = tag.getTag("arbos");
				if (modeTag == null && !event.player.world.isRemote) {
					player.sendMessage(new TextComponentString(" "));
					player.sendMessage(new TextComponentString("You notice some papers on the ground and pick them up."));
					player.inventory.addItemStackToInventory(new ItemStack(ModItems.notearbos1, 1));
					tag.setInteger("arbos", 1);
					}	
			}	
		
		if (todim == 3)
		{ 
			NBTTagCompound tag = player.getEntityData();
			NBTBase modeTag = tag.getTag("bathis");
			if (modeTag == null && !event.player.world.isRemote) {	
				player.sendMessage(new TextComponentString(" "));
				player.sendMessage(new TextComponentString("You notice some papers on the ground and pick them up."));
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.notebathis1, 1));
				tag.setInteger("bathis", 1);
				}	
		}	
		
		if (todim == 4)
		{ 
			NBTTagCompound tag = player.getEntityData();
			NBTBase modeTag = tag.getTag("silvam");
			if (modeTag == null && !event.player.world.isRemote) {	
				player.sendMessage(new TextComponentString(" "));
				player.sendMessage(new TextComponentString("You notice some papers on the ground and pick them up."));
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.notesilvam1, 1));
				tag.setInteger("silvam", 1);
				}	
		}	
		
		if (todim == 5)
		{ 
			NBTTagCompound tag = player.getEntityData();
			NBTBase modeTag = tag.getTag("insula");
			if (modeTag == null && !event.player.world.isRemote) {	
				player.sendMessage(new TextComponentString(" "));
				player.sendMessage(new TextComponentString("You notice some papers on the ground and pick them up."));
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.noteinsula1, 1));
				tag.setInteger("insula", 1);
				}	
		}
		
		if (todim == 6)
		{ 
			NBTTagCompound tag = player.getEntityData();
			NBTBase modeTag = tag.getTag("caelum");
			if (modeTag == null && !event.player.world.isRemote) {	
				player.sendMessage(new TextComponentString(" "));
				player.sendMessage(new TextComponentString("You notice some papers on the ground and pick them up."));
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.notecaelum1, 1));
				tag.setInteger("caelum", 1);
				}	
		}	
		
		if (todim == 7)
		{ 
			NBTTagCompound tag = player.getEntityData();
			NBTBase modeTag = tag.getTag("mons");
			if (modeTag == null && !event.player.world.isRemote) {
				player.sendMessage(new TextComponentString(" "));
				player.sendMessage(new TextComponentString("You notice some papers on the ground and pick them up."));
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.notemons1, 1));
				tag.setInteger("mons", 1);
				}	
		}	
		
		if (todim == 8)
		{ 
			NBTTagCompound tag = player.getEntityData();
			NBTBase modeTag = tag.getTag("coletus");
			if (modeTag == null && !event.player.world.isRemote) {	
				player.sendMessage(new TextComponentString(" "));
				player.sendMessage(new TextComponentString("You notice some papers on the ground and pick them up."));
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.notecoletus1, 1));
				tag.setInteger("coletus", 1);
				}	
		}	
		
		if (todim == 9)
		{ 
			NBTTagCompound tag = player.getEntityData();
			NBTBase modeTag = tag.getTag("frigus");
			if (modeTag == null && !event.player.world.isRemote) {	
				player.sendMessage(new TextComponentString(" "));
				player.sendMessage(new TextComponentString("You notice some papers on the ground and pick them up."));
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.notefrigus1, 1));
				tag.setInteger("frigus", 1);
				}	
		}	
		
		if (todim == 11)
		{ 
			NBTTagCompound tag = player.getEntityData();
			 player.setPositionAndUpdate(1010,80,1010);
			NBTBase modeTag = tag.getTag("last");
			if (modeTag == null && !event.player.world.isRemote) {
				player.inventory.addItemStackToInventory(new ItemStack(ModItems.notefinal, 1));
				tag.setInteger("last", 1);
				for (int slot = 0; slot < player.inventory.getSizeInventory(); slot++)
				{
					ItemStack stack = player.inventory.getStackInSlot(slot);
					
					if (!stack.getItem().equals(ModItems.notefinal))
					{					
						player.inventory.removeStackFromSlot(slot);
					}
				}
				String lastdone = tag.getString("lastdone");
				if (lastdone != "y")
				{
					tag.setString("lastdone", "y");	
					player.sendMessage(new TextComponentString(" "));
					player.sendMessage(new TextComponentString("Well done, you have successfully completed the Baked challange!"));
					player.sendMessage(new TextComponentString(" "));
					player.sendMessage(new TextComponentString("God only knows where you have ended up though."));	
				}
			}	
		}	
		
		
	}
}