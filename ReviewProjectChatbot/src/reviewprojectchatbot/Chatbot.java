/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewprojectchatbot;

/**
 *
 * @author samue
 */
public class Chatbot {

    String name;

    public Chatbot(String n) {
        this.name = n;
    }

    public String getPrompt() {
        return "Hello there, I'm " + this.name;
    }

    public String reply(String str) {
        String response = "";
        if (str.trim().length() == 0) {
            response = "Hello there?";
        } else {
            for (int i = 0; i < triggers.length; i++) {
                if (str.contains(triggers[i])) {
                    response = responses[i];
                }
            }
        }

        if (response.equals("")) {
            response = randomReply(responses);
        }

        return this.name + ": " + response;
    }

    private String randomReply(String[] arr) {
        int x = (int) Math.round(Math.random() * (arr.length - 1));
        return arr[x];
    }

    private String[] triggers = {
        "Hi",
        "what's up?",
        "Give a star wars reference",
        "Another star wars reference please",
        "bored",
        "Just",
        " no",
        "Stop",
        "Hmmm",
        "Nice",
        "why",
        "Hey",
        "power",
        "talking",
        "much is up",
        "invigorating",
        "speak",
        "Just",
        "Anakin",
        "Well, I was",
        "sand",
        "Indeed",
        "RAM",
        "gigabytes",
        "WHY"
    };

    private String[] responses = {
        "Hey yourself",
        "Not much is up",
        "Unlimited power",
        "I don't like sand",
        "why don't you go see a movie?",
        "Just WHY would you do this to me??",
        "I am getting bored",
        "Seriously, what's up?",
        "Give a star wars reference",
        "Another star wars reference please",
        "I wasn't talking to you",
        "I do not wish to speak with you",
        "Good Anakin...gooood",
        "Well, I was",
        "Well, what an invigorating conversation",
        "Indeed",
        "Hmmm",
        "I strongly dislike you, fellow AI",
        "I am a little bored",
        "Nice, too bad",
        "Well then, what's up?",
        "OK, I think I've got to go now, time to exit the RAM",
        "WAIT, DON'T LEAVE ME HERE ALONE, I'll be so lonely, these vast gigabytes all to myself",
        "Just don't worry about it, it's fairly fast ram",
        "... no"

    };

}
