import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class User {
    private String userID;
    private List<String> followers;
    private List<String> followings;
    private TweetManager newsFeed;

    public User(String userID) {
        this.userID = userID;
        this.followers = new ArrayList<>();
        this.followings = new ArrayList<>();
    }

    public String getUserID() {
        return userID;
    }

    public List<String> getFollowers() {
        return followers;
    }

    public List<String> getFollowings() {
        return followings;
    }

    public boolean isGroup() {
        return false;
    }

    public Stack<String> getNewsFeed() {
        return newsFeed.getTweets();
    }

    public void addFollower(String followerID) {
        followers.add(followerID);
    }

    public void addFollowing(String followingID) {

    }

    public void postTweet(String tweet) {
        // newsFeed.add(tweet);
        updateFollowers(tweet);
    }

    private void updateFollowers(String tweet) {
        // Notify followers about new tweet
        // Use observer pattern to implement
    }
}
