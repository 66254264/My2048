package com.example.my2048;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private static  MainActivity mainActivity = null;
    private  int score =0;
    private Button button;
    private GameView gameView;



    public static MainActivity getMainActivity() {
        return mainActivity;
    }
    public MainActivity(){
        mainActivity=this;

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.score);
        gameView = (GameView) findViewById(R.id.gameview);

        button=findViewById(R.id.but);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                gameView.startGame();
            }
        });

    }
    public void clearScore(){
        score = 0;
        showScore();
    }

    public void showScore(){
        textView.setText(score+"");
    }

    public void addScore(int s){
        score+=s;
        showScore();
    }




}
