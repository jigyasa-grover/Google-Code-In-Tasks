package MovieTweetsRetrieval;

import java.util.List;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class MovieTweetsRetrieval {

    @FXML
    private Label title;

    @FXML
    private TextArea out;

    @FXML
    void onSubmit(ActionEvent event) {
        out.setText("");
        ConfigurationBuilder cb = new ConfigurationBuilder();
       cb.setDebugEnabled(true)
               .setOAuthConsumerKey("ovrORamOcS7GGiAWMYtbZnOgk")
               .setOAuthConsumerSecret("nm60VicPhD8xicYRKJQnlMHAlSouEGLL1VTH9hX1ISaOPaOsyo")
               .setOAuthAccessToken("1534367042-cxI8xnIA3JdejI0LCz2UPpzFkwMmF21Ixz7WDxc")
               .setOAuthAccessTokenSecret("iKIsWHtWfYtgWp0pFEbUDi8i0NXGzc7b5VmvmYjYSU5zZ");
       
       TwitterFactory tf = new TwitterFactory(cb.build());

    Twitter twitter = tf.getInstance();
    Twitter twitter1 = new TwitterFactory().getInstance();

    List<Status> statusList = null;

   try {
       int cont = 0;
            Query query = new Query("007 Spectre");
            query.setCount(100);
            QueryResult result;
            result = twitter.search(query);
            List<Status> tweets = result.getTweets();
            for (Status tweet : tweets) {
                cont++;
                out.setText("@" + tweet.getUser().getScreenName() + " - " + tweet.getText()+"\n"+ out.getText());
                
            }
            System.out.println("Number of tweets: "+cont);
            
            //System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }      
    }

}
