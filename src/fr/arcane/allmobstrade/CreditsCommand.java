package fr.arcane.allmobstrade;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CreditsCommand implements CommandExecutor {

	@Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("credit")) {
            sender.sendMessage("�l�3[�6AllMobsTrade�3]�r �eCredits : Arcane pour le developpement du plugin et Alextogy pour l'id�e du plugin");
        }
        return false;
    }

}
