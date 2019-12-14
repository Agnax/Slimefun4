/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.thebusybiscuit.slimefun4.Lists;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 *
 * @author Agnax
 */
public class InsanityItem extends ItemStack {
    
    public InsanityItem(Material item, String name, int model) {
        super(new ItemStack(item));
        ItemMeta im = getItemMeta();
        im.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        im.setCustomModelData(model);
        setItemMeta(im);
    }
    public InsanityItem(Material item, String name,int model, String... lore) {
        super(new ItemStack(item));
        ItemMeta im = getItemMeta();
        im.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        List<String> lines = new ArrayList<String>();
        for (String line: lore) {
            lines.add(ChatColor.translateAlternateColorCodes('&', line));
        }
        im.setLore(lines);
            im.setCustomModelData(model);
        setItemMeta(im);
    }
}
