package me.frogdog.frogclient.ui.components;

import me.frogdog.frogclient.Frog;
import me.frogdog.frogclient.event.Listener;
import me.frogdog.frogclient.event.events.RenderGameOverlayEvent;
import me.frogdog.frogclient.ui.HudComponent;
import me.frogdog.frogclient.util.minecraft.render.FontUtil;

public final class Coords extends HudComponent {

	public Coords() {
		super("coords");
	}
	
	public void render() {
		if (Frog.getInstance().mc.player.dimension == 0) {
			FontUtil.drawString("X " + (long) Frog.getInstance().mc.player.posX + " Y " + (long) Frog.getInstance().mc.player.posY + " Z " +  (long) Frog.getInstance().mc.player.posZ + " Nether: X " + (long) Frog.getInstance().mc.player.posX / 8 + " Z " + (long) Frog.getInstance().mc.player.posZ / 8, 2, 500, FontUtil.rainbow(1 * 360));
		} else if (Frog.getInstance().mc.player.dimension == -1) {
			FontUtil.drawString("X " + (long) Frog.getInstance().mc.player.posX + " Y " + (long) Frog.getInstance().mc.player.posY + " Z " +  (long) Frog.getInstance().mc.player.posZ + " OverWorld: X " + (long) Frog.getInstance().mc.player.posX * 8 + " Z " + (long) Frog.getInstance().mc.player.posZ * 8, 2, 500, FontUtil.rainbow(1 * 360));
		} else {
			FontUtil.drawString("X " + (long) Frog.getInstance().mc.player.posX + " Y " + (long) Frog.getInstance().mc.player.posY + " Z " +  (long) Frog.getInstance().mc.player.posZ, 2, 500, FontUtil.rainbow(1 * 360));
		}
	}

}