
import java.util.ArrayList;
import java.util.List;

class SocialMediaAccount {
    private List<Follower> followers = new ArrayList<>();

    public void follow(Follower follower) {
        followers.add(follower);
    }

    public void unfollow(Follower follower) {
        followers.remove(follower);
    }

    public void notifyFollowers(String message) {
        for (Follower follower : followers) {
            follower.update(message);
        }
    }
}


class Follower {
    public void update(String message) {
        System.out.println("Follower received: " + message);
    }
}


public class Observer_Pattern {
    public static void main(String[] args) {
        SocialMediaAccount account = new SocialMediaAccount();
        Follower follower1 = new Follower();
        Follower follower2 = new Follower();

        account.follow(follower1);
        account.follow(follower2);
        account.notifyFollowers("New post!");
    }
}
