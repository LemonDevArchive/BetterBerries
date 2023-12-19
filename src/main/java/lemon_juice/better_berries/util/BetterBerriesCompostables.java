package lemon_juice.better_berries.util;

import lemon_juice.better_berries.item.BetterBerriesItems;
import net.minecraft.world.level.ItemLike;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class BetterBerriesCompostables {
    public static void setup(final FMLCommonSetupEvent event) {

        add(0.3F, BetterBerriesItems.BLACKBERRIES.get());
        add(0.3F, BetterBerriesItems.BLUEBERRIES.get());
        add(0.3F, BetterBerriesItems.MALOBERRIES.get());
        add(0.3F, BetterBerriesItems.RASPBERRIES.get());

        add(0.35F, BetterBerriesItems.BLACKBERRY_JUICE.get());
        add(0.35F, BetterBerriesItems.BLUEBERRY_JUICE.get());
        add(0.35F, BetterBerriesItems.MALOBERRY_JUICE.get());
        add(0.35F, BetterBerriesItems.RASPBERRY_JUICE.get());
        add(0.35F, BetterBerriesItems.SWEET_BERRY_JUICE.get());
        add(0.35F, BetterBerriesItems.GLOW_BERRY_JUICE.get());

        add(0.4F, BetterBerriesItems.BLACKBERRY_SMOOTHIE.get());
        add(0.4F, BetterBerriesItems.BLUEBERRY_SMOOTHIE.get());
        add(0.4F, BetterBerriesItems.MALOBERRY_SMOOTHIE.get());
        add(0.4F, BetterBerriesItems.RASPBERRY_SMOOTHIE.get());
        add(0.4F, BetterBerriesItems.SWEET_BERRY_SMOOTHIE.get());
        add(0.4F, BetterBerriesItems.GLOW_BERRY_SMOOTHIE.get());

        add(0.9F, BetterBerriesItems.BERRY_MEDLEY.get());
    }

    public static void add(float quantity, ItemLike itemLike) {
        COMPOSTABLES.put(itemLike.asItem(), quantity);
    }
}
