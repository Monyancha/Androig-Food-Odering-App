package com.example.mayankaggarwal.dcare.models.Details.MediaUpload;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mayankaggarwal on 06/06/17.
 */

public class HeaderMediaRequest {
    @SerializedName("request_id")
    @Expose
    public String requestId;
    @SerializedName("app_version")
    @Expose
    public String appVersion;
    @SerializedName("crew_id")
    @Expose
    public String crewId;
    @SerializedName("wpr_token")
    @Expose
    public String wprToken;
}
