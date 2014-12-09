package com.qihoo.accessibilitydemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.provider.Settings;

public class MainActivity extends Activity {
    
    /** An intent for launching the system settings. */
    private static final Intent sSettingsIntent =
        new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(sSettingsIntent);
            }
        });
    }

}
