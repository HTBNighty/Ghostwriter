package wafflestomper.ghostwriter.utilities;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.util.text.TextFormatting;

public class Printer {
	// I think we've already established that I'm a terrible person
	public static final TextFormatting GRAY = TextFormatting.GRAY;
	public static final TextFormatting DARK_GRAY = TextFormatting.DARK_GRAY;
	public static final TextFormatting GREEN = TextFormatting.GREEN;
	public static final TextFormatting AQUA = TextFormatting.AQUA;
	public static final TextFormatting RED = TextFormatting.RED;
	private static final Minecraft MC = Minecraft.getInstance();
	
	public void gamePrint(String inStr) {
		MC.ingameGUI.getChatGUI().printChatMessage(new TextComponent(inStr));
	}
}
