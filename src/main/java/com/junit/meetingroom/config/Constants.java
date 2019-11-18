package com.junit.meetingroom.config;

/**
 * Application constants.
 */
public final class Constants {

    // Regex for acceptable logins
    public static final String LOGIN_REGEX = "^[_'.@A-Za-z0-9-]*$";

    public static final String SPRING_PROFILE_LOCAL = "local";
    public static final String SPRING_PROFILE_DEVELOPMENT = "dev";
    public static final String SPRING_PROFILE_STAGE = "stage";
    public static final String SPRING_PROFILE_PRODUCTION = "aws";

    public static final String SYSTEM_ACCOUNT = "system";
    public static final String ANONYMOUS_USER = "anonymousUser";

    public static final String CBP_STATUS_NEW_CUSTOMER = "n";
    
    private Constants() {
    }
}
