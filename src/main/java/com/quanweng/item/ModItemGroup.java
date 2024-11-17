package com.quanweng.item;

import com.quanweng.NailongToSugar;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup NailongToSugarGroup = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NailongToSugar.MOD_ID,"nailongtosugargroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.nailongtosugargroup"))
                    .icon(()-> new ItemStack(ModItems.Nailong)).entries((displayContext, entries) -> {
                        entries.add(ModItems.Nailong);
                        entries.add(ModItems.CannedYellowPeaches);
                        entries.add(ModItems.YellowPeach);
                    }).build());
    /**
     * 物品栏初始化
     */
    public static void registerModItemGroup(){

    }
}
