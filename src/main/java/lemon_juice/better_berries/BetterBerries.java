package lemon_juice.better_berries;

import lemon_juice.better_berries.block.BetterBerriesBlocks;
import lemon_juice.better_berries.creativetab.BetterBerriesCreativeTab;
import lemon_juice.better_berries.item.BetterBerriesItems;
import lemon_juice.better_berries.util.BetterBerriesCompostables;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(BetterBerries.MOD_ID)
public class BetterBerries {
    public static final String MOD_ID = "better_berries";

    public BetterBerries(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);

        // Register Items & Blocks
        BetterBerriesItems.register(modEventBus);
        BetterBerriesBlocks.register(modEventBus);

        // Register Creative Tab
        BetterBerriesCreativeTab.register(modEventBus);
        modEventBus.addListener(BetterBerriesCreativeTab::registerTabs);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            //Register Compostables
            BetterBerriesCompostables.setup(event);
        });
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
