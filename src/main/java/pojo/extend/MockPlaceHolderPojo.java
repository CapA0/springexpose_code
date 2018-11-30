package pojo.extend;

/**
 * 用于测试PropertyPlaceHolderConfigurer的对象
 */
public class MockPlaceHolderPojo {
    private String value1;
    private String value2;

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public String getValue2() {
        return value2;
    }

    public void setValue2(String value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "value1:" + value1.toString() + "value2:" + value2.toString();
    }
}
