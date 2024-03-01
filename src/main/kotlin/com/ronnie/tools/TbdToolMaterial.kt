package com.ronnie.tools

import net.minecraft.item.Items
import net.minecraft.item.ToolMaterial
import net.minecraft.recipe.Ingredient

class TbdToolMaterial: ToolMaterial {
    override fun getDurability(): Int {
        return 500
    }

    override fun getMiningSpeedMultiplier(): Float {
        return 2.0f
    }

    override fun getAttackDamage(): Float {
        return 3.0f
    }

    override fun getMiningLevel(): Int {
        return 1
    }

    override fun getEnchantability(): Int {
        return 25
    }

    override fun getRepairIngredient(): Ingredient? {
        return Ingredient.ofItems(Items.CRYING_OBSIDIAN)
    }
}

