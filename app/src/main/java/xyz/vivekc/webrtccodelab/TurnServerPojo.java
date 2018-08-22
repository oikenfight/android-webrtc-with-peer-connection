
package xyz.vivekc.webrtccodelab;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TurnServerPojo {

    @SerializedName("v")
    @Expose
    private IceServerList iceServerList;
    @SerializedName("s")
    @Expose
    private String status;

    public IceServerList getIceServerList() {
        return iceServerList;
    }

    public void setIceServerList(IceServerList iceServerList) {
        this.iceServerList = iceServerList;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
