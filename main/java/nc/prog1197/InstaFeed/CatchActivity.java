package nc.prog1197.InstaFeed;
import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

//Meant to catch so you cant go back to splash page
public class CatchActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, LocationActivity.class );
        startActivity(intent);

    }
}
