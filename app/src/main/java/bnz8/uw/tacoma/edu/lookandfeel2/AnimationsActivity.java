package bnz8.uw.tacoma.edu.lookandfeel2;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AnimationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);
    }


    public void animateSpin(View view){
        View v = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.rotate_and_spin);
        set.setTarget(v);
        set.start();
    }

    public void animateMove(View view){

        View v = findViewById(R.id.animate_me);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this,
                R.animator.move);
        set.setTarget(v);
        set.start();
    }
}
