package sample.model;

public class UserInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_id
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.password
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.organization_name
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    private String organizationName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.enabled
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    private Boolean enabled;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_id
     *
     * @return the value of user_info.user_id
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_id
     *
     * @param userId the value for user_info.user_id
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.password
     *
     * @return the value of user_info.password
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.password
     *
     * @param password the value for user_info.password
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.organization_name
     *
     * @return the value of user_info.organization_name
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.organization_name
     *
     * @param organizationName the value for user_info.organization_name
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.enabled
     *
     * @return the value of user_info.enabled
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.enabled
     *
     * @param enabled the value for user_info.enabled
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}