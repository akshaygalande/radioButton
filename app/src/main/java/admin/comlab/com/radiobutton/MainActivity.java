package admin.comlab.com.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void click(View view) {

        boolean checked=((RadioButton)view).isChecked();

        switch (view.getId()){
            case R.id.cricket:
                if(checked) {
                    Toast.makeText(this, "Cricket is hobby", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.web:
                if(checked) {
                    Toast.makeText(this, "Building webpages is hobby", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.trek:
                if(checked) {
                    Toast.makeText(this, "Trekking is hobby", Toast.LENGTH_LONG).show();
                }
                break;

        }
    }
}
