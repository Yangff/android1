package com.fuck.shit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSort = (Button) findViewById(R.id.button1);
        TextView sortInput = (TextView) findViewById(R.id.textView);

        btnSort.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                String[] orgStrings = sortInput.getText().toString().split(" ").
				int[] intArray = new int[orgStrings.length];
				for (int i = 0; i < orgStrings.length; i++) {
					intArray[i] = Integer.parseInt(orgStrings[i]);
				}
				Arrays.sort(intArray);
				String finalString = "";

				for (int i = 0; i < orgStrings.length; i++) {
					finalString = finalString + Integer.toString(intArray[i]);
				}
				sortInput.setText(finalString);
             }
         });
    }
}
