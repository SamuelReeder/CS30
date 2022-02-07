/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewprojectchatbot;

import java.util.*;

/**
 *
 * @author samue
 */
public class ReviewProjectChatbot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ChatRoom aCivilDiscussion = new ChatRoom();
        aCivilDiscussion.chat();

//        ReviewProjectChatbot.talk();
    }

    public static void talk() {
        Chatbot bot = new Chatbot("Bot");

        System.out.println(bot.getPrompt());
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();

        while (!statement.equals("bye")) {
            System.out.println(bot.reply(statement));
            statement = in.nextLine();
        }
    }
}
