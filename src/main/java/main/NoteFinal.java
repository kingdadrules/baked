package main;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NoteFinal extends GuiScreen
{
    private final int bookImageHeight = 192;
    private final int bookImageWidth = 192;
    private int currPage = 0;
    private static final int bookTotalPages = 5;
    private static ResourceLocation[] bookPageTextures =  new ResourceLocation[bookTotalPages];
    private static String[] stringPageText = new String[bookTotalPages];
    private GuiButton buttonDone;
    private NextPageButton buttonNextPage;
    private NextPageButton buttonPreviousPage;
    
    public NoteFinal()
    {

        bookPageTextures[0] = new ResourceLocation(main.baked.modId + ":textures/gui/bgnotes.png");        

        stringPageText[0] = "\n\nSTATEMENT OF MENTAL HEALTH";
        stringPageText[1] = "You have been examined by the minecraft mental health assessment board. who declared you to be a loony.\n You have been removed from the game to ensure everyone's safety.";
        stringPageText[2] = "The board found that you have a deep and persistent belief in space pirates & you think they kidnapped you & dropped you on a non existent planet.";
        stringPageText[3] = "You then claim to have had a series of incredible adventures before making your way back to this world.";
        stringPageText[4] = "It was obvious to the board that someone with such ridiculous beliefs could not remain free in society.\n\n LOONY!!!";    
      
    }
    

    /**
     * Adds the buttons (and other controls) to the screen in question.
     */
    @Override
    public void initGui() 
    {
    
        buttonList.clear();
        Keyboard.enableRepeatEvents(true);

        buttonDone = new GuiButton(0, width / 2 + 2, 4 + bookImageHeight, 

              98, 20, I18n.format("gui.done", new Object[0]));
  
        buttonList.add(buttonDone);
        int offsetFromScreenLeft = (width - bookImageWidth) / 2;
        buttonList.add(buttonNextPage = new NextPageButton(1, 

              offsetFromScreenLeft + 120, 156, true));
        buttonList.add(buttonPreviousPage = new NextPageButton(2, 

              offsetFromScreenLeft + 38, 156, false));
    }

    /**
     * Called from the main game loop to update the screen.
     */
    @Override
    public void updateScreen() 
    {
        buttonDone.visible = (currPage == bookTotalPages - 1);
        buttonNextPage.visible = (currPage < bookTotalPages - 1);
        buttonPreviousPage.visible = currPage > 0;
    }
 
    /**
     * Draws the screen and all the components in it.
     */
    @Override
    public void drawScreen(int parWidth, int parHeight, float p_73863_3_)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        
        mc.getTextureManager().bindTexture(bookPageTextures[0]);
      
        int offsetFromScreenLeft = (width - bookImageWidth ) / 2;
        
        
        drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, bookImageWidth, bookImageHeight);
        //int widthOfString;
        
        /*
        String stringPageIndicator = I18n.format("book.pageIndicator", 
              new Object[] {Integer.valueOf(currPage + 1), bookTotalPages});

        widthOfString = fontRenderer.getStringWidth(stringPageIndicator);
        
        fontRenderer.drawString(stringPageIndicator, 
              offsetFromScreenLeft - widthOfString + bookImageWidth - 44, 
              18, 0);
        */

        fontRenderer.drawSplitString(stringPageText[currPage], 
              offsetFromScreenLeft + 36, 34, 116, 0);
        
        super.drawScreen(parWidth, parHeight, p_73863_3_);

    }

    /**
     * Called when a mouse button is pressed and the mouse is moved around. 

     * Parameters are : mouseX, mouseY, lastButtonClicked & 

     * timeSinceMouseClick.
     */
    @Override
    protected void mouseClickMove(int parMouseX, int parMouseY, 

          int parLastButtonClicked, long parTimeSinceMouseClick) 

    {
     
    }

    @Override
    protected void actionPerformed(GuiButton parButton) 
    {
     if (parButton == buttonDone)
     {
         // You can send a packet to server here if you need server to do 

         // something
         mc.displayGuiScreen((GuiScreen)null);
     }
        else if (parButton == buttonNextPage)
        {
            if (currPage < bookTotalPages - 1)
            {
                ++currPage;
            }
        }
        else if (parButton == buttonPreviousPage)
        {
            if (currPage > 0)
            {
                --currPage;
            }
        }
   }

    /**
     * Called when the screen is unloaded. Used to disable keyboard repeat 

     * events
     */
    @Override
    public void onGuiClosed() 
    {
     
    }

    /**
     * Returns true if this GUI should pause the game when it is displayed in 

     * single-player
     */
    @Override
    public boolean doesGuiPauseGame()
    {
        return true;
    }
    
    @SideOnly(Side.CLIENT)
	public
    static class NextPageButton extends GuiButton
    {
        private final boolean isNextButton;

        public NextPageButton(int parButtonId, int parPosX, int parPosY, 

              boolean parIsNextButton)
        {
            super(parButtonId, parPosX, parPosY, 23, 13, "");
            isNextButton = parIsNextButton;
        }

        /**
         * Draws this button to the screen.
         */
        
      @Override
        public void drawButton(Minecraft mc, int parX, int parY, float partialTicks)
        {
            if (visible)
            {
                boolean isButtonPressed = (parX >= x 

                      && parY >= y 

                      && parX < x + width 

                      && parY < y + height);

                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                mc.getTextureManager().bindTexture(bookPageTextures[0]);
                int textureX = 0;
                int textureY = 192;

                if (isButtonPressed)
                {
                    textureX += 23;
                }

                if (!isNextButton)
                {
                    textureY += 13;
                }

                drawTexturedModalRect(x, y, 

                      textureX, textureY, 

                      23, 13);
            }
        }
    }
}

