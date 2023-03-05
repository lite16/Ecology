package gb.lite.ecology.init;

import gb.lite.ecology.EcologyMain;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static gb.lite.ecology.init.BlockInit.HYDROPONIC_BLOCK;


public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EcologyMain.MODID);

    public static final RegistryObject<Item> GLOWSPORES = ITEMS.register("glowing_spores",
            () -> new Item(new Item.Properties().tab(ModCreativeTab.instance)));
    public static class ModCreativeTab extends CreativeModeTab {
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(GLOWSPORES.get());
        }
        public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length, "ecology_tab");
    }
}
