package events;

import java.io.IOException;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteractSpecific;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class PlayerInteractEntity {

	@SuppressWarnings("deprecation")
	@SubscribeEvent(priority=EventPriority.NORMAL, receiveCanceled=false)
	public void onEvent(EntityInteractSpecific event) throws IOException
	
	{
		Entity entity = event.getTarget();
		EntityPlayer player = event.getEntityPlayer();
		NBTTagCompound tag = player.getEntityData();
		String loonyinuse = tag.getString("loonyinuse");
		
		if (!player.world.isRemote && (loonyinuse == null || loonyinuse == "n" || loonyinuse == ""))
		{
			
			if (entity instanceof EntityVillager && ((EntityVillager) entity).getProfession() == 6) 
			{	
				player.sendMessage(new TextComponentString(" "));
				tag.setString("loonyinuse", "y");	
				int rand = (int)(Math.random() * 40 + 1);
				switch (rand) {
				case 1:
					player.sendMessage(new TextComponentString("They say I'm a loony!"));
				break;
				case 2:
					player.sendMessage(new TextComponentString("Those space pirates are real whatever they say!"));
				break;
				case 3:
					player.sendMessage(new TextComponentString("They took me in their spaceship you know, honestly!"));
				break;
				case 4:
					player.sendMessage(new TextComponentString("I've got my own special safe place, all fluffy & pink."));
				break;
				case 5:
					player.sendMessage(new TextComponentString("I DID see them space pirates, whatever they say ... I'd only drunk a few that night anyway. "));
				break;
				case 6:
					player.sendMessage(new TextComponentString("The Pirate Divining Rod always finds hidden pirates, honest!!! Just point it and say 'beep beep' "));
				break;		
				case 7:
					player.sendMessage(new TextComponentString("Flubbber wibble wibble .... sorry, time for my tablets!"));
				break;	
				case 8:
					player.sendMessage(new TextComponentString("I'm best mates with Wonko you know."));
				break;	
				case 9:
					player.sendMessage(new TextComponentString("I've got my own set of rubber crayons."));
				break;	
				case 10:
					player.sendMessage(new TextComponentString("The angels DO wear Dr Scholl sandals, he was right."));
				break;	
				case 11:
					player.sendMessage(new TextComponentString("Do you like my helmet? I made it myself out of tin foil."));
				break;	
				case 12:
					player.sendMessage(new TextComponentString("I hear voices in my head, but I don't always obey them!"));
				break;	
				case 13:
					player.sendMessage(new TextComponentString("The government hush it all up you know."));
				break;	
				case 14:
					player.sendMessage(new TextComponentString("The space pirates ship is called the Rolly Joger, it's true!"));
				break;	
				case 15:
					player.sendMessage(new TextComponentString("They beam invisible messages at me when I'm asleep you know."));
				break;	
				case 16:
					player.sendMessage(new TextComponentString("Thrappp, warrrppp ... why yes Dr Livingstone, I'll fight your stuffed tulip!!!!"));
				break;	
				case 17:
					player.sendMessage(new TextComponentString("The pirates come often, but I'm the only one who sees them, so trust me."));
				break;	
				case 18:
					player.sendMessage(new TextComponentString("The pirate aliens took me on board & performed experiments on me."));
				break;	
				case 19:
					player.sendMessage(new TextComponentString("It's true, all true, the pirates exist! I can draw you a picture of them with my rubber crayons, that proves it!!!!"));
				break;	
				case 20:
					player.sendMessage(new TextComponentString("I've got a pet fish called Eric, I keep him in my trousers."));
				break;	
				case 21:
					player.sendMessage(new TextComponentString("They make me wear this straight jacket, but I don't need it."));
				break;	
				case 22:
					player.sendMessage(new TextComponentString("Do you like the nice jacket they made me? It's a bit tight, but stops my hands escaping & doing their things!"));
				break;	
				case 23:
					player.sendMessage(new TextComponentString("Help me take this straight jacket off, I'm better now, honest."));
				break;	
				case 24:
					player.sendMessage(new TextComponentString("They only let me out if I have my straight jacket on."));
				break;	
				case 25:
					player.sendMessage(new TextComponentString("Can you scratch my nose? I can't reach it with my 'special' jacket on."));
				break;	
				case 26:
					player.sendMessage(new TextComponentString("The pirates will steal anything you've got. Their leader, Wodger, is a bwute!!!!"));
				break;
				case 27:
					player.sendMessage(new TextComponentString("Click that beacon baby, click it, click it!!!!!!"));
				break;	
				case 28:
					player.sendMessage(new TextComponentString("I've got the beacon to call them pirates, you just need the emeralds to buy it."));
				break;	
				case 29:
					player.sendMessage(new TextComponentString("I tried eating the Pirate Beacon, but I couldn't fit it in my mouth!!!!"));
				break;	
				case 30:
					player.sendMessage(new TextComponentString("They home in on those beacons, as soon as you right click them on. Honest!"));
				break;
				case 31:
					player.sendMessage(new TextComponentString("An apple a day keeps the pirates away.... No, sorry that's completely hatstand ... I mean wrong!"));
				break;
				case 32:
					player.sendMessage(new TextComponentString("Beacons are red, rods are blue, Click the rod on the beacon & they will come for you!"));	
				break;	
				case 33:
					player.sendMessage(new TextComponentString("I ate an apple once & the space pirates came for me! ... or was it the chickens?"));	
				break;	
				case 34:
					player.sendMessage(new TextComponentString("They put all sorts in our food nowadays, you never know what will happen when you eat it!"));	
				break;	
				case 35:
					player.sendMessage(new TextComponentString("Do you like sausages as much as I do? You can come home and see my collection if you like."));	
					player.sendMessage(new TextComponentString("I keep them all nailed to the wall."));	
				break;	
				case 36:
					player.sendMessage(new TextComponentString("Fruit rules & it's easier to eat than beacons & rods ... I tried eating them all!"));	
				break;	
				case 37:
					player.sendMessage(new TextComponentString("Flubber wubber Mr. Jelly is coming out to play. blip!!"));	
				break;	
				case 38:
					player.sendMessage(new TextComponentString("I carve the emeralds I get into little nose puppies & hide them in the vicar's teapot."));	
				break;	
				case 39:
					player.sendMessage(new TextComponentString("They spy on us all you know.... that's why I always wear my helmet & lucky metal underpants."));	
				break;	
				case 40:
					player.sendMessage(new TextComponentString("BOOOOINNNNGGG BOOOOOOOOOOOOOOOOIIIIIIIIIIIIIIINNNNNNNNNNNNNNGGGGGGGGGG  fwap."));	
				break;	
				
				}					
			}
			tag.setString("loonyinuse", "n");	
		}			
	}
}
