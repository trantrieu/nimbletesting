
package com.nimble.surveytest.home.model.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Survey implements Serializable {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("access_code_prompt")
    @Expose
    private Object accessCodePrompt;
    @SerializedName("thank_email_above_threshold")
    @Expose
    private Object thankEmailAboveThreshold;
    @SerializedName("thank_email_below_threshold")
    @Expose
    private Object thankEmailBelowThreshold;
    @SerializedName("footer_content")
    @Expose
    private Object footerContent;
    @SerializedName("store_code_prompt")
    @Expose
    private String storeCodePrompt;
    @SerializedName("is_active")
    @Expose
    private Boolean isActive;
    @SerializedName("cover_image_url")
    @Expose
    private String coverImageUrl;
    @SerializedName("cover_background_color")
    @Expose
    private Object coverBackgroundColor;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("active_at")
    @Expose
    private String activeAt;
    @SerializedName("inactive_at")
    @Expose
    private Object inactiveAt;
    @SerializedName("survey_version")
    @Expose
    private Integer surveyVersion;
    @SerializedName("short_url")
    @Expose
    private String shortUrl;
    @SerializedName("language_list")
    @Expose
    private List<String> languageList = new ArrayList<String>();
    @SerializedName("default_language")
    @Expose
    private String defaultLanguage;
    @SerializedName("tag_list")
    @Expose
    private String tagList;
    @SerializedName("is_access_code_required")
    @Expose
    private Boolean isAccessCodeRequired;
    @SerializedName("is_access_code_valid_required")
    @Expose
    private Boolean isAccessCodeValidRequired;
    @SerializedName("access_code_validation")
    @Expose
    private String accessCodeValidation;
    @SerializedName("theme")
    @Expose
    private Theme theme;
    @SerializedName("questions")
    @Expose
    private List<Question> questions = new ArrayList<Question>();

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
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The accessCodePrompt
     */
    public Object getAccessCodePrompt() {
        return accessCodePrompt;
    }

    /**
     * 
     * @param accessCodePrompt
     *     The access_code_prompt
     */
    public void setAccessCodePrompt(Object accessCodePrompt) {
        this.accessCodePrompt = accessCodePrompt;
    }

    /**
     * 
     * @return
     *     The thankEmailAboveThreshold
     */
    public Object getThankEmailAboveThreshold() {
        return thankEmailAboveThreshold;
    }

    /**
     * 
     * @param thankEmailAboveThreshold
     *     The thank_email_above_threshold
     */
    public void setThankEmailAboveThreshold(Object thankEmailAboveThreshold) {
        this.thankEmailAboveThreshold = thankEmailAboveThreshold;
    }

    /**
     * 
     * @return
     *     The thankEmailBelowThreshold
     */
    public Object getThankEmailBelowThreshold() {
        return thankEmailBelowThreshold;
    }

    /**
     * 
     * @param thankEmailBelowThreshold
     *     The thank_email_below_threshold
     */
    public void setThankEmailBelowThreshold(Object thankEmailBelowThreshold) {
        this.thankEmailBelowThreshold = thankEmailBelowThreshold;
    }

    /**
     * 
     * @return
     *     The footerContent
     */
    public Object getFooterContent() {
        return footerContent;
    }

    /**
     * 
     * @param footerContent
     *     The footer_content
     */
    public void setFooterContent(Object footerContent) {
        this.footerContent = footerContent;
    }

    /**
     * 
     * @return
     *     The storeCodePrompt
     */
    public String getStoreCodePrompt() {
        return storeCodePrompt;
    }

    /**
     * 
     * @param storeCodePrompt
     *     The store_code_prompt
     */
    public void setStoreCodePrompt(String storeCodePrompt) {
        this.storeCodePrompt = storeCodePrompt;
    }

    /**
     * 
     * @return
     *     The isActive
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * 
     * @param isActive
     *     The is_active
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
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
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The activeAt
     */
    public String getActiveAt() {
        return activeAt;
    }

    /**
     * 
     * @param activeAt
     *     The active_at
     */
    public void setActiveAt(String activeAt) {
        this.activeAt = activeAt;
    }

    /**
     * 
     * @return
     *     The inactiveAt
     */
    public Object getInactiveAt() {
        return inactiveAt;
    }

    /**
     * 
     * @param inactiveAt
     *     The inactive_at
     */
    public void setInactiveAt(Object inactiveAt) {
        this.inactiveAt = inactiveAt;
    }

    /**
     * 
     * @return
     *     The surveyVersion
     */
    public Integer getSurveyVersion() {
        return surveyVersion;
    }

    /**
     * 
     * @param surveyVersion
     *     The survey_version
     */
    public void setSurveyVersion(Integer surveyVersion) {
        this.surveyVersion = surveyVersion;
    }

    /**
     * 
     * @return
     *     The shortUrl
     */
    public String getShortUrl() {
        return shortUrl;
    }

    /**
     * 
     * @param shortUrl
     *     The short_url
     */
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    /**
     * 
     * @return
     *     The languageList
     */
    public List<String> getLanguageList() {
        return languageList;
    }

    /**
     * 
     * @param languageList
     *     The language_list
     */
    public void setLanguageList(List<String> languageList) {
        this.languageList = languageList;
    }

    /**
     * 
     * @return
     *     The defaultLanguage
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * 
     * @param defaultLanguage
     *     The default_language
     */
    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
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
     *     The isAccessCodeRequired
     */
    public Boolean getIsAccessCodeRequired() {
        return isAccessCodeRequired;
    }

    /**
     * 
     * @param isAccessCodeRequired
     *     The is_access_code_required
     */
    public void setIsAccessCodeRequired(Boolean isAccessCodeRequired) {
        this.isAccessCodeRequired = isAccessCodeRequired;
    }

    /**
     * 
     * @return
     *     The isAccessCodeValidRequired
     */
    public Boolean getIsAccessCodeValidRequired() {
        return isAccessCodeValidRequired;
    }

    /**
     * 
     * @param isAccessCodeValidRequired
     *     The is_access_code_valid_required
     */
    public void setIsAccessCodeValidRequired(Boolean isAccessCodeValidRequired) {
        this.isAccessCodeValidRequired = isAccessCodeValidRequired;
    }

    /**
     * 
     * @return
     *     The accessCodeValidation
     */
    public String getAccessCodeValidation() {
        return accessCodeValidation;
    }

    /**
     * 
     * @param accessCodeValidation
     *     The access_code_validation
     */
    public void setAccessCodeValidation(String accessCodeValidation) {
        this.accessCodeValidation = accessCodeValidation;
    }

    /**
     * 
     * @return
     *     The theme
     */
    public Theme getTheme() {
        return theme;
    }

    /**
     * 
     * @param theme
     *     The theme
     */
    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    /**
     * 
     * @return
     *     The questions
     */
    public List<Question> getQuestions() {
        return questions;
    }

    /**
     * 
     * @param questions
     *     The questions
     */
    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }


    /**
     *
     * @return
     *     The coverImageUrl
     */
    public String getCoverImageUrlLarge() {
        return coverImageUrl + "l";
    }
}
