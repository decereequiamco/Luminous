package com.luminous.deceree.luminous;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView image = (ImageView) findViewById(R.id.imageView);
        final ToggleButton togBtn = (ToggleButton) findViewById(R.id.toggleButton);


        assert togBtn != null;
        togBtn.setOnClickListener(
                new ToggleButton.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (togBtn.isChecked()) {
                            image.setImageResource(R.drawable.off);
                        } else
                            image.setImageResource(R.drawable.on);

                    }
                }
        );
    }
}

