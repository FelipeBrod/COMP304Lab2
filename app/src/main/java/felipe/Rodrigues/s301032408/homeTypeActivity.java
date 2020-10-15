package felipe.Rodrigues.s301032408;
//Felipe Rodrigues 301032408
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homeTypeActivity extends AppCompatActivity {

    private Button toSelectedScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_type);

        /*toSelectedScreen = findViewById(R.id.findHome);

        toSelectedScreen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent  = new Intent(getApplicationContext(), rodriguesActivitySelection.class);
                startActivity(intent);
            }
        });*/
    }
}