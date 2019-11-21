package nc.prog1197.InstaFeed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class reviewItem extends Activity {

public Button button;
    private String mName;
    private String mlocation_name;
    private String mbody;
    private Float mstars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //button for things
        button = findViewById(R.id.message_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(reviewItem.this, DetailsActivity.class);
                startActivity(intent);
            }
        });
    }

    public reviewItem(String location_name,  Float stars, String body) {

        mlocation_name = location_name;
        mbody = body;
        mstars = stars;

    }

    public String getName() {
        return mName;
    }

    public String getLocation_name() {
        return mlocation_name;
    }
    public String getBody() {
        return mbody;
    }
    public Float getStars() {
        return mstars;
    }
    private static int lastContactId = 0;



    public static ArrayList<reviewItem> createContactsList(int numContacts) {
        ArrayList<reviewItem> contacts = new ArrayList<reviewItem>();

        for (int i = 1; i <= numContacts; i++) {
            //edit items here
            contacts.add(new reviewItem("Location " + ++lastContactId,  3f, "Lorem ipsum dolor sit amet, consectetur adipiscing elit...." ));

        }

        return contacts;
    }



}
