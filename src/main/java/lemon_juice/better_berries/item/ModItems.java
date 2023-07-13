package lemon_juice.better_berries.item;

import lemon_juice.better_berries.BetterBerries;
import lemon_juice.better_berries.block.ModBlocks;
import lemon_juice.better_berries.item.custom.BerryItemNameBlockItem;
import lemon_juice.better_berries.item.custom.BerryMedleyItem;
import lemon_juice.better_berries.item.custom.DrinkItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.Items.GLASS_BOTTLE;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterBerries.MOD_ID);

    // Berries
    public static final RegistryObject<Item> BLACKBERRIES = ITEMS.register("blackberries", () -> new BerryItemNameBlockItem(ModBlocks.BLACKBERRY_BUSH.get(), (new Item.Properties()).food(ModFoods.BERRIES)));
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries", () -> new BerryItemNameBlockItem(ModBlocks.BLUEBERRY_BUSH.get(), (new Item.Properties()).food(ModFoods.BERRIES)));
    public static final RegistryObject<Item> MALOBERRIES = ITEMS.register("maloberries", () -> new BerryItemNameBlockItem(ModBlocks.MALOBERRY_BUSH.get(), (new Item.Properties()).food(ModFoods.BERRIES)));
    public static final RegistryObject<Item> RASPBERRIES = ITEMS.register("raspberries", () -> new BerryItemNameBlockItem(ModBlocks.RASPBERRY_BUSH.get(), (new Item.Properties()).food(ModFoods.BERRIES)));

    public static final RegistryObject<Item> BERRY_MEDLEY = ITEMS.register("berry_medley", () -> new BerryMedleyItem((new Item.Properties()).food(ModFoods.BERRY_MEDLEY)));

    // Juice Items
    public static final RegistryObject<Item> BLACKBERRY_JUICE = ITEMS.register("blackberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JUICE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> BLUEBERRY_JUICE = ITEMS.register("blueberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JUICE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> GLOW_BERRY_JUICE = ITEMS.register("glow_berry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JUICE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> MALOBERRY_JUICE = ITEMS.register("maloberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JUICE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> RASPBERRY_JUICE = ITEMS.register("raspberry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JUICE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> SWEET_BERRY_JUICE = ITEMS.register("sweet_berry_juice", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.JUICE_BOTTLE).stacksTo(16)));

    // Smoothie Items
    public static final RegistryObject<Item> BLACKBERRY_SMOOTHIE = ITEMS.register("blackberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> BLUEBERRY_SMOOTHIE = ITEMS.register("blueberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> GLOW_BERRY_SMOOTHIE = ITEMS.register("glow_berry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> MALOBERRY_SMOOTHIE = ITEMS.register("maloberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> RASPBERRY_SMOOTHIE = ITEMS.register("raspberry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.SMOOTHIE_BOTTLE).stacksTo(16)));
    public static final RegistryObject<Item> SWEET_BERRY_SMOOTHIE = ITEMS.register("sweet_berry_smoothie", () -> new DrinkItem((new Item.Properties()).craftRemainder(GLASS_BOTTLE).food(ModFoods.SMOOTHIE_BOTTLE).stacksTo(16)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
