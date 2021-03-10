package edu.hawaii.its.api.type;

public class RemoveMemberResult {
    private boolean userWasRemoved;
    private String pathOfRemoved;
    private String name;
    private String uhUuid;
    private String uid;
    private String result;
    private String userIdentifier;

    // Constructor
    public RemoveMemberResult() {
    }

    // Constructor
    public RemoveMemberResult(boolean userWasRemoved, String pathOfRemoved, String name, String uhUuid, String uid,
            String result, String userIdentifier) {
        this.userWasRemoved = userWasRemoved;
        this.pathOfRemoved = pathOfRemoved;
        this.name = name;
        this.uhUuid = uhUuid;
        this.uid = uid;
        this.result = result;
        this.userIdentifier = userIdentifier;
    }

    // Constructor
    public RemoveMemberResult(String userIdentifier, String result) {
        this.userIdentifier = userIdentifier;
        this.result = result;
    }

    public boolean isUserWasRemoved() {
        return userWasRemoved;
    }

    public String getPathOfRemoved() {
        return pathOfRemoved;
    }

    public void setPathOfRemoved(String pathOfRemoved) {
        this.pathOfRemoved = pathOfRemoved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUhUuid() {
        return uhUuid;
    }

    public void setUhUuid(String uhUuid) {
        this.uhUuid = uhUuid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getUserIdentifier() {
        return userIdentifier;
    }

    public void setUserIdentifier(String userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    @Override public String toString() {
        return "RemoveMemberResult{" +
                "userWasRemoved=" + userWasRemoved +
                ", pathOfRemoved='" + pathOfRemoved + '\'' +
                ", name='" + name + '\'' +
                ", uhUuid='" + uhUuid + '\'' +
                ", uid='" + uid + '\'' +
                ", result='" + result + '\'' +
                ", userIdentifier='" + userIdentifier + '\'' +
                '}';
    }
}
