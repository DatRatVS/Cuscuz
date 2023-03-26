package datrat.cuscuz;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(Cuscuz.MODID)
public class Cuscuz {

    public static final String MODID = "cuscuz";
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> CUSCUZ = ITEMS.register("cuscuz", () -> new Item(new Item.Properties().food(Food.CUSCUZ)));

    public static class Food {
        public static final FoodProperties CUSCUZ = new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).build();
    }

    public Cuscuz() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ITEMS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
