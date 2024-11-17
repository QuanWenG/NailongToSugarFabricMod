package com.quanweng.item;

import com.quanweng.NailongToSugar;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item Nailong = registerItems("nailong",new Item(new FabricItemSettings()));
    public static final Item YellowPeach = registerItems("yellowpeach",new Item(new FabricItemSettings().food(ModFoodComponents.YellowPeach)));
    public static final Item CannedYellowPeaches = registerItems("cannedyellowpeaches",new Item(new FabricItemSettings().food(ModFoodComponents.CannedYellowPeaches)));

    /**
     * @param name
     * @param item
     * @return
     * 注册方法
     */
    private static Item registerItems(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(NailongToSugar.MOD_ID,name),item);//添加到物品栏
    }
    /**
     * 初始化方法
     */
    public static void registerModItems(){

    }
}
