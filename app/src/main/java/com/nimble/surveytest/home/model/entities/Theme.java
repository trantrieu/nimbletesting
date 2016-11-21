
package com.nimble.surveytest.home.model.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class Theme implements Serializable{

    @SerializedName("color_active")
    @Expose
    private String colorActive;
    @SerializedName("color_inactive")
    @Expose
    private String colorInactive;
    @SerializedName("color_question")
    @Expose
    private String colorQuestion;
    @SerializedName("color_answer_normal")
    @Expose
    private String colorAnswerNormal;
    @SerializedName("color_answer_inactive")
    @Expose
    private String colorAnswerInactive;

    /**
     * 
     * @return
     *     The colorActive
     */
    public String getColorActive() {
        return colorActive;
    }

    /**
     * 
     * @param colorActive
     *     The color_active
     */
    public void setColorActive(String colorActive) {
        this.colorActive = colorActive;
    }

    /**
     * 
     * @return
     *     The colorInactive
     */
    public String getColorInactive() {
        return colorInactive;
    }

    /**
     * 
     * @param colorInactive
     *     The color_inactive
     */
    public void setColorInactive(String colorInactive) {
        this.colorInactive = colorInactive;
    }

    /**
     * 
     * @return
     *     The colorQuestion
     */
    public String getColorQuestion() {
        return colorQuestion;
    }

    /**
     * 
     * @param colorQuestion
     *     The color_question
     */
    public void setColorQuestion(String colorQuestion) {
        this.colorQuestion = colorQuestion;
    }

    /**
     * 
     * @return
     *     The colorAnswerNormal
     */
    public String getColorAnswerNormal() {
        return colorAnswerNormal;
    }

    /**
     * 
     * @param colorAnswerNormal
     *     The color_answer_normal
     */
    public void setColorAnswerNormal(String colorAnswerNormal) {
        this.colorAnswerNormal = colorAnswerNormal;
    }

    /**
     * 
     * @return
     *     The colorAnswerInactive
     */
    public String getColorAnswerInactive() {
        return colorAnswerInactive;
    }

    /**
     * 
     * @param colorAnswerInactive
     *     The color_answer_inactive
     */
    public void setColorAnswerInactive(String colorAnswerInactive) {
        this.colorAnswerInactive = colorAnswerInactive;
    }


}
