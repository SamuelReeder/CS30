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
public class ChatRoom {

    public static Chatbot angela = new Chatbot("Angela");
    public static Chatbot eric = new Chatbot("Eric");

    public static void chat() {
        Scanner in = new Scanner(System.in);
        System.out.println("Hi");
        String statement = in.nextLine();

        String angStr = angela.reply("Hi");

        System.out.println(angStr);

        while (true) {
            statement = in.nextLine();
            if (statement.equals("bye")) {
                return;
            }

            String ericStr = eric.reply(angStr);
            System.out.println(ericStr);

            statement = in.nextLine();
            if (statement.equals("bye")) {
                return;
            }

            angStr = angela.reply(ericStr);
            System.out.println(angStr);
        }
    }
}
