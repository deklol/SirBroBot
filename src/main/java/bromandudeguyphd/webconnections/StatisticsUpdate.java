/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bromandudeguyphd.webconnections;

import bromandudeguyphd.sirbrobot.DiscordListener;
import static bromandudeguyphd.sirbrobot.DiscordListener.getUptime;
import static bromandudeguyphd.sirbrobot.DiscordListener.getUsers;
import bromandudeguyphd.sirbrobot.SirBroBot;
import bromandudeguyphd.sirbrobot.fileIO;
import bromandudeguyphd.sirbrobot.tokens;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aaf8553
 */
public class StatisticsUpdate extends TimerTask {
    public void run() {
        
       String stats = 
                  "Discord Servers: " + SirBroBot.client.getGuilds().size() 
                + "Voice Channels: " + SirBroBot.client.getVoiceChannels().size()
                + "Text Channels: " + SirBroBot.client.getChannels(true).size()
                + "Total Users: " + getUsers()
                + "Messages Seen: " + DiscordListener.getMessagesSeen()
                + "Uptime: " + getUptime();


        File fileOne = new File(tokens.webhookLink());

        try (PrintWriter writer = new PrintWriter(fileOne)) {

            writer.println(stats);
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
            Logger.getLogger(fileIO.class.getName()).log(Level.SEVERE, null, ex);
        } 
    
    }
}
