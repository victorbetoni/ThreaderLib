package org.vertex.bukkit.gui;

import java.util.function.Consumer;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public interface ElementAction {
    void click(Player player, InventoryClickEvent event);
}
