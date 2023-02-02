package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum SexEnum {
    SEX_TYPE_MAN("남자"),
    SEX_TYPE_WOMAN("여자");

    private String krName;

    SexEnum(String krName) {
        this.krName = krName;
    }

    public static SexEnum ofString(String sexType) {
        return Arrays.stream(SexEnum.values())
                .filter( v -> v.getKrName().equals(sexType))
                .findAny()
                .orElse(null);
    }
}
