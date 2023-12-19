package lemon_juice.better_berries.item;

import lemon_juice.better_berries.BetterBerries;
import lemon_juice.better_berries.block.BetterBerriesBlocks;
import lemon_juice.better_berries.item.custom.BerryItemNameBlockItem;
import lemon_juice.better_berries.item.custom.BerryMedleyItem;
import lemon_juice.better_berries.item.custom.DrinkItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static net.minecraft.world.item.Items.GLASS_BOTTLE;

public class BetterBerriesItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BetterBerries.MOD_ID);

    // Berries
    public static final DeferredItem<Item> BLACKBERRIES = ITEMS.register("blackberries", () -> new BerryItemNameBlockItem(BetterBerriesBlocks.BLACKBERRY_BUSH.get(), (new Item.Properties()).food(BetterBerriesFoods.BERRIES)));
    public static final DeferredItem<Item> BLUEBERRIES = ITEMS.register("blueberries", () -> new BerryItemNameBlockItem(BetterBerriesBlocks.BLUEBERRY_BUSH.get(), (new Item.Properties()).food(BetterBerriesFoods.BERRIES)));
    public static final DeferredItem<Item> MALOBERRIES = ITEMS.register("maloberries", () -> new BerryItemNameBlockItem(BetterBerriesBlocks.MALOBERRY_BUSH.get(), (new Item.Properties()).food(BetterBerriesFoods.BERRIES)));
    public static final DeferredItem<Item> RASPBERRIES = ITEMS.register("raspberries", () -> new BerryItemNameBlockItem(BetterBerriesBlocks.RASPBERRY_BUSH.get(), (new Item.Properties()).food(BetterBerriesFoods.BERRIES)));

    public static final DeferredItem<Item> BERRY_MEDLEY = ITEMS.register("berry_medley", () -> new BerryMedleyItem((new Item.Properties()).food(BetterBerriesFoods.BERRY_MEDLEY)));

    // Juice Items
    public static final DeferredItem<Item> BLACKBERRY_JUICE = ITEMS.register("blackberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(BetterBerriesFoods.JUICE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> BLUEBERRY_JUICE = ITEMS.register("blueberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(BetterBerriesFoods.JUICE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> GLOW_BERRY_JUICE = ITEMS.register("glow_berry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(BetterBerriesFoods.JUICE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> MALOBERRY_JUICE = ITEMS.register("maloberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(BetterBerriesFoods.JUICE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> RASPBERRY_JUICE = ITEMS.register("raspberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(BetterBerriesFoods.JUICE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> SWEET_BERRY_JUICE = ITEMS.register("sweet_berry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(BetterBerriesFoods.JUICE_BOTTLE).stacksTo(16)));

    // Smoothie Items
    public static final DeferredItem<Item> BLACKBERRY_SMOOTHIE = ITEMS.register("blackberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(BetterBerriesFoods.SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> BLUEBERRY_SMOOTHIE = ITEMS.register("blueberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(BetterBerriesFoods.SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> GLOW_BERRY_SMOOTHIE = ITEMS.register("glow_berry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(BetterBerriesFoods.SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> MALOBERRY_SMOOTHIE = ITEMS.register("maloberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(BetterBerriesFoods.SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> RASPBERRY_SMOOTHIE = ITEMS.register("raspberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(BetterBerriesFoods.SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final DeferredItem<Item> SWEET_BERRY_SMOOTHIE = ITEMS.register("sweet_berry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(BetterBerriesFoods.SMOOTHIE_BOTTLE).stacksTo(16)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
