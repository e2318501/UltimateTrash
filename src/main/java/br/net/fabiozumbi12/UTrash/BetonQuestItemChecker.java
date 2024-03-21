package br.net.fabiozumbi12.UTrash;

import org.betonquest.betonquest.utils.Utils;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class BetonQuestItemChecker implements ItemChecker {
    @Override
    public boolean isSpecialItem(@NotNull ItemStack item) {
        return Utils.isQuestItem(item);
    }
}
