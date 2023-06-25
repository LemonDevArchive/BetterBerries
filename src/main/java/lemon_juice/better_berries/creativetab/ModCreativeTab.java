package lemon_juice.better_berries.creativetab;

import lemon_juice.better_berries.BetterBerries;
import lemon_juice.better_berries.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BetterBerries.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BETTER_BERRIES_TAB = CREATIVE_MODE_TABS.register("better_berries", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.better_berries"))
            .icon(() -> new ItemStack(ModItems.BERRY_MEDLEY.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BETTER_BERRIES_TAB.get()) {
            event.accept(ModItems.BLACKBERRIES.get());
            event.accept(ModItems.BLUEBERRIES.get());
            event.accept(ModItems.MALOBERRIES.get());
            event.accept(ModItems.RASPBERRIES.get());

            event.accept(ModItems.BERRY_MEDLEY.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
