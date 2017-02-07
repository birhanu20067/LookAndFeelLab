package bnz8.uw.tacoma.edu.lookandfeel2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StylesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_styles);
    }


    public void submitAction(View view) {
        Intent intent = new Intent(StylesActivity.this, AnimationsActivity.class);
        startActivity(intent);
    }
}
