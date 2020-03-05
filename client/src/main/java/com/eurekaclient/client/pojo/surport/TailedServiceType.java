package com.eurekaclient.client.pojo.surport;

public enum TailedServiceType {

    PROCESS(1,"tailProcessServiceImpl"),
    SUBSCRIBE(2,"tailSubscribeServiceImpl"),
    SUCCEED(3,"tailSucceedServiceImpl"),
    FAILED(4,"tailFailedServiceImpl");

    private Integer key;
    private String value;

    TailedServiceType(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    /**
     * 通过index获取enmu对象
     *
     * @param oridal
     * @return
     */
    public static TailedServiceType get(Integer oridal) {
        for (TailedServiceType dot : TailedServiceType.values()) {
            if (oridal == dot.ordinal()) {
                return dot;
            }
        }
        throw new RuntimeException("not found TailedServiceType");
    }

    /**
     * 通过key获取enmu对象
     *
     * @return
     */
    public static TailedServiceType getByKey(Integer key) {
        for (TailedServiceType dot : TailedServiceType.values()) {
            if (dot.getKey().intValue() == key) {
                return dot;
            }
        }
        throw new RuntimeException("not found TailedServiceType");
    }

    /**
     * 通过key获取值
     * @param key
     * @return
     */
    public static String getValueByKey(Integer key) {
        for (TailedServiceType dot : TailedServiceType.values()) {
            if (dot.getKey().intValue() == key) {
                return dot.getValue();
            }
        }
        throw new RuntimeException("not found value");
    }
}
