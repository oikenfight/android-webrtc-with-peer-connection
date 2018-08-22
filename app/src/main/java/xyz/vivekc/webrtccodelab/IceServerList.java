package xyz.vivekc.webrtccodelab;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class IceServerList {
    @SerializedName("iceServers")
    @Expose
    private List<IceServer> iceServers = null;

    public List<IceServer> getIceServers() {
        return iceServers;
    }

    public void setIceServers(List<IceServer> iceServers) {
        this.iceServers = iceServers;
    }
}
