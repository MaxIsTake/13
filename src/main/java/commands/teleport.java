package commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class teleport implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

     if (sender instanceof Player){

         Player player = (Player) sender;

         if (args.length == 0){
             player.sendMessage(ChatColor.RED + "You need to enter some arguements.");
             player.sendMessage(ChatColor.YELLOW + "To teleport yourself: /customtp <otherplayer>");
             player.sendMessage(ChatColor.YELLOW + "To teleport others: /customtp <player> <otherplayer>");
         } else if (args.lenght == 1){
             Player target = Bukket.getPlayer(args[0]);

          Player.teleport(target.getLocation());
         } else if (argss.lenght == 2){
             //first player
             Player playerToSend = Bukket.getPlayer(args[0]);
             Player target = Bukket.getPlayer(args[1]);
             playerToSend.teleport(target.getLocation());
         }


     }





        return false;
    }
}
