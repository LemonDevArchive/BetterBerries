package lemon_juice.better_berries.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BERRIES = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).alwaysEat().build();
    public static final FoodProperties BERRY_MEDLEY = (new FoodProperties.Builder()).nutrition(5).saturationMod(1.4F).build();
    public static final FoodProperties JUICE_BOTTLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.2F).build();
    public static final FoodProperties SMOOTHIE_BOTTLE = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.3F).build();
}
