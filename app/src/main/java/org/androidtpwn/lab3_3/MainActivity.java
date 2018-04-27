package org.androidtpwn.lab3_3;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button btn_frag1;
    public Button btn_frag2;

    Fragment1 fragment1;
    Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        setListener();
    }

    public void init(){
        btn_frag1=(Button)findViewById(R.id.btn_frag1);
        btn_frag2=(Button)findViewById(R.id.btn_frag2);


        fragment1=new Fragment1();
        fragment2=new Fragment2();
    }

    public void setListener(){

        btn_frag1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_for_fragment,fragment1).commit();
            }
        });

        btn_frag2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout_for_fragment,fragment2).commit();
            }
        });

    }

}
