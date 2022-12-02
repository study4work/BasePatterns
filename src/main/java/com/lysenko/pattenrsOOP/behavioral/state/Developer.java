package com.lysenko.pattenrsOOP.behavioral.state;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if(activity instanceof Coding) {
            setActivity(new Reading());
        } else if(activity instanceof Reading) {
            setActivity(new Training());
        } else if(activity instanceof Training) {
            setActivity(new Coding());
        }
    }

    public void jusDoIt() {
        activity.justDoIt();
    }

}
