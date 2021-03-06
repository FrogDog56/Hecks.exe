package me.frogdog.hecks.command;

import com.mojang.realmsclient.gui.ChatFormatting;
import me.frogdog.hecks.Hecks;
import net.minecraft.util.text.TextComponentString;

public abstract class Command {

    private static final String prefix = "-";
    private final String syntax;
    private final String[] alias;
    private final String mainAlias;

    public Command(String[] alias, String syntax) {
        this.alias = alias;
        this.mainAlias = alias[0];
        this.syntax = syntax;
    }

    public abstract void onClientCommand(String command, String[] args) throws Exception;

    public static void sendClientSideMessage(String message) {
        Hecks.getInstance().mc.player.sendMessage(new TextComponentString(ChatFormatting.DARK_RED + "[Hecks.exe] "+ ChatFormatting.WHITE + message ));
    }

    public static String getPrefix() {
        return prefix;
    }

    public String[] getAlias() {
        return this.alias;
    }

    public String getMainAlias() {
        return this.mainAlias;
    }

    public String getSyntax() {
        return this.syntax;
    }
}
