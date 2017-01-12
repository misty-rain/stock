package com.mistyrain.stock.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.mistyrain.stock.ui.main.MainActivity;
import com.mistyrain.stock.R;
import com.mistyrain.stock.widget.SplashView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Splash extends AppCompatActivity implements SplashView{


    @BindView(R.id.splash_image)
    ImageView mSplashImage;

    @BindView(R.id.splash_version_name)
    TextView mVersionName;

    @BindView(R.id.splash_copyright)
    TextView mCopyright;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     /*set it to be no title*/
        getSupportActionBar().hide();
       /*set it to be full screen*/
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                  WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        initializeViews("v.0.0.1","@Mistyrain",0);

        Animation animation = getBackgroundImageAnimation(this);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                navigateToHomePage();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        animateBackgroundImage(animation);
    }



    public Animation getBackgroundImageAnimation(Context context) {
        return AnimationUtils.loadAnimation(context, R.anim.splash);
    }

    @Override
    public void animateBackgroundImage(Animation animation) {
        mSplashImage.startAnimation(animation);
    }

    @Override
    public void initializeViews(String versionName, String copyright, int backgroundResId) {

        mCopyright.setText(copyright);
        mVersionName.setText(versionName);
        //mSplashImage.setImageResource(backgroundResId);
    }

    @Override
    public void initializeUmengConfig() {

    }

    @Override
    public void navigateToHomePage() {
        Intent intent = new Intent(Splash.this,MainActivity.class);
        startActivity(intent);
        finish();

    }

}
