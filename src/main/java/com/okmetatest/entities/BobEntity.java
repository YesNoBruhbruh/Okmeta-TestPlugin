package com.okmetatest.entities;

import com.maanraj514.builder.EntityBuilder;
import com.maanraj514.builder.ItemBuilder;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.EquipmentSlot;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import static com.maanraj514.utils.MessageUtilKt.toColor;

public class BobEntity {

    private final Location location;

    private final Random random = ThreadLocalRandom.current();

    public BobEntity(Location location){
        this.location = location;
    }

    public void spawn(){
        Zombie zombie = (Zombie) new EntityBuilder(EntityType.ZOMBIE)
                .setName(toColor("&aBob"))
                .setGlowing(true)
                .spawn(location);
        zombie.setAdult();

        zombie.getEquipment().setHelmet(new ItemBuilder(Material.DIAMOND_HELMET)
                .addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true)
                .build());
        zombie.getEquipment().setChestplate(new ItemBuilder(Material.DIAMOND_CHESTPLATE)
                .addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true)
                .build());
        zombie.getEquipment().setLeggings(new ItemBuilder(Material.DIAMOND_LEGGINGS)
                .addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true)
                .build());
        zombie.getEquipment().setBoots(new ItemBuilder(Material.DIAMOND_BOOTS)
                .addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true)
                .build());
        zombie.getEquipment().setItemInMainHand(new ItemBuilder(Material.DIAMOND_SWORD)
                .addEnchant(Enchantment.DAMAGE_ALL, 5, true)
                .build());
        zombie.getEquipment().setItemInOffHand(new ItemBuilder(Material.DIAMOND_SWORD)
                .addEnchant(Enchantment.DAMAGE_ALL, 5, true)
                .build());
        zombie.getEquipment().setDropChance(EquipmentSlot.HAND, 100);
    }

    public void spawnBobWithMinions(){
        for (int i = 0; i < 5; i++){
            Location locationToSpawn = location.add(random.nextDouble(1.0, 3.0), 0.0, random.nextDouble(1.0, 3.0));

            Zombie zombie = (Zombie) new EntityBuilder(EntityType.ZOMBIE)
                    .setName(toColor("&cMinion"))
                    .spawn(locationToSpawn);
            zombie.setBaby();
        }
    }
}