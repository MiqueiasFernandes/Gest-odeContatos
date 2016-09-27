package br.com.miqueiasfernandes.gestodecontatos;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.ndk.CrashlyticsNdk;
import io.fabric.sdk.android.Fabric;


public class MainActivity extends AppCompatActivity {
    private FloatingActionButton fabAddContact;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics(), new CrashlyticsNdk());
        setContentView(R.layout.activity_main);
        Toolbar myToolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        this.fabAddContact = (FloatingActionButton) findViewById(R.id.fab_add_contact);
        this.fabAddContact.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                goToAddContactActivity();
            }
        });
    }

    private void goToAddContactActivity(){
        Intent i = new Intent(this, AddContactActivity.class);
        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu. menu_main , menu);
        return super.onCreateOptionsMenu(menu);
    }

}
