package com.okmetatest.entities;

import com.maanraj514.builder.EntityBuilder;
import org.bukkit.Location;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class JebEntity {

    private final Location location;

    private final Random random = ThreadLocalRandom.current();

    public JebEntity(Location location){
        this.location = location;
    }

    public void spawn() {
        Entity sheep = new EntityBuilder(EntityType.SHEEP)
                .setName("jeb_")
                .setNameVisible(false)
                .addAttribute(Attribute.GENERIC_MAX_HEALTH, 1000.0)
                .setHealth(1000.0)
                .spawn(location.add(random.nextDouble(0.0, 5.0), 0.0, random.nextDouble(0.0, 5.0)));
    }

    public void spawnTower(){
        Entity[] sheep = new Entity[7];
        for (int i = 0; i < sheep.length; i++) {

            EntityBuilder builder = new EntityBuilder(EntityType.SHEEP)
                            .setName("jeb_")
                            .setNameVisible(false)
                            .addAttribute(Attribute.GENERIC_MAX_HEALTH, 1000.0)
                            .setHealth(1000.0);

            sheep[i] = builder.spawn(location.add(random.nextDouble(0.0, 5.0), 0.0, random.nextDouble(0.0, 5.0)));
            if (i > 0) {
                sheep[i-1].addPassenger(sheep[i]);
            }
        }
    }
}