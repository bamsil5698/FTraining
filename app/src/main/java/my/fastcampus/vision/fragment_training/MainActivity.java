package my.fastcampus.vision.fragment_training;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    FragmentManager fragmentManager;
    public static final String Bundle_key = "bundle_key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragment = new Fragment_one();
        Bundle bundle = new Bundle();
        bundle.putInt(Bundle_key,10);
        fragment.setArguments(bundle);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container,new Fragment_two());
            fragmentTransaction.commit();
        }
      });
    fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.container,fragment);
        fragmentTransaction.commit();


    }




}
