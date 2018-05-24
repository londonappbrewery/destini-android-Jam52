package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here

    TextView mStoryText;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        final TextView mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        final Button mButtonTop = (Button) findViewById(R.id.buttonTop);
        final Button mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mStoryIndex = 1;
        mStoryTextView.setText(R.string.T1_Story);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1 || mStoryIndex == 3){
                    mStoryTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 2;
                } else  if(mStoryIndex == 2) {
                        mStoryTextView.setText(R.string.T6_End);
                        mButtonTop.setText(R.string.Finish);
                        mButtonBottom.setText(R.string.Start_Again);
                        mStoryIndex = 4;
                }
                else {
                    finish();
                }
            }
        });


        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1){
                    mStoryTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 3;
                } else  if(mStoryIndex == 2) {
                    mStoryTextView.setText(R.string.T5_End);
                    mButtonTop.setText(R.string.Finish);
                    mButtonBottom.setText(R.string.Start_Again);
                    mStoryIndex = 4;
                } else  if(mStoryIndex == 3) {
                    mStoryTextView.setText(R.string.T4_End);
                    mButtonTop.setText(R.string.Finish);
                    mButtonBottom.setText(R.string.Start_Again);
                    mStoryIndex = 4;
                }
                else {
                    mStoryTextView.setText(R.string.T1_Story);
                    mButtonTop.setText(R.string.T1_Ans1);
                    mButtonBottom.setText(R.string.T1_Ans2);
                    mStoryIndex = 1;

                }
            }


        });
    }

}
