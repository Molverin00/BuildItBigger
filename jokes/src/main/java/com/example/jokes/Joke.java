package com.example.jokes;

import java.util.Random;

public class Joke {

    private final static String[] JOKES_LIST = {

            "How do you make a tissue dance? You put a little boogie in it.",
            "Why did the policeman smell bad? He was on duty.",
            "Why does Snoop Dogg carry an umbrella? FO DRIZZLE!",
            "Why can’t you hear a pterodactyl in the bathroom? Because it has a silent pee.",
            "What did the Zen Buddist say to the hotdog vendor? Make me one with everything.",
            "What kind of bees make milk instead of honey? Boobies.",
            "Horse walks into a bar. Bartender says, “Why the long face?”",
            "A mushroom walks into a bar. The bartender says, “Hey, get out of here! We don’t serve mushrooms here”. Mushroom says, “why not? I’m a fungai!”",
            "I never make mistakes…I thought I did once; but I was wrong.",
            "What’s Beethoven’s favorite fruit?…Ba-na-na-naaa!",
            "What did the little fish say when he swam into a wall? DAM!",
            "Knock knock. Who’s there? Smell mop. (finish this joke in your head)",
            "Where does a sheep go for a haircut? To the baaaaa baaaaa shop!",
            "What does a nosey pepper do? Gets jalapeno business!",
            "What do you call a deer with no eyes? No eye deer.",
            "What’s the last thing that goes thru a bug’s mind as he hits the windshield? His butt.",
            "Knock knock- who’s there? Dwayne. Dwayne who? Dwayne the tub I’m dwounding!",
            "The past, present and future walk into a bar. It was tense.",
            "What goes “ha ha thump”? A man laughing his head off.",
            "What did the grape say when he was pinched? Nothing, he gave a little wine."

    };


    public Joke() {}


    public static String getJoke() {
        int randomIdex = new Random().nextInt(JOKES_LIST.length);
        return JOKES_LIST[randomIdex];
    }
}
