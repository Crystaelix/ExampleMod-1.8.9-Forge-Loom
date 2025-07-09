package com.example.examplemod;

import java.util.ArrayList;
import java.util.List;

import org.spongepowered.asm.mixin.Mixins;

import net.minecraftforge.fml.common.Loader;
import zone.rong.mixinbooter.ILateMixinLoader;
import zone.rong.mixinbooter.MixinLoader;

@MixinLoader
public class ExampleLateMixinLoader /*implements ILateMixinLoader*/ {

	public ExampleLateMixinLoader() {
		if(Loader.isModLoaded("JEI")) {
			Mixins.addConfiguration("examplemod.mixins.jei.json");
		}
	}

	/*@Override
	public List<String> getMixinConfigs() {
		List<String> mixinConfigs = new ArrayList<>();
		if(Loader.isModLoaded("JEI")) {
			mixinConfigs.add("examplemod.mixins.jei.json");
		}
		return mixinConfigs;
	}*/
}
