package jjtorri.webviewapp;


import android.webkit.JavascriptInterface;

import org.json.JSONException;
import org.json.JSONObject;

import lombok.Data;

@Data
public class AndroidId {

    private String id;

    public AndroidId(String id) {
        this.id = id;
    }

    @JavascriptInterface
    public String toJson() {
        JSONObject json = new JSONObject();
        try {
            json.put("id", this.id);
        } catch (JSONException e) {
            //no hacemos nada
        }
        return json.toString();
    }

}
