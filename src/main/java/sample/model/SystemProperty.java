package sample.model;

public class SystemProperty {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_property.key
     *
     * @mbggenerated Fri Nov 06 14:00:45 JST 2015
     */
    private String key;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column system_property.value
     *
     * @mbggenerated Fri Nov 06 14:00:45 JST 2015
     */
    private String value;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_property.key
     *
     * @return the value of system_property.key
     *
     * @mbggenerated Fri Nov 06 14:00:45 JST 2015
     */
    public String getKey() {
        return key;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_property.key
     *
     * @param key the value for system_property.key
     *
     * @mbggenerated Fri Nov 06 14:00:45 JST 2015
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column system_property.value
     *
     * @return the value of system_property.value
     *
     * @mbggenerated Fri Nov 06 14:00:45 JST 2015
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column system_property.value
     *
     * @param value the value for system_property.value
     *
     * @mbggenerated Fri Nov 06 14:00:45 JST 2015
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}