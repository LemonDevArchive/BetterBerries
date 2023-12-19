package lemon_juice.better_berries.creativetab;

import lemon_juice.better_berries.BetterBerries;
import lemon_juice.better_berries.item.BetterBerriesItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BetterBerriesCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterBerries.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BETTER_BERRIES_TAB = CREATIVE_MODE_TABS.register("better_berries", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_berries"))
            .icon(() -> new ItemStack(BetterBerriesItems.BERRY_MEDLEY.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BETTER_BERRIES_TAB.get()) {
            event.accept(BetterBerriesItems.BLACKBERRIES.get());
            event.accept(BetterBerriesItems.BLUEBERRIES.get());
            event.accept(BetterBerriesItems.MALOBERRIES.get());
            event.accept(BetterBerriesItems.RASPBERRIES.get());

            event.accept(BetterBerriesItems.BLACKBERRY_JUICE.get());
            event.accept(BetterBerriesItems.BLUEBERRY_JUICE.get());
            event.accept(BetterBerriesItems.GLOW_BERRY_JUICE.get());
            event.accept(BetterBerriesItems.MALOBERRY_JUICE.get());
            event.accept(BetterBerriesItems.RASPBERRY_JUICE.get());
            event.accept(BetterBerriesItems.SWEET_BERRY_JUICE.get());

            event.accept(BetterBerriesItems.BLACKBERRY_SMOOTHIE.get());
            event.accept(BetterBerriesItems.BLUEBERRY_SMOOTHIE.get());
            event.accept(BetterBerriesItems.GLOW_BERRY_SMOOTHIE.get());
            event.accept(BetterBerriesItems.MALOBERRY_SMOOTHIE.get());
            event.accept(BetterBerriesItems.RASPBERRY_SMOOTHIE.get());
            event.accept(BetterBerriesItems.SWEET_BERRY_SMOOTHIE.get());

            event.accept(BetterBerriesItems.BERRY_MEDLEY.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
