package br.com.miqueiasfernandes.gestodecontatos;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by mfernandes on 30/08/16.
 */
public class AddContactActivity extends AppCompatActivity{

    private Spinner spinnerTelTypes, spinnerEmailelTypes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_contact);
        this.spinnerTelTypes = (Spinner) findViewById(R.id.add_contact_tipo_telefone);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.telefone_types,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spinnerTelTypes.setAdapter(adapter);

        this.spinnerEmailelTypes = (Spinner) findViewById(R.id.add_contact_tipo_email);
        adapter = ArrayAdapter.createFromResource(
                this,
                R.array.email_types,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spinnerEmailelTypes.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu. menu_add_contact , menu);
        return super.onCreateOptionsMenu(menu);
    }
}