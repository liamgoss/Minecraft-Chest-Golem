package com.liamgoss.chestGolem.entities;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.goal.Goal;
// C:\Users\liam\AppData\Roaming\.minecraft\libraries\net\minecraft\client\1.20.1-20230612.114412\client-1.20.1-20230612.114412-mappings.txt-deobfuscated\net\minecraft\world\entity\ai
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class ChestGolemEntity extends PathfinderMob {
    public ChestGolemEntity(EntityType<? extends PathfinderMob> type, Level world) {
        super(type, world);
    }

    @Override
    protected void registerGoals() {
        // Add basic movement and interaction goals
        this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1.0)); // Normal speed
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
        
        // Add custom fetching goals
        this.goalSelector.addGoal(4, new FetchItemGoal(this)); // Custom goal for fetching items
    }

    // Add any other necessary methods or override existing ones
}
