package lemon_juice.better_berries.util;

import lemon_juice.better_berries.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class ModCompostables {
    public static void setup(final FMLCommonSetupEvent event) {

        add(0.3F, ModItems.BLACKBERRIES.get());
        add(0.3F, ModItems.BLUEBERRIES.get());
        add(0.3F, ModItems.MALOBERRIES.get());
        add(0.3F, ModItems.RASPBERRIES.get());

        add(0.35F, ModItems.BLACKBERRY_JUICE.get());
        add(0.35F, ModItems.BLUEBERRY_JUICE.get());
        add(0.35F, ModItems.MALOBERRY_JUICE.get());
        add(0.35F, ModItems.RASPBERRY_JUICE.get());
        add(0.35F, ModItems.SWEET_BERRY_JUICE.get());
        add(0.35F, ModItems.GLOW_BERRY_JUICE.get());

        add(0.4F, ModItems.BLACKBERRY_SMOOTHIE.get());
        add(0.4F, ModItems.BLUEBERRY_SMOOTHIE.get());
        add(0.4F, ModItems.MALOBERRY_SMOOTHIE.get());
        add(0.4F, ModItems.RASPBERRY_SMOOTHIE.get());
        add(0.4F, ModItems.SWEET_BERRY_SMOOTHIE.get());
        add(0.4F, ModItems.GLOW_BERRY_SMOOTHIE.get());

        add(0.9F, ModItems.BERRY_MEDLEY.get());
    }

    public static void add(float quantity, ItemLike itemLike) {
        COMPOSTABLES.put(itemLike.asItem(), quantity);
    }
}
