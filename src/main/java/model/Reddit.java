package model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Reddit {

    @SerializedName("campaign")
    @Expose
    private String campaign;
    @SerializedName("launch")
    @Expose
    private String launch;
    @SerializedName("media")
    @Expose
    private Object media;
    @SerializedName("recovery")
    @Expose
    private String recovery;

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public String getLaunch() {
        return launch;
    }

    public void setLaunch(String launch) {
        this.launch = launch;
    }

    public Object getMedia() {
        return media;
    }

    public void setMedia(Object media) {
        this.media = media;
    }

    public String getRecovery() {
        return recovery;
    }

    public void setRecovery(String recovery) {
        this.recovery = recovery;
    }

}
