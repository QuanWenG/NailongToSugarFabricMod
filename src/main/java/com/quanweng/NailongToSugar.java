package com.quanweng;

import com.quanweng.item.ModItemGroup;
import com.quanweng.item.ModItems;
import com.quanweng.lootTable.ModLootTableModifies;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NailongToSugar implements ModInitializer {
	public static final String MOD_ID = "nailongtosugar";


	@Override
	public void onInitialize() {
		ModItems.registerModItems();//模组加载时，初始化方法，初始物品
		ModItemGroup.registerModItemGroup();//初始化物品栏
		ModLootTableModifies.modifyLootTables();//初始化更改原版掉落物
	}
}