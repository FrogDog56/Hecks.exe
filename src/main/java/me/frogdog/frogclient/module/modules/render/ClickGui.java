package me.frogdog.frogclient.module.modules.render;

import me.frogdog.frogclient.module.ModuleType;
import me.frogdog.frogclient.module.ToggleableModule;

public final class ClickGui extends ToggleableModule {
    public ClickGui() {
        super("Click Gui", new String[]{"clickgui"}, ModuleType.RENDER);
    }

    @Override
    protected void onEnable() {
        super.onEnable();
        this.mc.displayGuiScreen(me.frogdog.frogclient.module.modules.render.clickgui.ClickGui.getClickGui());
        this.setRunning(false);
    }
}
