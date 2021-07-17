package com.kevin.datastruct.enums;

/**
 * 药品二级分类的枚举
 * @author chenligeng
 */
public enum SecondDrugEnum {

    C1(1,"地平类",""),
    C2(2,"利尿类",""),
    C3(3,"洛尔类",""),
    C4(4,"普利类",""),
    C5(5,"沙坦类",""),
    C6(6,"唑嗪类",""),
    C7(7,"ACEI+D",""),
    C8(8,"ARB+D",""),
    C9(9,"ACEL+C",""),
    C10(10,"ARB+C",""),
    C11(11,"C+B",""),
    C12(12,"传统SPC",""),
    C13(13,"其他","");

    private Integer code;
    private String name;
    private String desc;




    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    SecondDrugEnum(Integer code, String name, String desc) {
        this.code = code;
        this.name = name;
        this.desc = desc;
    }

    public static SecondDrugEnum getByCode(Integer code) {
        SecondDrugEnum[] values = SecondDrugEnum.values();
        for (SecondDrugEnum value : values) {
            if (value.code.equals(code)) {
                return value;
            }
        }
        return null;
    }
}
