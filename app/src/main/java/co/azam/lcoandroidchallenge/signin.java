package co.azam.lcoandroidchallenge;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class signin extends AppCompatActivity {
RelativeLayout animatortop,animatorbottom;
Button signup;
ImageView img;
Handler handler=new Handler();

Runnable runnable=new Runnable() {
    @Override
    public void run() {
        animatortop.setVisibility(View.VISIBLE);
        animatorbottom.setVisibility(View.VISIBLE);
    }
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        animatortop=(RelativeLayout)findViewById(R.id.animatortop);
        animatorbottom=(RelativeLayout)findViewById(R.id.animatorbottom);
        signup=(Button)findViewById(R.id.signup);
        handler.postDelayed(runnable,2000);
      img = (ImageView)findViewById(R.id.logo);
        img.setBackgroundResource(R.drawable.animate);
        AnimationDrawable fr=(AnimationDrawable)img.getBackground();
        fr.start();
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),signup.class);
                startActivity(intent);
            }
        });

    }
}
