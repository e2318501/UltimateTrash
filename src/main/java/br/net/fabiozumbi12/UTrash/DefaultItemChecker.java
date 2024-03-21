package br.net.fabiozumbi12.UTrash;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class DefaultItemChecker implements ItemChecker {
    @Override
    public boolean isSpecialItem(@NotNull ItemStack item) {
        return false;
    }
}
