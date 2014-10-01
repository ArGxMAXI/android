package com.argxmaxi.clases;

import org.json.JSONObject;

/**
 * Created by rhefew on 21/09/14.
 */
public class Channel {

    private int subscriptions;
    private int views;

    public Channel(String url) {
    }

    public int getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(int subscriptions) {
        this.subscriptions = subscriptions;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

}
