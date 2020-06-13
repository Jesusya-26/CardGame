package shinobi.way.cardgame;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PlayingField1 extends Activity implements View.OnClickListener, View.OnTouchListener {

    Dialog cardinfo;
    Dialog battlefield;

    CardInfo cardInfo = new CardInfo();

    private long backPressedTime;
    long startTime;
    private Toast backToast;
    public int card1p1 = 0;
    public int card2p1 = 0;
    public int card3p1 = 0;
    public int card1p2 = 0;
    public int card2p2 = 0;
    public int card3p2 = 0;
    public int card1p3 = 0;
    public int card2p3 = 0;
    public int card3p3 = 0;
    public int countp1 = 0;
    public int countp2 = 0;
    public int countp3 = 0;
    public int countp4 = 0;
    public int countp5 = 0;
    public int countp6 = 0;
    public int countf1 = 0;
    public int countf2 = 0;
    public int countph = 0;
    public int count = 0;
    public int count1 = 0;
    public int sumstep1 = 0;
    public int battlepoint1 = 0;
    public int sumcards1 = 6;
    public int sumstep2 = 0;
    public int battlepoint2 = 0;
    public int sumcards2 = 6;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playing_field);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final ImageView imgcard1 = findViewById(R.id.imgcard1);
        imgcard1.setImageResource(R.drawable.shu);
        final ImageView imgcard2 = findViewById(R.id.imgcard2);
        imgcard2.setImageResource(R.drawable.pashke);
        final ImageView imgcard3 = findViewById(R.id.imgcard3);
        imgcard3.setImageResource(R.drawable.akemi);
        final ImageView imgcard4 = findViewById(R.id.imgcard4);
        imgcard4.setImageResource(R.drawable.rike);
        final ImageView imgcard5 = findViewById(R.id.imgcard5);
        imgcard5.setImageResource(R.drawable.kentaru);
        final ImageView imgcard6 = findViewById(R.id.imgcard6);
        imgcard6.setImageResource(R.drawable.hiruko);
        final ImageView imgcard7 = findViewById(R.id.imgcard7);
        imgcard7.setImageResource(R.drawable.keiko);
        final ImageView imgcard8 = findViewById(R.id.imgcard8);
        imgcard8.setImageResource(R.drawable.akito);
        final ImageView imgcard9 = findViewById(R.id.imgcard9);
        imgcard9.setImageResource(R.drawable.ryu);
        final ImageView imgcard10 = findViewById(R.id.imgcard10);
        imgcard10.setImageResource(R.drawable.kitsu);
        final ImageView imgcard11 = findViewById(R.id.imgcard11);
        imgcard11.setImageResource(R.drawable.benkei);
        final ImageView imgcard12 = findViewById(R.id.imgcard12);
        imgcard12.setImageResource(R.drawable.teeru);
        final TextView p1 = findViewById(R.id.p1);
        final TextView p2 = findViewById(R.id.p2);
        final TextView p3 = findViewById(R.id.p3);
        final TextView p4 = findViewById(R.id.p4);
        final TextView p5 = findViewById(R.id.p5);
        final TextView p6 = findViewById(R.id.p6);
        final TextView f1 = findViewById(R.id.b1);
        final TextView f2 = findViewById(R.id.b2);
        final TextView ph = findViewById(R.id.ph);
        final TextView namecard1 = findViewById(R.id.namecard1);
        final TextView namecard2 = findViewById(R.id.namecard2);
        final TextView namecard3 = findViewById(R.id.namecard3);
        final TextView namecard4 = findViewById(R.id.namecard4);
        final TextView namecard5 = findViewById(R.id.namecard5);
        final TextView namecard6 = findViewById(R.id.namecard6);
        final TextView namecard7 = findViewById(R.id.namecard7);
        final TextView namecard8 = findViewById(R.id.namecard8);
        final TextView namecard9 = findViewById(R.id.namecard9);
        final TextView namecard10 = findViewById(R.id.namecard10);
        final TextView namecard11 = findViewById(R.id.namecard11);
        final TextView namecard12 = findViewById(R.id.namecard12);
        final ImageView p1card1 = findViewById(R.id.p1card1);
        final ImageView p1card2 = findViewById(R.id.p1card2);
        final ImageView p1card3 = findViewById(R.id.p1card3);
        final ImageView p1card4 = findViewById(R.id.p1card4);
        final ImageView p1card5 = findViewById(R.id.p1card5);
        final ImageView p1card6 = findViewById(R.id.p1card6);
        final ImageView p2card1 = findViewById(R.id.p2card1);
        final ImageView p2card2 = findViewById(R.id.p2card2);
        final ImageView p2card3 = findViewById(R.id.p2card3);
        final ImageView p2card4 = findViewById(R.id.p2card4);
        final ImageView p2card5 = findViewById(R.id.p2card5);
        final ImageView p2card6 = findViewById(R.id.p2card6);
        final ImageView p3card1 = findViewById(R.id.p3card1);
        final ImageView p3card2 = findViewById(R.id.p3card2);
        final ImageView p3card3 = findViewById(R.id.p3card3);
        final ImageView p3card4 = findViewById(R.id.p3card4);
        final ImageView p3card5 = findViewById(R.id.p3card5);
        final ImageView p3card6 = findViewById(R.id.p3card6);
        final ImageView p4card1 = findViewById(R.id.p4card1);
        final ImageView p4card2 = findViewById(R.id.p4card2);
        final ImageView p4card3 = findViewById(R.id.p4card3);
        final ImageView p4card4 = findViewById(R.id.p4card4);
        final ImageView p4card5 = findViewById(R.id.p4card5);
        final ImageView p4card6 = findViewById(R.id.p4card6);
        final ImageView p5card1 = findViewById(R.id.p5card1);
        final ImageView p5card2 = findViewById(R.id.p5card2);
        final ImageView p5card3 = findViewById(R.id.p5card3);
        final ImageView p5card4 = findViewById(R.id.p5card4);
        final ImageView p5card5 = findViewById(R.id.p5card5);
        final ImageView p5card6 = findViewById(R.id.p5card6);
        final ImageView p6card1 = findViewById(R.id.p6card1);
        final ImageView p6card2 = findViewById(R.id.p6card2);
        final ImageView p6card3 = findViewById(R.id.p6card3);
        final ImageView p6card4 = findViewById(R.id.p6card4);
        final ImageView p6card5 = findViewById(R.id.p6card5);
        final ImageView p6card6 = findViewById(R.id.p6card6);



        imgcard1.setOnTouchListener(this);
        imgcard2.setOnTouchListener(this);
        imgcard3.setOnTouchListener(this);
        imgcard4.setOnTouchListener(this);
        imgcard5.setOnTouchListener(this);
        imgcard6.setOnTouchListener(this);
        imgcard7.setOnTouchListener(this);
        imgcard8.setOnTouchListener(this);
        imgcard9.setOnTouchListener(this);
        imgcard10.setOnTouchListener(this);
        imgcard11.setOnTouchListener(this);
        imgcard12.setOnTouchListener(this);
        namecard1.setOnTouchListener(this);
        namecard2.setOnTouchListener(this);
        namecard3.setOnTouchListener(this);
        namecard4.setOnTouchListener(this);
        namecard5.setOnTouchListener(this);
        namecard6.setOnTouchListener(this);
        namecard7.setOnTouchListener(this);
        namecard8.setOnTouchListener(this);
        namecard9.setOnTouchListener(this);
        namecard10.setOnTouchListener(this);
        namecard11.setOnTouchListener(this);
        namecard12.setOnTouchListener(this);
        imgcard1.setOnClickListener(this);
        imgcard2.setOnClickListener(this);;
        imgcard3.setOnClickListener(this);
        imgcard4.setOnClickListener(this);
        imgcard5.setOnClickListener(this);
        imgcard6.setOnClickListener(this);
        imgcard7.setOnClickListener(this);
        imgcard8.setOnClickListener(this);
        imgcard9.setOnClickListener(this);;
        imgcard10.setOnClickListener(this);
        imgcard11.setOnClickListener(this);
        imgcard12.setOnClickListener(this);
        p1.setOnClickListener(this);
        p2.setOnClickListener(this);
        p3.setOnClickListener(this);
        p4.setOnClickListener(this);
        p5.setOnClickListener(this);
        p6.setOnClickListener(this);
        f1.setOnClickListener(this);
        f2.setOnClickListener(this);
        ph.setOnClickListener(this);

        final Button endturn1 = findViewById(R.id.endturn1);
        final TextView sumturn1 = findViewById(R.id.sumturn1);
        final TextView sumcard1 = findViewById(R.id.sumcard1);
        final TextView battlepoints1 = findViewById(R.id.battlepoints1);
        final Button endturn2 = findViewById(R.id.endturn2);
        final TextView sumturn2 = findViewById(R.id.sumturn2);
        final TextView sumcard2 = findViewById(R.id.sumcard2);
        final TextView battlepoints2 = findViewById(R.id.battlepoints2);
        sumturn1.setText("Ход: " + sumstep1);
        sumcard1.setText("Карты: " + sumcards1);
        battlepoints1.setText("ОЗ: " + battlepoint1);
        endturn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumstep1++;
                sumturn1.setText("Ход: " + sumstep1);
                endturn1.setRotation(180);
                endturn2.setRotation(180);
                sumcard1.setRotation(180);
                sumcard2.setRotation(180);
                sumturn1.setRotation(180);
                sumturn2.setRotation(180);
                battlepoints1.setRotation(180);
                battlepoints2.setRotation(180);
                imgcard1.setRotation(180);
                imgcard2.setRotation(180);
                imgcard3.setRotation(180);
                imgcard4.setRotation(180);
                imgcard5.setRotation(180);
                imgcard6.setRotation(180);
                imgcard7.setRotation(180);
                imgcard8.setRotation(180);
                imgcard9.setRotation(180);
                imgcard10.setRotation(180);
                imgcard11.setRotation(180);
                imgcard12.setRotation(180);
                p1.setRotation(180);
                p2.setRotation(180);
                p3.setRotation(180);
                p4.setRotation(180);
                p5.setRotation(180);
                p6.setRotation(180);
                f1.setRotation(180);
                f2.setRotation(180);
                ph.setRotation(180);
                namecard1.setRotation(180);
                namecard2.setRotation(180);
                namecard3.setRotation(180);
                namecard4.setRotation(180);
                namecard5.setRotation(180);
                namecard6.setRotation(180);
                namecard7.setRotation(180);
                namecard8.setRotation(180);
                namecard9.setRotation(180);
                namecard10.setRotation(180);
                namecard11.setRotation(180);
                namecard12.setRotation(180);
                p1card1.setRotation(180);
                p1card2.setRotation(180);
                p1card3.setRotation(180);
                p1card4.setRotation(180);
                p1card5.setRotation(180);
                p1card6.setRotation(180);
                p2card1.setRotation(180);
                p2card2.setRotation(180);
                p2card3.setRotation(180);
                p2card4.setRotation(180);
                p2card5.setRotation(180);
                p2card6.setRotation(180);
                p3card1.setRotation(180);
                p3card2.setRotation(180);
                p3card3.setRotation(180);
                p3card4.setRotation(180);
                p3card5.setRotation(180);
                p3card6.setRotation(180);
                p4card1.setRotation(180);
                p4card2.setRotation(180);
                p4card3.setRotation(180);
                p4card4.setRotation(180);
                p4card5.setRotation(180);
                p4card6.setRotation(180);
                p5card1.setRotation(180);
                p5card2.setRotation(180);
                p5card3.setRotation(180);
                p5card4.setRotation(180);
                p5card5.setRotation(180);
                p5card6.setRotation(180);
                p6card1.setRotation(180);
                p6card2.setRotation(180);
                p6card3.setRotation(180);
                p6card4.setRotation(180);
                p6card5.setRotation(180);
                p6card6.setRotation(180);
                endturn1.setEnabled(false);
                endturn2.setEnabled(true);
                imgcard1.setEnabled(false);
                imgcard2.setEnabled(false);
                imgcard3.setEnabled(false);
                imgcard4.setEnabled(false);
                imgcard5.setEnabled(false);
                imgcard6.setEnabled(false);
                imgcard7.setEnabled(true);
                imgcard8.setEnabled(true);
                imgcard9.setEnabled(true);
                imgcard10.setEnabled(true);
                imgcard11.setEnabled(true);
                imgcard12.setEnabled(true);
            }
        });
        sumturn2.setText("Ход: " + sumstep2);
        sumcard2.setText("Карты: " + sumcards2);
        battlepoints2.setText("ОЗ: " + battlepoint2);
        endturn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumstep2++;
                sumturn2.setText("Ход: " + sumstep2);
                endturn1.setRotation(0);
                endturn2.setRotation(0);
                sumcard1.setRotation(0);
                sumcard2.setRotation(0);
                sumturn1.setRotation(0);
                sumturn2.setRotation(0);
                battlepoints1.setRotation(0);
                battlepoints2.setRotation(0);
                imgcard1.setRotation(0);
                imgcard2.setRotation(0);
                imgcard3.setRotation(0);
                imgcard4.setRotation(0);
                imgcard5.setRotation(0);
                imgcard6.setRotation(0);
                imgcard7.setRotation(0);
                imgcard8.setRotation(0);
                imgcard9.setRotation(0);
                imgcard10.setRotation(0);
                imgcard11.setRotation(0);
                imgcard12.setRotation(0);
                p1.setRotation(0);
                p2.setRotation(0);
                p3.setRotation(0);
                p4.setRotation(0);
                p5.setRotation(0);
                p6.setRotation(0);
                f1.setRotation(0);
                f2.setRotation(0);
                ph.setRotation(0);
                namecard1.setRotation(0);
                namecard2.setRotation(0);
                namecard3.setRotation(0);
                namecard4.setRotation(0);
                namecard5.setRotation(0);
                namecard6.setRotation(0);
                namecard7.setRotation(0);
                namecard8.setRotation(0);
                namecard9.setRotation(0);
                namecard10.setRotation(0);
                namecard11.setRotation(0);
                namecard12.setRotation(0);
                p1card1.setRotation(0);
                p1card2.setRotation(0);
                p1card3.setRotation(0);
                p1card4.setRotation(0);
                p1card5.setRotation(0);
                p1card6.setRotation(0);
                p2card1.setRotation(0);
                p2card2.setRotation(0);
                p2card3.setRotation(0);
                p2card4.setRotation(0);
                p2card5.setRotation(0);
                p2card6.setRotation(0);
                p3card1.setRotation(0);
                p3card2.setRotation(0);
                p3card3.setRotation(0);
                p3card4.setRotation(0);
                p3card5.setRotation(0);
                p3card6.setRotation(0);
                p4card1.setRotation(0);
                p4card2.setRotation(0);
                p4card3.setRotation(0);
                p4card4.setRotation(0);
                p4card5.setRotation(0);
                p4card6.setRotation(0);
                p5card1.setRotation(0);
                p5card2.setRotation(0);
                p5card3.setRotation(0);
                p5card4.setRotation(0);
                p5card5.setRotation(0);
                p5card6.setRotation(0);
                p6card1.setRotation(0);
                p6card2.setRotation(0);
                p6card3.setRotation(0);
                p6card4.setRotation(0);
                p6card5.setRotation(0);
                endturn2.setEnabled(false);
                endturn1.setEnabled(true);
                imgcard1.setEnabled(true);
                imgcard2.setEnabled(true);
                imgcard3.setEnabled(true);
                imgcard4.setEnabled(true);
                imgcard5.setEnabled(true);
                imgcard6.setEnabled(true);
                imgcard7.setEnabled(false);
                imgcard8.setEnabled(false);
                imgcard9.setEnabled(false);
                imgcard10.setEnabled(false);
                imgcard11.setEnabled(false);
                imgcard12.setEnabled(false);
            }
        });

        if (sumstep1 == 0){
            imgcard1.setEnabled(true);
            imgcard2.setEnabled(true);
            imgcard3.setEnabled(true);
            imgcard4.setEnabled(true);
            imgcard5.setEnabled(true);
            imgcard6.setEnabled(true);
            imgcard7.setEnabled(false);
            imgcard8.setEnabled(false);
            imgcard9.setEnabled(false);
            imgcard10.setEnabled(false);
            imgcard11.setEnabled(false);
            imgcard12.setEnabled(false);
            endturn2.setEnabled(false);
        }
    }

    @Override
    public void onClick(View v) {
        final ImageView imgcard1 = findViewById(R.id.imgcard1);
        final ImageView imgcard2 = findViewById(R.id.imgcard2);
        final ImageView imgcard3 = findViewById(R.id.imgcard3);
        final ImageView imgcard4 = findViewById(R.id.imgcard4);
        final ImageView imgcard5 = findViewById(R.id.imgcard5);
        final ImageView imgcard6 = findViewById(R.id.imgcard6);
        final ImageView imgcard7 = findViewById(R.id.imgcard7);
        final ImageView imgcard8 = findViewById(R.id.imgcard8);
        final ImageView imgcard9 = findViewById(R.id.imgcard9);
        final ImageView imgcard10 = findViewById(R.id.imgcard10);
        final ImageView imgcard11 = findViewById(R.id.imgcard11);
        final ImageView imgcard12 = findViewById(R.id.imgcard12);
        final TextView p1 = findViewById(R.id.p1);
        final TextView p2 = findViewById(R.id.p2);
        final TextView p3 = findViewById(R.id.p3);
        final TextView p4 = findViewById(R.id.p4);
        final TextView p5 = findViewById(R.id.p5);
        final TextView p6 = findViewById(R.id.p6);
        final TextView f1 = findViewById(R.id.b1);
        final TextView f2 = findViewById(R.id.b2);
        final TextView ph = findViewById(R.id.ph);
        final TextView namecard1 = findViewById(R.id.namecard1);
        final TextView namecard2 = findViewById(R.id.namecard2);
        final TextView namecard3 = findViewById(R.id.namecard3);
        final TextView namecard4 = findViewById(R.id.namecard4);
        final TextView namecard5 = findViewById(R.id.namecard5);
        final TextView namecard6 = findViewById(R.id.namecard6);
        final TextView namecard7 = findViewById(R.id.namecard7);
        final TextView namecard8 = findViewById(R.id.namecard8);
        final TextView namecard9 = findViewById(R.id.namecard9);
        final TextView namecard10 = findViewById(R.id.namecard10);
        final TextView namecard11 = findViewById(R.id.namecard11);
        final TextView namecard12 = findViewById(R.id.namecard12);
        final ImageView p1card1 = findViewById(R.id.p1card1);
        final ImageView p1card2 = findViewById(R.id.p1card2);
        final ImageView p1card3 = findViewById(R.id.p1card3);
        final ImageView p1card4 = findViewById(R.id.p1card4);
        final ImageView p1card5 = findViewById(R.id.p1card5);
        final ImageView p1card6 = findViewById(R.id.p1card6);
        final ImageView p2card1 = findViewById(R.id.p2card1);
        final ImageView p2card2 = findViewById(R.id.p2card2);
        final ImageView p2card3 = findViewById(R.id.p2card3);
        final ImageView p2card4 = findViewById(R.id.p2card4);
        final ImageView p2card5 = findViewById(R.id.p2card5);
        final ImageView p2card6 = findViewById(R.id.p2card6);
        final ImageView p3card1 = findViewById(R.id.p3card1);
        final ImageView p3card2 = findViewById(R.id.p3card2);
        final ImageView p3card3 = findViewById(R.id.p3card3);
        final ImageView p3card4 = findViewById(R.id.p3card4);
        final ImageView p3card5 = findViewById(R.id.p3card5);
        final ImageView p3card6 = findViewById(R.id.p3card6);
        final ImageView p4card1 = findViewById(R.id.p4card1);
        final ImageView p4card2 = findViewById(R.id.p4card2);
        final ImageView p4card3 = findViewById(R.id.p4card3);
        final ImageView p4card4 = findViewById(R.id.p4card4);
        final ImageView p4card5 = findViewById(R.id.p4card5);
        final ImageView p4card6 = findViewById(R.id.p4card6);
        final ImageView p5card1 = findViewById(R.id.p5card1);
        final ImageView p5card2 = findViewById(R.id.p5card2);
        final ImageView p5card3 = findViewById(R.id.p5card3);
        final ImageView p5card4 = findViewById(R.id.p5card4);
        final ImageView p5card5 = findViewById(R.id.p5card5);
        final ImageView p5card6 = findViewById(R.id.p5card6);
        final ImageView p6card1 = findViewById(R.id.p6card1);
        final ImageView p6card2 = findViewById(R.id.p6card2);
        final ImageView p6card3 = findViewById(R.id.p6card3);
        final ImageView p6card4 = findViewById(R.id.p6card4);
        final ImageView p6card5 = findViewById(R.id.p6card5);
        final ImageView p6card6 = findViewById(R.id.p6card6);
        switch (v.getId()) {
            case R.id.imgcard1:
                if (count == 0){
                    p1.setBackgroundResource(R.drawable.red_button_background1);
                    p2.setBackgroundResource(R.drawable.red_button_background1);
                    p3.setBackgroundResource(R.drawable.red_button_background1);
                    p4.setEnabled(false);
                    p5.setEnabled(false);
                    p6.setEnabled(false);
                    ph.setEnabled(false);
                    f1.setEnabled(false);
                    f2.setEnabled(false);
                    count++;
                    if (countp1 == 3) {
                        p1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getBaseContext(), R.string.p1 + R.string.full, Toast.LENGTH_LONG).show();
                            }
                        });
                    } else if (countp1 == 0) {
                        p1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imgcard1.setImageAlpha(1);
                                card1p1 = 1;
                                p1card1.setImageResource(cardInfo.konohacards1[card1p1]);
                                p1.setBackgroundResource(R.drawable.white_button_background1);
                                p2.setBackgroundResource(R.drawable.white_button_background1);
                                p3.setBackgroundResource(R.drawable.white_button_background1);
                                p4.setEnabled(true);
                                p5.setEnabled(true);
                                p6.setEnabled(true);
                                ph.setEnabled(true);
                                f1.setEnabled(true);
                                f2.setEnabled(true);
                                countp1++;
                                battlefield = new Dialog(PlayingField1.this);
                                battlefield.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                battlefield.setContentView(R.layout.battle_field);
                                battlefield.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                battlefield.setCancelable(false);
                                TextView exitdialog2 = battlefield.findViewById(R.id.exit_dialog2);
                                exitdialog2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        battlefield.dismiss();
                                    }
                                });
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                battlefield.show();
                                imgcard1.setClickable(false);
                            }
                        });

                    } else if (countp1 == 1) {
                        p1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imgcard1.setImageAlpha(1);
                                card2p1 = 1;
                                p1card2.setImageResource(cardInfo.konohacards1[card2p1]);
                                p1.setBackgroundResource(R.drawable.white_button_background1);
                                p2.setBackgroundResource(R.drawable.white_button_background1);
                                p3.setBackgroundResource(R.drawable.white_button_background1);
                                p4.setEnabled(true);
                                p5.setEnabled(true);
                                p6.setEnabled(true);
                                ph.setEnabled(true);
                                f1.setEnabled(true);
                                f2.setEnabled(true);
                                countp1++;
                                count++;
                                battlefield = new Dialog(PlayingField1.this);
                                battlefield.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                battlefield.setContentView(R.layout.battle_field);
                                battlefield.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                battlefield.setCancelable(false);
                                TextView exitdialog2 = battlefield.findViewById(R.id.exit_dialog2);
                                exitdialog2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        battlefield.dismiss();
                                    }
                                });
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                battlefield.show();
                                imgcard1.setClickable(false);
                            }
                        });

                    } else if (countp1 == 2) {
                        p1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imgcard1.setImageAlpha(1);
                                card3p1 = 1;
                                p1card3.setImageResource(cardInfo.konohacards1[card3p1]);
                                p1.setBackgroundResource(R.drawable.white_button_background1);
                                p2.setBackgroundResource(R.drawable.white_button_background1);
                                p3.setBackgroundResource(R.drawable.white_button_background1);
                                p4.setEnabled(true);
                                p5.setEnabled(true);
                                p6.setEnabled(true);
                                ph.setEnabled(true);
                                f1.setEnabled(true);
                                f2.setEnabled(true);
                                countp1++;
                                count++;
                                battlefield = new Dialog(PlayingField1.this);
                                battlefield.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                battlefield.setContentView(R.layout.battle_field);
                                battlefield.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                battlefield.setCancelable(false);
                                TextView exitdialog2 = battlefield.findViewById(R.id.exit_dialog2);
                                exitdialog2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        battlefield.dismiss();
                                    }
                                });
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p1]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p1]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p1]);
                                battlefield.show();
                                imgcard1.setClickable(false);
                            }
                        });

                    }
                    if (countp2 == 3) {
                        p2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getBaseContext(), R.string.p2 + R.string.full, Toast.LENGTH_LONG).show();
                            }
                        });
                    } else if (countp2 == 0) {
                        p2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imgcard1.setImageAlpha(1);
                                card1p2 = 1;
                                namecard1.setText(R.string.shu);
                                p2card1.setImageResource(cardInfo.konohacards1[card1p2]);
                                p1.setBackgroundResource(R.drawable.white_button_background1);
                                p2.setBackgroundResource(R.drawable.white_button_background1);
                                p3.setBackgroundResource(R.drawable.white_button_background1);
                                p4.setEnabled(true);
                                p5.setEnabled(true);
                                p6.setEnabled(true);
                                ph.setEnabled(true);
                                f1.setEnabled(true);
                                f2.setEnabled(true);
                                countp2++;
                                count++;
                                battlefield = new Dialog(PlayingField1.this);
                                battlefield.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                battlefield.setContentView(R.layout.battle_field);
                                battlefield.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                battlefield.setCancelable(false);
                                TextView exitdialog2 = battlefield.findViewById(R.id.exit_dialog2);
                                exitdialog2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        battlefield.dismiss();
                                    }
                                });
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                battlefield.show();
                                imgcard1.setClickable(false);
                            }
                        });

                    } else if (countp2 == 1) {
                        p2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imgcard1.setImageAlpha(1);
                                card2p2 = 1;
                                namecard1.setText(R.string.shu);
                                p2card2.setImageResource(cardInfo.konohacards1[card2p2]);
                                p1.setBackgroundResource(R.drawable.white_button_background1);
                                p2.setBackgroundResource(R.drawable.white_button_background1);
                                p3.setBackgroundResource(R.drawable.white_button_background1);
                                p4.setEnabled(true);
                                p5.setEnabled(true);
                                p6.setEnabled(true);
                                ph.setEnabled(true);
                                f1.setEnabled(true);
                                f2.setEnabled(true);
                                countp2++;
                                count++;
                                battlefield = new Dialog(PlayingField1.this);
                                battlefield.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                battlefield.setContentView(R.layout.battle_field);
                                battlefield.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                battlefield.setCancelable(false);
                                TextView exitdialog2 = battlefield.findViewById(R.id.exit_dialog2);
                                exitdialog2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        battlefield.dismiss();
                                    }
                                });
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                battlefield.show();
                                imgcard1.setClickable(false);
                            }
                        });

                    } else if (countp2 == 2) {
                        p2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imgcard1.setImageAlpha(1);
                                card3p2 = 1;
                                namecard1.setText(R.string.shu);
                                p2card3.setImageResource(cardInfo.konohacards1[card3p2]);
                                p1.setBackgroundResource(R.drawable.white_button_background1);
                                p2.setBackgroundResource(R.drawable.white_button_background1);
                                p3.setBackgroundResource(R.drawable.white_button_background1);
                                p4.setEnabled(true);
                                p5.setEnabled(true);
                                p6.setEnabled(true);
                                ph.setEnabled(true);
                                f1.setEnabled(true);
                                f2.setEnabled(true);
                                countp2++;
                                count++;
                                battlefield = new Dialog(PlayingField1.this);
                                battlefield.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                battlefield.setContentView(R.layout.battle_field);
                                battlefield.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                battlefield.setCancelable(false);
                                TextView exitdialog2 = battlefield.findViewById(R.id.exit_dialog2);
                                exitdialog2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        battlefield.dismiss();
                                    }
                                });
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p2]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p2]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p2]);
                                battlefield.show();
                                imgcard1.setClickable(false);
                            }
                        });

                    }
                    if (countp3 == 3) {
                        p3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(getBaseContext(), R.string.p3 + R.string.full, Toast.LENGTH_LONG).show();
                            }
                        });
                    } else if (countp3 == 0) {
                        p3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imgcard1.setImageAlpha(1);
                                card1p3 = 1;
                                namecard1.setText(R.string.shu);
                                p3card1.setImageResource(cardInfo.konohacards1[card1p3]);
                                p1.setBackgroundResource(R.drawable.white_button_background1);
                                p2.setBackgroundResource(R.drawable.white_button_background1);
                                p3.setBackgroundResource(R.drawable.white_button_background1);
                                p4.setEnabled(true);
                                p5.setEnabled(true);
                                p6.setEnabled(true);
                                ph.setEnabled(true);
                                f1.setEnabled(true);
                                f2.setEnabled(true);
                                countp3++;
                                count++;
                                battlefield = new Dialog(PlayingField1.this);
                                battlefield.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                battlefield.setContentView(R.layout.battle_field);
                                battlefield.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                battlefield.setCancelable(false);
                                TextView exitdialog2 = battlefield.findViewById(R.id.exit_dialog2);
                                exitdialog2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        battlefield.dismiss();
                                    }
                                });
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                battlefield.show();
                                imgcard1.setClickable(false);
                            }
                        });

                    } else if (countp3 == 1) {
                        p3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imgcard1.setImageAlpha(1);
                                card2p3 = 1;
                                namecard1.setText(R.string.shu);
                                p3card2.setImageResource(cardInfo.konohacards1[card2p3]);
                                p1.setBackgroundResource(R.drawable.white_button_background1);
                                p2.setBackgroundResource(R.drawable.white_button_background1);
                                p3.setBackgroundResource(R.drawable.white_button_background1);
                                p4.setEnabled(true);
                                p5.setEnabled(true);
                                p6.setEnabled(true);
                                ph.setEnabled(true);
                                f1.setEnabled(true);
                                f2.setEnabled(true);
                                countp3++;
                                count++;
                                battlefield = new Dialog(PlayingField1.this);
                                battlefield.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                battlefield.setContentView(R.layout.battle_field);
                                battlefield.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                battlefield.setCancelable(false);
                                TextView exitdialog2 = battlefield.findViewById(R.id.exit_dialog2);
                                exitdialog2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        battlefield.dismiss();
                                    }
                                });
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                battlefield.show();
                                imgcard1.setClickable(false);
                            }
                        });

                    } else if(countp3 == 2) {
                        p3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                imgcard1.setImageAlpha(1);
                                card3p3 = 1;
                                namecard1.setText(R.string.shu);
                                p3card3.setImageResource(cardInfo.konohacards1[card3p3]);
                                p1.setBackgroundResource(R.drawable.white_button_background1);
                                p2.setBackgroundResource(R.drawable.white_button_background1);
                                p3.setBackgroundResource(R.drawable.white_button_background1);
                                p4.setEnabled(true);
                                p5.setEnabled(true);
                                p6.setEnabled(true);
                                ph.setEnabled(true);
                                f1.setEnabled(true);
                                f2.setEnabled(true);
                                countp3++;
                                count++;
                                battlefield = new Dialog(PlayingField1.this);
                                battlefield.requestWindowFeature(Window.FEATURE_NO_TITLE);
                                battlefield.setContentView(R.layout.battle_field);
                                battlefield.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                                battlefield.setCancelable(false);
                                TextView exitdialog2 = battlefield.findViewById(R.id.exit_dialog2);
                                exitdialog2.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        battlefield.dismiss();
                                    }
                                });
                                ImageView battlecard1 = battlefield.findViewById(R.id.battlecard1);
                                ImageView battlecard2 = battlefield.findViewById(R.id.battlecard2);
                                ImageView battlecard3 = battlefield.findViewById(R.id.battlecard3);
                                battlecard1.setImageResource(cardInfo.konohacards1[card1p3]);
                                battlecard2.setImageResource(cardInfo.konohacards1[card2p3]);
                                battlecard3.setImageResource(cardInfo.konohacards1[card3p3]);
                                battlefield.show();
                                imgcard1.setClickable(false);
                            }
                        });
                    }
                }
                break;
            case R.id.p1:
            case R.id.p2:
            case R.id.p3:
            case R.id.p4:
            case R.id.p5:
            case R.id.p6:
            case R.id.b1:
            case R.id.b2:
            case R.id.ph:
                battlefield = new Dialog(this);
                battlefield.requestWindowFeature(Window.FEATURE_NO_TITLE);
                battlefield.setContentView(R.layout.battle_field);
                battlefield.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                battlefield.setCancelable(false);
                TextView exitdialog2 = battlefield.findViewById(R.id.exit_dialog2);
                exitdialog2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        battlefield.dismiss();
                    }
                });
                battlefield.show();
                break;
                }
        }

    @Override
    public void onBackPressed() {
        if(backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        }else {
            backToast = Toast.makeText(getBaseContext(), "Нажмите ещё раз, чтобы выйти", Toast.LENGTH_LONG);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (v.getId()) {
            case R.id.imgcard1:
            case R.id.imgcard2:
            case R.id.imgcard3:
            case R.id.imgcard4:
            case R.id.imgcard5:
            case R.id.imgcard6:
            case R.id.namecard1:
            case R.id.namecard2:
            case R.id.namecard3:
            case R.id.namecard4:
            case R.id.namecard5:
            case R.id.namecard6:
            case R.id.imgcard7:
            case R.id.imgcard8:
            case R.id.imgcard9:
            case R.id.imgcard10:
            case R.id.imgcard11:
            case R.id.imgcard12:
            case R.id.namecard7:
            case R.id.namecard8:
            case R.id.namecard9:
            case R.id.namecard10:
            case R.id.namecard11:
            case R.id.namecard12:
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        startTime = System.currentTimeMillis();
                        break;
                    case MotionEvent.ACTION_UP:
                        long totalTime1 = System.currentTimeMillis() - startTime;
                        if (totalTime1 >= 1000) {
                            cardinfo = new Dialog(this);
                            cardinfo.requestWindowFeature(Window.FEATURE_NO_TITLE);
                            cardinfo.setContentView(R.layout.card_info);
                            cardinfo.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                            cardinfo.setCancelable(false);
                            TextView exitdialog1 = cardinfo.findViewById(R.id.exit_dialog1);
                            exitdialog1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    cardinfo.dismiss();
                                }
                            });

                            cardinfo.show();

                        }break;
                }
                break;
        }
        return false;
    }
}
