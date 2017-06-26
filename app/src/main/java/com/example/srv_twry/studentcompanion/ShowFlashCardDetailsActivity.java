package com.example.srv_twry.studentcompanion;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.srv_twry.studentcompanion.POJOs.FlashCard;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShowFlashCardDetailsActivity extends AppCompatActivity {

    private FlashCard mFlashCard;
    @BindView(R.id.tv_flash_card_detail_question) TextView detailQuestion;
    @BindView(R.id.tv_flash_card_detail_answer) TextView detailAnswer;
    @BindView(R.id.fab_show_flash_card_details) FloatingActionButton shareThisCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_flash_card_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mFlashCard = getIntent().getParcelableExtra(ShowFlashCardsActivity.INTENT_EXTRA_FLASH_CARD);
        setTitle(mFlashCard.getTopicName());

        ButterKnife.bind(this);

        detailQuestion.setText(mFlashCard.getQuestion());
        detailAnswer.setText(mFlashCard.getAnswer());

        shareThisCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Set the share intent here
            }
        });
    }
}