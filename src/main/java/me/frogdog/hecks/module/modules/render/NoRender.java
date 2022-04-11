package me.frogdog.hecks.module.modules.render;

import me.frogdog.hecks.module.ModuleType;
import me.frogdog.hecks.module.ToggleableModule;
import me.frogdog.hecks.property.Property;
import net.minecraft.init.MobEffects;
import net.minecraftforge.client.GuiIngameForge;
import net.minecraftforge.client.event.RenderWorldLastEvent;

public final class NoRender extends ToggleableModule {
    private final Property<Boolean> pumpkin = new Property<Boolean>(true, "NoPumpkin", "p", "np");
    private final Property<Boolean> fire = new Property<Boolean>(true, "NoFire", "fire", "nf");
    private final Property<Boolean> hurtcam = new Property<Boolean>(false, "NoHurtcam", "hurtcam", "nh");
    private final Property<Boolean> armour = new Property<Boolean>(false, "NoArmour", "armour",  "na");
    private final Property<Boolean> portalNausea = new Property<Boolean>(false, "NoPortalNausea", "portalnausea",  "np");

    public NoRender() {
        super("NoRender", new String[]{"render", "norender", "nr"}, ModuleType.RENDER);
        this.offerProperties(this.pumpkin, this.fire, this.hurtcam, this.armour, this.portalNausea, this.keybind);
    }

    @Override
    public void render(RenderWorldLastEvent event) {
        if (NoRender.this.pumpkin.getValue()) {

        }

        if (NoRender.this.fire.getValue()) {

        }

        if (NoRender.this.hurtcam.getValue()) {

        }

        if (NoRender.this.portalNausea.getValue()) {
            GuiIngameForge.renderPortal = false;
            mc.player.removeActivePotionEffect(MobEffects.NAUSEA);
        }

    }
}