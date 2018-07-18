package com.example.tourjapan;

import java.util.HashMap;

public class Secret {
    /**
     * Private member variables to hold secret title
     */
    private String mSecretTitle, mSecretLocation;

    /**
     * Create a new Secret object storing the secret title
     * @param secretTitle
     */
    public Secret(String secretTitle, String secretLocation) {
        mSecretTitle = secretTitle;
        mSecretLocation = secretLocation;
    }

    public String getSecretTitle() {
        return mSecretTitle;
    }
    public String getSecretLocation() {
        return mSecretLocation;
    }

}
