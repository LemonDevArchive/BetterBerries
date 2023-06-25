package lemon_juice.better_berries.item;

import lemon_juice.better_berries.BetterBerries;
import lemon_juice.better_berries.block.ModBlocks;
import lemon_juice.better_berries.item.custom.BerryItemNameBlockItem;
import lemon_juice.better_berries.item.custom.BerryMedleyItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterBerries.MOD_ID);

    // Berries
    public static final RegistryObject<Item> BLACKBERRIES = ITEMS.register("blackberries", () -> new BerryItemNameBlockItem(ModBlocks.BLACKBERRY_BUSH.get(), (new Item.Properties()).food(ModFoods.BERRIES)));
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries", () -> new BerryItemNameBlockItem(ModBlocks.BLUEBERRY_BUSH.get(), (new Item.Properties()).food(ModFoods.BERRIES)));
    public static final RegistryObject<Item> MALOBERRIES = ITEMS.register("maloberries", () -> new BerryItemNameBlockItem(ModBlocks.MALOBERRY_BUSH.get(), (new Item.Properties()).food(ModFoods.BERRIES)));
    public static final RegistryObject<Item> RASPBERRIES = ITEMS.register("raspberries", () -> new BerryItemNameBlockItem(ModBlocks.RASPBERRY_BUSH.get(), (new Item.Properties()).food(ModFoods.BERRIES)));

    public static final RegistryObject<Item> BERRY_MEDLEY = ITEMS.register("berry_medley", () -> new BerryMedleyItem((new Item.Properties()).food(ModFoods.BERRY_MEDLEY)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
