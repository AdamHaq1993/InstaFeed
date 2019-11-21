package nc.prog1197.InstaFeed;


import android.app.Activity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends Activity {

    //Splash
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.scale_down);
        final ImageView title = (ImageView) findViewById(R.id.title);

        title.startAnimation(animation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(SplashActivity.this, CatchActivity.class));
                finish();

            }
        }, 6000);
    }
}
