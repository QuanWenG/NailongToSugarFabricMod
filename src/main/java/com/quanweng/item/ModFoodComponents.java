package com.quanweng.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent YellowPeach = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();

    public static final FoodComponent CannedYellowPeaches = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,100),0.8f).build();
}

