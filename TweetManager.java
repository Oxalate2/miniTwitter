import java.util.Stack;

public class TweetManager {
    private static final TweetManager instance = new TweetManager();
    private static Stack<String> newsFeed;
    private static Stack<Tweet> tweets;

    public TweetManager() {
        this.tweets = new Stack<>();
        this.newsFeed = new Stack<>();

    }

    public static TweetManager getInstance() {
        return instance;
    }

    public Stack<String> getTweets() {
        return newsFeed;
    }

    public void addTweet(Tweet input) {
        tweets.add(input);
        String tweetInput = input.toString();
        newsFeed.add(tweetInput);
    }

    public static int getTweetsTotal() {
        return tweets.size();
    }
}
