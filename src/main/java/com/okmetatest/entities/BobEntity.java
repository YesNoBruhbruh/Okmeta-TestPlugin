package com.okmetatest.entities;

import org.bukkit.Location;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class BobEntity {

    private final Location location;

    private Random random = ThreadLocalRandom.current();

    public BobEntity(Location location){
        this.location = location;
    }

    public void spawn(){

    }

    public void spawnBobWithMinions(){

    }
}