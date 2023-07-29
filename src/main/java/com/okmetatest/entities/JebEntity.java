package com.okmetatest.entities;

import com.maanraj514.builder.EntityBuilder;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;

public class JebEntity {

    private final Location location;

    public JebEntity(Location location){
        this.location = location;
    }

    public void spawn() {
        new EntityBuilder(EntityType.SHEEP)
                .setName("jeb_")
                .set
    }

    public void spawnTower(){

    }
}