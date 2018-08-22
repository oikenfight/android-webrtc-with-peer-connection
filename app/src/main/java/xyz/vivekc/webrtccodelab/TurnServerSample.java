package xyz.vivekc.webrtccodelab;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.PUT;

public interface TurnServerSample {
    // TODO: input your encoded Authorization into {}
    @Headers({
            "Authorization: Basic {}",
    })
    @PUT(".")
    Call<TurnServerPojo> getIceCandidates();
}
