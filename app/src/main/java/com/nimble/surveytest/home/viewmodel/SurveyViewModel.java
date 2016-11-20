package com.nimble.surveytest.home.viewmodel;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.view.View;
import android.widget.ImageView;

import com.nimble.surveytest.detail.DetailActivity;
import com.nimble.surveytest.home.model.entities.Survey;
import com.squareup.picasso.Picasso;

/**
 * Created by Apple on 11/19/16.
 */

public class SurveyViewModel implements ViewModel {
    private Survey survey;
    public ObservableField<String> title;
    public ObservableField<String> description;
    public ObservableField<String> coverImageUrl;
    private Context context;
    public SurveyViewModel(Context context, Survey survey) {
        this.context = context;
        title = new ObservableField<>("");
        description = new ObservableField<>("");
        coverImageUrl = new ObservableField<>("");
        setModel(survey);
    }

    public void setModel(Survey survey){
        this.survey = survey;
        title.set(survey.getTitle());
        description.set(survey.getDescription());
        coverImageUrl.set(survey.getCoverImageUrlLarge());
    }

    /**
     * http://mobikul.com/data-binding-part-ii-image-binding/
     * @param view
     * @param imageUrl
     */
    @BindingAdapter("imageUrl")
    /**
     * force always static, if not, will error compli
     */
    public static void loadImage(ImageView view, String imageUrl) {
        Picasso.with(view.getContext()).load(imageUrl).tag(imageUrl).into(view);
    }

    /**
     * survey button click
     * @param view
     */
    public void takeSurveyClick(View view){
        context.startActivity(DetailActivity.createDetailActivityIntent(context, survey));
    }

    @Override
    public void destroy() {
        Picasso.with(context).cancelTag(survey.getCoverImageUrlLarge());
    }
}
