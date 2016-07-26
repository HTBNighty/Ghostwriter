package wafflestomper.ghostwriter;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;

public class Printer{
	private Minecraft mc = Minecraft.getMinecraft();
	
	// I think we've already established that I'm a terrible person 
	public static final ChatFormatting BLACK = ChatFormatting.BLACK;
	public static final ChatFormatting DARK_BLUE = ChatFormatting.DARK_BLUE;
	public static final ChatFormatting DARK_GREEN = ChatFormatting.DARK_GREEN;
	public static final ChatFormatting DARK_AQUA = ChatFormatting.DARK_AQUA;
	public static final ChatFormatting DARK_RED = ChatFormatting.DARK_RED;
	public static final ChatFormatting DARK_PURPLE = ChatFormatting.DARK_PURPLE;
	public static final ChatFormatting GOLD = ChatFormatting.GOLD;
	public static final ChatFormatting GRAY = ChatFormatting.GRAY;
	public static final ChatFormatting DARK_GRAY = ChatFormatting.DARK_GRAY;
	public static final ChatFormatting BLUE = ChatFormatting.BLUE;
	public static final ChatFormatting GREEN = ChatFormatting.GREEN;
	public static final ChatFormatting AQUA = ChatFormatting.AQUA;
	public static final ChatFormatting RED = ChatFormatting.RED;
	public static final ChatFormatting LIGHT_PURPLE = ChatFormatting.LIGHT_PURPLE;
	public static final ChatFormatting YELLOW = ChatFormatting.YELLOW;
	public static final ChatFormatting WHITE = ChatFormatting.WHITE;
	public static final ChatFormatting OBFUSCATED = ChatFormatting.OBFUSCATED;
	public static final ChatFormatting BOLD = ChatFormatting.BOLD;
	public static final ChatFormatting STRIKETHROUGH = ChatFormatting.STRIKETHROUGH;
	public static final ChatFormatting UNDERLINE = ChatFormatting.UNDERLINE;
	public static final ChatFormatting ITALIC = ChatFormatting.ITALIC;
	public static final ChatFormatting RESET = ChatFormatting.RESET;
	
	public Printer(){
	}
	
	public void gamePrint(String inStr){
		this.mc.thePlayer.addChatMessage(new TextComponentString(inStr));
	}
	
	public void print(String toPrint){
		System.out.println(toPrint);
	}

	public void print(float toPrint) {
		print (String.format("%.2f", toPrint));
	}
}