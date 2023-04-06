package com.guflimc.treasurechests.spigot.particle;

import com.guflimc.treasurechests.spigot.data.beans.ParticleEffect;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public class RandomParticleJob extends AbstractParticleJob {

    public RandomParticleJob(JavaPlugin plugin, Location location, ParticleEffect.ParticleType particleType) {
        super(plugin, location, particleType, 10);
    }

    @Override
    protected void onTick() {
        location.getWorld().spawnParticle(particleType.particle(), location.clone().add(0.5, 0.5, 0.5),
                3, 0.35f, 0.35f, 0.35f, 0.01f, particleType.data());
    }
}
