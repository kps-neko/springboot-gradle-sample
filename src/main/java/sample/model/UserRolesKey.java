package sample.model;

public class UserRolesKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_roles.user_id
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_roles.role
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    private String role;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_roles.user_id
     *
     * @return the value of user_roles.user_id
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_roles.user_id
     *
     * @param userId the value for user_roles.user_id
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_roles.role
     *
     * @return the value of user_roles.role
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_roles.role
     *
     * @param role the value for user_roles.role
     *
     * @mbggenerated Fri Nov 13 14:46:54 JST 2015
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}