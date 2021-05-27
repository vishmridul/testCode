
package model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Flickr {

    @SerializedName("small")
    @Expose
    private List<Object> small = null;
    @SerializedName("original")
    @Expose
    private List<Object> original = null;

    public List<Object> getSmall() {
        return small;
    }

    public void setSmall(List<Object> small) {
        this.small = small;
    }

    public List<Object> getOriginal() {
        return original;
    }

    public void setOriginal(List<Object> original) {
        this.original = original;
    }

}
