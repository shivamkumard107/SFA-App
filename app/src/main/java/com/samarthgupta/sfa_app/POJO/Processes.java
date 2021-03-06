package com.samarthgupta.sfa_app.POJO;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by samarthgupta on 11/10/17.
 */

public class Processes {

    @SerializedName("A")
    @Expose
    private Progress A;

    @SerializedName("B")
    @Expose
    private Progress B;

    public Processes(Progress a, Progress b) {
        A = a;
        B = b;
    }

    public Progress getA() {
        return A;
    }

    public void setA(Progress a) {
        A = a;
    }

    public Progress getB() {
        return B;
    }

    public void setB(Progress b) {
        B = b;
    }
}
