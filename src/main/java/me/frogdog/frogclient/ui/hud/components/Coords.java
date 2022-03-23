package me.frogdog.frogclient.ui.hud.components;

import me.frogdog.frogclient.Frog;
import me.frogdog.frogclient.ui.hud.HudComponent;

public final class Coords extends HudComponent {
	
	public Coords() {
		super("coords", 2, 500);
	}
	
	@Override
	public String getComponent() {
		if (Frog.getInstance().mc.player.dimension == 0) {
			return "X " + (long) Frog.getInstance().mc.player.posX + " Y " + (long) Frog.getInstance().mc.player.posY + " Z " +  (long) Frog.getInstance().mc.player.posZ + " Nether: X " + (long) Frog.getInstance().mc.player.posX / 8 + " Z " + (long) Frog.getInstance().mc.player.posZ / 8;
		} else if (Frog.getInstance().mc.player.dimension == -1) {
			return "X " + (long) Frog.getInstance().mc.player.posX + " Y " + (long) Frog.getInstance().mc.player.posY + " Z " +  (long) Frog.getInstance().mc.player.posZ + " OverWorld: X " + (long) Frog.getInstance().mc.player.posX * 8 + " Z " + (long) Frog.getInstance().mc.player.posZ * 8;
		} else {
			return "X " + (long) Frog.getInstance().mc.player.posX + " Y " + (long) Frog.getInstance().mc.player.posY + " Z " +  (long) Frog.getInstance().mc.player.posZ;
		}
	}

}