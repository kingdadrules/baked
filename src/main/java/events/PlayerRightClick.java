package events;

import java.io.IOException;

import main.ModBlocks;
import main.ModItems;
import main.baked;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.RightClickBlock;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerRightClick {
	
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=false)	
	public void onEvent(RightClickBlock event) throws IOException
	
	{		
		EntityPlayer player = event.getEntityPlayer();
		Item item = player.getHeldItem(EnumHand.MAIN_HAND).getItem();
		Block block = event.getWorld().getBlockState(event.getPos()).getBlock();


		if  (event.getEntityPlayer().world.provider.getDimension() == 11 && block == Blocks.STONE_BUTTON && !player.world.isRemote) {
			player.sendMessage(new TextComponentString(" "));
			int rand = (int)(Math.random() * 10 + 1);
			switch (rand) {
			case 1:
				player.sendMessage(new TextComponentString("We hope you enjoy your stay at your local Bide-a-Wee 'Health Retreat'."));
				player.sendMessage(new TextComponentString("Please try to remain calm until the orderly comes with your tablets."));
			break;
			case 2:
				player.sendMessage(new TextComponentString("There may be a delay of a week or two until your next visit from a doctor, due to our recent staff right-sizing project."));
				player.sendMessage(new TextComponentString("This was carried out with the long term concerns of you, the consumer in mind."));
			break;
			case 3:
				player.sendMessage(new TextComponentString("For your convenience, a bed and other essential furniture will be made available as soon as possible. Thank you for your patience"));
			break;
			case 4:
				player.sendMessage(new TextComponentString("We are currently experiencing minor shortages of medical supplies, including the pink pills you loonies need to keep relatively sane!"));
				player.sendMessage(new TextComponentString("This situation will be remedied when the FBI locate the finance director so we can pay the suppliers."));
			break;
			case 5:
				player.sendMessage(new TextComponentString("We wish to deny the rumour that the ceilings have been repossessed."));
				player.sendMessage(new TextComponentString("They have in fact been temporarily removed to facilitate cleaning & maintenance, honest!"));
			break;
			case 6:
				player.sendMessage(new TextComponentString("For your entertainment, a fine selection of music will be broadcast into your room on a 24 hour loop."));
				player.sendMessage(new TextComponentString("Including 'Bagpipe hits of the 18th century' & 'Greatest elevator tunes you love to scream along to!' "));
			break;		
			case 7:
				player.sendMessage(new TextComponentString("This is an automated welcome message from Flo, your fully computerised 'Acme care 4000' AI monitoring package."));
				player.sendMessage(new TextComponentString("Relax, you are now in safe hands. The most important thing for you to know at this point is wibble flibble fluubberr.... "));
				player.sendMessage(new TextComponentString(".... Safe hands, afe ands, fe nds, e ds..."));
			break;	
			case 8:
				player.sendMessage(new TextComponentString("Doctor McFibber will be attending to you later... well, when I say doctor, I mean he went to medical school... "));
				player.sendMessage(new TextComponentString("... to be honest, between me & you I think he was actually cleaning the toilets there, but I expect he picked a lot up by watching."));
			break;	
			case 9:
				player.sendMessage(new TextComponentString("Don't panic! You are here because you require a short perios of rest followed by corrective therapy (when we pay the electricity bills for the shock machines that is)..."));
				player.sendMessage(new TextComponentString("... It's not because you are some kind of fruitcake who believes in space pirates, honest!"));
			break;	
			case 10:
				player.sendMessage(new TextComponentString("MORTAL, ON YOUR KNEES WHEN I SPEAK, FOR I AM ZANOS, RULER OF THE UNIVERSE!!! ... "));
				player.sendMessage(new TextComponentString("Bang, thump... oi getoffme! That hurt, ok,ok, I'm going. I'm going ....."));
				player.sendMessage(new TextComponentString("I'm sorry about that, it looks like some loonies escaped & one took over the microphone, normal service is resumed now... "));
				player.sendMessage(new TextComponentString("So, let's hurry and get this over with, because I've got the world to conquer & Josephine is waiting! HA HA HA HAAAAAAAAAAAAAAAAAAAAAAA"));
			break;	
			
			}
		}
		
		
		
		if (item == ModItems.piratediviningrod && block == ModBlocks.piratebeacon)
									
		{	
			event.getWorld().playSound(event.getPos().getX() + 0.5D, event.getPos().getY() + 0.5D, event.getPos().getZ() + 0.5D,
					SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
			for (int l = 0; l < 28; l++) 
			{
				event.getWorld().spawnParticle(EnumParticleTypes.CRIT_MAGIC, event.getPos().getX() + Math.random(), event.getPos().getY() + Math.random(), event.getPos().getZ() + Math.random(), 0.0D, 0.0D, 0.0D);
			}
			event.getWorld().setBlockState(event.getPos(), ModBlocks.trollblock.getDefaultState());
			if (!player.world.isRemote)
			{
				player.sendMessage(new TextComponentString(" "));
				player.sendMessage(new TextComponentString("Duh, I should have seen that coming."));
				player.sendMessage(new TextComponentString("What a waste of emeralds!"));
					
				for (int slot = 0; slot < player.inventory.getSizeInventory(); slot++)
				{
					ItemStack stack = player.inventory.getStackInSlot(slot);
					
					if (stack.getItem().equals(ModItems.piratediviningrod))
					{					
						player.inventory.removeStackFromSlot(slot);
					}   
				    				      
				}	
			}
		}
		
		if (item == ModItems.transformerbathis && block == ModBlocks.tuneablebathisblock)
			{
				event.getWorld().playSound(event.getPos().getX() + 0.5D, event.getPos().getY() + 0.5D, event.getPos().getZ() + 0.5D,
						SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
				for (int l = 0; l < 28; l++) 
				{
					event.getWorld().spawnParticle(EnumParticleTypes.SPELL_INSTANT, event.getPos().getX() + Math.random(), event.getPos().getY() + Math.random(), event.getPos().getZ() + Math.random(), 0.0D, 0.0D, 0.0D);
				}
				event.getWorld().setBlockState(event.getPos(), ModBlocks.silvamkeyblock.getDefaultState());				
			}	

		if (item == ModItems.transformersilvam && block == ModBlocks.tuneablesilvamblock)
			{
				event.getWorld().playSound(event.getPos().getX() + 0.5D, event.getPos().getY() + 0.5D, event.getPos().getZ() + 0.5D,
						SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
				for (int l = 0; l < 28; l++) 
				{
					event.getWorld().spawnParticle(EnumParticleTypes.SPELL_INSTANT, event.getPos().getX() + Math.random(), event.getPos().getY() + Math.random(), event.getPos().getZ() + Math.random(), 0.0D, 0.0D, 0.0D);
				}
				event.getWorld().setBlockState(event.getPos(), ModBlocks.insulakeyblock.getDefaultState());				
			}		
		
		if (item == ModItems.transformerinsula && block == ModBlocks.tuneableinsulablock)
		{
			event.getWorld().playSound(event.getPos().getX() + 0.5D, event.getPos().getY() + 0.5D, event.getPos().getZ() + 0.5D,
					SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
			for (int l = 0; l < 28; l++) 
			{
				event.getWorld().spawnParticle(EnumParticleTypes.SPELL_INSTANT, event.getPos().getX() + Math.random(), event.getPos().getY() + Math.random(), event.getPos().getZ() + Math.random(), 0.0D, 0.0D, 0.0D);
			}
			event.getWorld().setBlockState(event.getPos(), ModBlocks.caelumkeyblock.getDefaultState());				
		}	
		
		if (item == ModItems.transformercaelum && block == ModBlocks.tuneablecaelumblock)
		{
			event.getWorld().playSound(event.getPos().getX() + 0.5D, event.getPos().getY() + 0.5D, event.getPos().getZ() + 0.5D,
					SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
			for (int l = 0; l < 28; l++) 
			{
				event.getWorld().spawnParticle(EnumParticleTypes.SPELL_INSTANT, event.getPos().getX() + Math.random(), event.getPos().getY() + Math.random(), event.getPos().getZ() + Math.random(), 0.0D, 0.0D, 0.0D);
			}
			event.getWorld().setBlockState(event.getPos(), ModBlocks.monskeyblock.getDefaultState());				
		}			
		 
		if (item == ModItems.transformermons && block == ModBlocks.tuneablemonsblock)
		{
			event.getWorld().playSound(event.getPos().getX() + 0.5D, event.getPos().getY() + 0.5D, event.getPos().getZ() + 0.5D,
					SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
			for (int l = 0; l < 28; l++) 
			{
				event.getWorld().spawnParticle(EnumParticleTypes.SPELL_INSTANT, event.getPos().getX() + Math.random(), event.getPos().getY() + Math.random(), event.getPos().getZ() + Math.random(), 0.0D, 0.0D, 0.0D);
			}			
			event.getWorld().setBlockState(event.getPos(), ModBlocks.coletuskeyblock.getDefaultState());				
		}	
		
		if (item == ModItems.transformercoletus && block == ModBlocks.tuneablecoletusblock)
		{
			event.getWorld().playSound(event.getPos().getX() + 0.5D, event.getPos().getY() + 0.5D, event.getPos().getZ() + 0.5D,
					SoundEvents.BLOCK_ENCHANTMENT_TABLE_USE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
			for (int l = 0; l < 28; l++) 
			{
				event.getWorld().spawnParticle(EnumParticleTypes.SPELL_INSTANT, event.getPos().getX() + Math.random(), event.getPos().getY() + Math.random(), event.getPos().getZ() + Math.random(), 0.0D, 0.0D, 0.0D);
			}			
			event.getWorld().setBlockState(event.getPos(), ModBlocks.friguskeyblock.getDefaultState());				
		}			
										
		if (item == ModItems.introbook)
			{ 
				NBTTagCompound tag = player.getEntityData();
				NBTBase modeTag = tag.getTag("introbook");
				if (modeTag == null && !event.getWorld().isRemote) {			
					player.sendMessage(new TextComponentString(" "));
					player.sendMessage(new TextComponentString("You notice some papers on the ground and pick them up."));
					player.sendMessage(new TextComponentString("They must have been dropped by someone the pirates ditched here before."));
					player.inventory.addItemStackToInventory(new ItemStack(ModItems.notebaked1, 1));
					tag.setInteger("introbook", 1);
				}			
				baked.proxy.openguijoin(); 
			}
		
		
		if (item == ModItems.notebaked1)
		{ 	
			baked.proxy.openguinotebaked1(); 			
		}
		
		
		if (item == ModItems.notebaked2)
		{ 			
			baked.proxy.openguinotebaked2(); 
		}

		if (item == ModItems.notearbos1)
		{ 			
			baked.proxy.openguinotearbos1(); 
		}
		
		if (item == ModItems.notebathis1)
		{ 			
			baked.proxy.openguinotebathis1(); 
		}		

		if (item == ModItems.notesilvam1)
		{ 			
			baked.proxy.openguinotesilvam1(); 
		}
		
		if (item == ModItems.noteinsula1)
		{ 			
			baked.proxy.openguinoteinsula1(); 
		}
		
		if (item == ModItems.notecaelum1)
		{ 			
			baked.proxy.openguinotecaelum1(); 
		}
		
		if (item == ModItems.notemons1)
		{ 			
			baked.proxy.openguinotemons1(); 
		}
		
		if (item == ModItems.notecoletus1)
		{ 			
			baked.proxy.openguinotecoletus1(); 
		}
		
		if (item == ModItems.notefrigus1)
		{ 			
			baked.proxy.openguinotefrigus1(); 
		}
		
		if (item == ModItems.notefinal)
		{ 			
			baked.proxy.openguinotefinal(); 
		}
								
	}


}