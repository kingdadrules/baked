package proxy;



import arbosworld.NoteArbos1;
import bakedworld.NoteBaked1;
import bakedworld.NoteBaked2;
import bathisworld.NoteBathis1;
import caelumworld.NoteCaelum1;
import coletusworld.NoteColetus1;
import frigusworld.NoteFrigus1;
import insulaworld.NoteInsula1;
import main.JoinGui;
import main.NoteFinal;
import monsworld.NoteMons1;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import silvamworld.NoteSilvam1;



public class ClientProxy extends CommonProxy{
	

	public void registerItemRenderer(Item item, int meta, String id) {	
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(main.baked.modId + ":" + id, "inventory"));
	}	
			
	@Override
	public void openguijoin()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new JoinGui());
	}
	
	@Override
	public void openguinotebaked1()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new NoteBaked1());
	}
	@Override
	public void openguinotebaked2()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new NoteBaked2());
	}
		
	
	@Override
	public void openguinotearbos1()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new NoteArbos1());
	}
	
	@Override
	public void openguinotebathis1()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new NoteBathis1());
	}
	
	@Override
	public void openguinotesilvam1()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new NoteSilvam1());
	}
	
	@Override
	public void openguinoteinsula1()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new NoteInsula1());
	}
	
	@Override
	public void openguinotecaelum1()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new NoteCaelum1());
	}
	
	@Override
	public void openguinotemons1()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new NoteMons1());
	}
	
	@Override
	public void openguinotecoletus1()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new NoteColetus1());
	}
	
	@Override
	public void openguinotefrigus1()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new NoteFrigus1());
	}
	
	@Override
	public void openguinotefinal()
	{
	     Minecraft.getMinecraft().displayGuiScreen(new NoteFinal());
	}
	
		
}

