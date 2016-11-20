
package com.nimble.surveytest.home.model.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Question {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("help_text")
    @Expose
    private Object helpText;
    @SerializedName("display_order")
    @Expose
    private Integer displayOrder;
    @SerializedName("short_text")
    @Expose
    private String shortText;
    @SerializedName("pick")
    @Expose
    private String pick;
    @SerializedName("display_type")
    @Expose
    private String displayType;
    @SerializedName("is_mandatory")
    @Expose
    private Boolean isMandatory;
    @SerializedName("correct_answer_id")
    @Expose
    private Object correctAnswerId;
    @SerializedName("facebook_profile")
    @Expose
    private Object facebookProfile;
    @SerializedName("twitter_profile")
    @Expose
    private Object twitterProfile;
    @SerializedName("image_url")
    @Expose
    private Object imageUrl;
    @SerializedName("cover_image_url")
    @Expose
    private String coverImageUrl;
    @SerializedName("cover_image_opacity")
    @Expose
    private Object coverImageOpacity;
    @SerializedName("cover_background_color")
    @Expose
    private Object coverBackgroundColor;
    @SerializedName("is_shareable_on_facebook")
    @Expose
    private Boolean isShareableOnFacebook;
    @SerializedName("is_shareable_on_twitter")
    @Expose
    private Boolean isShareableOnTwitter;
    @SerializedName("font_face")
    @Expose
    private Object fontFace;
    @SerializedName("font_size")
    @Expose
    private Object fontSize;
    @SerializedName("tag_list")
    @Expose
    private String tagList;
    @SerializedName("answers")
    @Expose
    private List<Object> answers = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The text
     */
    public String getText() {
        return text;
    }

    /**
     * 
     * @param text
     *     The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * 
     * @return
     *     The helpText
     */
    public Object getHelpText() {
        return helpText;
    }

    /**
     * 
     * @param helpText
     *     The help_text
     */
    public void setHelpText(Object helpText) {
        this.helpText = helpText;
    }

    /**
     * 
     * @return
     *     The displayOrder
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * 
     * @param displayOrder
     *     The display_order
     */
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * 
     * @return
     *     The shortText
     */
    public String getShortText() {
        return shortText;
    }

    /**
     * 
     * @param shortText
     *     The short_text
     */
    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    /**
     * 
     * @return
     *     The pick
     */
    public String getPick() {
        return pick;
    }

    /**
     * 
     * @param pick
     *     The pick
     */
    public void setPick(String pick) {
        this.pick = pick;
    }

    /**
     * 
     * @return
     *     The displayType
     */
    public String getDisplayType() {
        return displayType;
    }

    /**
     * 
     * @param displayType
     *     The display_type
     */
    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    /**
     * 
     * @return
     *     The isMandatory
     */
    public Boolean getIsMandatory() {
        return isMandatory;
    }

    /**
     * 
     * @param isMandatory
     *     The is_mandatory
     */
    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    /**
     * 
     * @return
     *     The correctAnswerId
     */
    public Object getCorrectAnswerId() {
        return correctAnswerId;
    }

    /**
     * 
     * @param correctAnswerId
     *     The correct_answer_id
     */
    public void setCorrectAnswerId(Object correctAnswerId) {
        this.correctAnswerId = correctAnswerId;
    }

    /**
     * 
     * @return
     *     The facebookProfile
     */
    public Object getFacebookProfile() {
        return facebookProfile;
    }

    /**
     * 
     * @param facebookProfile
     *     The facebook_profile
     */
    public void setFacebookProfile(Object facebookProfile) {
        this.facebookProfile = facebookProfile;
    }

    /**
     * 
     * @return
     *     The twitterProfile
     */
    public Object getTwitterProfile() {
        return twitterProfile;
    }

    /**
     * 
     * @param twitterProfile
     *     The twitter_profile
     */
    public void setTwitterProfile(Object twitterProfile) {
        this.twitterProfile = twitterProfile;
    }

    /**
     * 
     * @return
     *     The imageUrl
     */
    public Object getImageUrl() {
        return imageUrl;
    }

    /**
     * 
     * @param imageUrl
     *     The image_url
     */
    public void setImageUrl(Object imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     *
     * @return
     *     The coverImageUrl
     */
    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    /**
     * 
     * @param coverImageUrl
     *     The cover_image_url
     */
    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    /**
     * 
     * @return
     *     The coverImageOpacity
     */
    public Object getCoverImageOpacity() {
        return coverImageOpacity;
    }

    /**
     * 
     * @param coverImageOpacity
     *     The cover_image_opacity
     */
    public void setCoverImageOpacity(Object coverImageOpacity) {
        this.coverImageOpacity = coverImageOpacity;
    }

    /**
     * 
     * @return
     *     The coverBackgroundColor
     */
    public Object getCoverBackgroundColor() {
        return coverBackgroundColor;
    }

    /**
     * 
     * @param coverBackgroundColor
     *     The cover_background_color
     */
    public void setCoverBackgroundColor(Object coverBackgroundColor) {
        this.coverBackgroundColor = coverBackgroundColor;
    }

    /**
     * 
     * @return
     *     The isShareableOnFacebook
     */
    public Boolean getIsShareableOnFacebook() {
        return isShareableOnFacebook;
    }

    /**
     * 
     * @param isShareableOnFacebook
     *     The is_shareable_on_facebook
     */
    public void setIsShareableOnFacebook(Boolean isShareableOnFacebook) {
        this.isShareableOnFacebook = isShareableOnFacebook;
    }

    /**
     * 
     * @return
     *     The isShareableOnTwitter
     */
    public Boolean getIsShareableOnTwitter() {
        return isShareableOnTwitter;
    }

    /**
     * 
     * @param isShareableOnTwitter
     *     The is_shareable_on_twitter
     */
    public void setIsShareableOnTwitter(Boolean isShareableOnTwitter) {
        this.isShareableOnTwitter = isShareableOnTwitter;
    }

    /**
     * 
     * @return
     *     The fontFace
     */
    public Object getFontFace() {
        return fontFace;
    }

    /**
     * 
     * @param fontFace
     *     The font_face
     */
    public void setFontFace(Object fontFace) {
        this.fontFace = fontFace;
    }

    /**
     * 
     * @return
     *     The fontSize
     */
    public Object getFontSize() {
        return fontSize;
    }

    /**
     * 
     * @param fontSize
     *     The font_size
     */
    public void setFontSize(Object fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * 
     * @return
     *     The tagList
     */
    public String getTagList() {
        return tagList;
    }

    /**
     * 
     * @param tagList
     *     The tag_list
     */
    public void setTagList(String tagList) {
        this.tagList = tagList;
    }

    /**
     * 
     * @return
     *     The answers
     */
    public List<Object> getAnswers() {
        return answers;
    }

    /**
     * 
     * @param answers
     *     The answers
     */
    public void setAnswers(List<Object> answers) {
        this.answers = answers;
    }

}
