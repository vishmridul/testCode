package model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class SpaceXResponce {

    @SerializedName("fairings")
    @Expose
    private Fairings fairings;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("static_fire_date_utc")
    @Expose
    private Object staticFireDateUtc;
    @SerializedName("static_fire_date_unix")
    @Expose
    private Object staticFireDateUnix;
    @SerializedName("tbd")
    @Expose
    private Boolean tbd;
    @SerializedName("net")
    @Expose
    private Boolean net;
    @SerializedName("window")
    @Expose
    private Object window;
    @SerializedName("rocket")
    @Expose
    private String rocket;
    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("details")
    @Expose
    private String details;
    @SerializedName("crew")
    @Expose
    private List<Object> crew = null;
    @SerializedName("ships")
    @Expose
    private List<String> ships = null;
    @SerializedName("capsules")
    @Expose
    private List<Object> capsules = null;
    @SerializedName("payloads")
    @Expose
    private List<String> payloads = null;
    @SerializedName("launchpad")
    @Expose
    private String launchpad;
    @SerializedName("auto_update")
    @Expose
    private Boolean autoUpdate;
    @SerializedName("launch_library_id")
    @Expose
    private String launchLibraryId;
    @SerializedName("failures")
    @Expose
    private List<Object> failures = null;
    @SerializedName("flight_number")
    @Expose
    private Integer flightNumber;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("date_utc")
    @Expose
    private String dateUtc;
    @SerializedName("date_unix")
    @Expose
    private Integer dateUnix;
    @SerializedName("date_local")
    @Expose
    private String dateLocal;
    @SerializedName("date_precision")
    @Expose
    private String datePrecision;
    @SerializedName("upcoming")
    @Expose
    private Boolean upcoming;
    @SerializedName("cores")
    @Expose
    private List<Core> cores = null;
    @SerializedName("id")
    @Expose
    private String id;

    public Fairings getFairings() {
        return fairings;
    }

    public void setFairings(Fairings fairings) {
        this.fairings = fairings;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Object getStaticFireDateUtc() {
        return staticFireDateUtc;
    }

    public void setStaticFireDateUtc(Object staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
    }

    public Object getStaticFireDateUnix() {
        return staticFireDateUnix;
    }

    public void setStaticFireDateUnix(Object staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
    }

    public Boolean getTbd() {
        return tbd;
    }

    public void setTbd(Boolean tbd) {
        this.tbd = tbd;
    }

    public Boolean getNet() {
        return net;
    }

    public void setNet(Boolean net) {
        this.net = net;
    }

    public Object getWindow() {
        return window;
    }

    public void setWindow(Object window) {
        this.window = window;
    }

    public String getRocket() {
        return rocket;
    }

    public void setRocket(String rocket) {
        this.rocket = rocket;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<Object> getCrew() {
        return crew;
    }

    public void setCrew(List<Object> crew) {
        this.crew = crew;
    }

    public List<String> getShips() {
        return ships;
    }

    public void setShips(List<String> ships) {
        this.ships = ships;
    }

    public List<Object> getCapsules() {
        return capsules;
    }

    public void setCapsules(List<Object> capsules) {
        this.capsules = capsules;
    }

    public List<String> getPayloads() {
        return payloads;
    }

    public void setPayloads(List<String> payloads) {
        this.payloads = payloads;
    }

    public String getLaunchpad() {
        return launchpad;
    }

    public void setLaunchpad(String launchpad) {
        this.launchpad = launchpad;
    }

    public Boolean getAutoUpdate() {
        return autoUpdate;
    }

    public void setAutoUpdate(Boolean autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    public String getLaunchLibraryId() {
        return launchLibraryId;
    }

    public void setLaunchLibraryId(String launchLibraryId) {
        this.launchLibraryId = launchLibraryId;
    }

    public List<Object> getFailures() {
        return failures;
    }

    public void setFailures(List<Object> failures) {
        this.failures = failures;
    }

    public Integer getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(Integer flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateUtc() {
        return dateUtc;
    }

    public void setDateUtc(String dateUtc) {
        this.dateUtc = dateUtc;
    }

    public Integer getDateUnix() {
        return dateUnix;
    }

    public void setDateUnix(Integer dateUnix) {
        this.dateUnix = dateUnix;
    }

    public String getDateLocal() {
        return dateLocal;
    }

    public void setDateLocal(String dateLocal) {
        this.dateLocal = dateLocal;
    }

    public String getDatePrecision() {
        return datePrecision;
    }

    public void setDatePrecision(String datePrecision) {
        this.datePrecision = datePrecision;
    }

    public Boolean getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
    }

    public List<Core> getCores() {
        return cores;
    }

    public void setCores(List<Core> cores) {
        this.cores = cores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
