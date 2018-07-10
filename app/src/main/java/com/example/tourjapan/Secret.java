package com.example.tourjapan;

public class Secret {
    /**
     * Private member variables to hold secret title
     */
    private String mSecretTitle;

    /**
     * Create a new Secret object storing the secret title
     * @param secretTitle
     */
    public Secret(String secretTitle) {
        mSecretTitle = secretTitle;
    }

    public String getSecretTitle() {
        return mSecretTitle;
    }
}
