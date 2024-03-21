package br.net.fabiozumbi12.UTrash;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public interface ItemChecker {
    boolean isSpecialItem(@NotNull ItemStack item);
}
