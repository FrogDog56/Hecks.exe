package me.frogdog.frogclient.module.modules.combat;

import me.frogdog.frogclient.module.ModuleType;
import me.frogdog.frogclient.module.ToggleableModule;

public final class KillAura extends ToggleableModule {

	public KillAura() {
		super("KillAura", new String[] {"KillAura", "killaura"}, ModuleType.COMBAT);
        this.offerProperties(this.keybind);
	}

}
