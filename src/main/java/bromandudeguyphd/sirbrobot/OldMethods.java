/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bromandudeguyphd.sirbrobot;

/**
 *
 * @author aaf8553
 */
public class OldMethods {
    
    //OLD IMPLEMENTATION OF SIRBROBOT RESPONSES
        
//            //Greeting SirBroBot
//            if (message.getContent().toUpperCase().contains("SIRBROBOT")) {
//                String mention = message.getAuthor().mention();
//            switch (message.getContent().toUpperCase()) {
//                case "HELLO SIRBROBOT":
//                    switch (message.getAuthor().getName()) {
//                        //Custom Message for ME
//                        case "BroManDudeGuyPhD":
//
//                            messageBuilder.withContent(String.format("Hello maker " + mention));
//                            break;
//                            //Custom Message for Jolee
//                        case "Jaurielb":
//                            messageBuilder.withContent(String.format("Good Day Madame "));
//                            break;
//                            //Custom Message for Dane
//                        case "Dane":
//                            messageBuilder.withContent(String.format("I Dub thee, Dane, PHP and Javascript master of the Universe "));
//                            break;
//                            //Custome Message for Nick
//                        case "NickPlusPlus":
//                            messageBuilder.withContent(String.format("#TeamLG@MLG2016 "));
//                            
//                            //General User Response
//                            break;
//                        default:
//                            messageBuilder.withContent(String.format("Hello " + mention));
//                            break;
//                    }
//                    messageBuilder.build();
//                    usageCounter++;
//                    break;
//                    
//                case "DANCE SIRBROBOT":
//                    //messageBuilderGifs.withContent(String.format("http://cdn.makeagif.com/media/5-12-2015/xrCw-V.gif"));
//                    messageBuilderGifs.withChannel((IChannel) event.getMessage().getChannel().sendFile(dance));
//                    messageBuilderGifs.build();
//                    usageCounter++;
//                    break;
//                    
//                case "JOUST SIRBROBOT":
//                    messageBuilderGifs.withChannel((IChannel) event.getMessage().getChannel().sendFile(joust2));
//                    messageBuilderGifs.build();
//                    usageCounter++;
//                    break;
//                    
//                case "WAKE UP SIRBROBOT":
//                    messageBuilderGifs.withChannel((IChannel) event.getMessage().getChannel().sendFile(wakeup));
//                    messageBuilderGifs.build();
//                    usageCounter++;
//                    break;
//                    
//                case "INSULT SIRBROBOT":
//                    messageBuilderGifs.withChannel((IChannel) event.getMessage().getChannel().sendFile(insult));
//                    messageBuilderGifs.build();
//                    usageCounter++;
//                    
//                case "TAUNT SIRBROBOT":
//                    messageBuilderGifs.withChannel((IChannel) event.getMessage().getChannel().sendFile(taunt));
//                    messageBuilderGifs.build();
//                    usageCounter++;
//                    
//                case "WHO IS THE FAIREST OF THEM ALL SIRBROBOT":
//                    messageBuilderGifs.withChannel((IChannel) event.getMessage().getChannel().sendFile(fairest));
//                    
//                
//                        
//                default:
//                    break;
//            }
//
//            }

//END OF OLD IMPLEMENTATION OF RESPONSE
    
    
    
    //WORD FILTER DISABLED FOR NOW
            //Word Filter (Implements list of words created above
            //deletes the recieved message if it is in the list
//        for(int i = 0; i < curseWords.size(); i++){
//        if(message.getContent().toUpperCase().contains(curseWords.get(i)) == true){
//            messageBuilder.withContent(String.format("Stop Cursing %s", message.getAuthor().getName()));
//            System.out.print(curseWords.size());
//            try {
//                messageBuilder.build();
//                message.delete();
//            } catch (MissingPermissionsException | HTTP429Exception | DiscordException ex) {
//                Logger.getLogger(MainListener.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//        }
//        }
    
      
    
//    @EventSubscriber
//    public void handle(InviteReceivedEvent event) throws IOException {
//        IInvite invite = event.getInvite();
//
//        try {
//            Invite.InviteResponse response = invite.details();
//            event.getMessage().reply(String.format("you've invited me to join the %s server!", response.getGuildName()));
//            boolean inviteDeny = false;
//
//            for (int i = 0; i < sirbrobot.client.getGuilds().size(); i++) {
//                if (response.getGuildName().equals(sirbrobot.client.getGuilds().get(i).getName())) {
//                    event.getMessage().reply(String.format("I am already Knight of the %s server", response.getGuildName()));
//
//                    invite.delete();
//                    inviteDeny = true;
//                }
//
//            }
//
//            if (inviteDeny == false) {
//                invite.accept();
//
////                    DiscordClient.get().sendMessage(String.format("Hello, #%s and the \\\"%s\\\" guild! I was invited by %s!", 
////                                        response.getChannelName(), response.getGuildName(), event.getMessage().getAuthor()), 
////                                        response.getChannelID()); 
//                //event.getMessage().getGuild().getOwnerID();
//                System.out.print("SirBroBot invited to " + invite.details().getGuildName() + "at" + event.getMessage().getCreationDate().format(DateTimeFormatter.ISO_DATE_TIME));
//
//            }
//
//        } catch (DiscordException | HTTP429Exception | MissingPermissionsException e) {
//            e.printStackTrace();
//        }
//
//    }
    
}
