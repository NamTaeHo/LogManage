package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;
import java.util.EnumMap;

@Getter
public enum SexType {
    SEX_TYPE_MAN("남자"),
    SEX_TYPE_WOMAN("여자");

    private String krName;

    SexType(String krName) {
        this.krName = krName;
    }

    public static SexType ofString(String sexType) {
        return Arrays.stream(SexType.values())
                .filter( v -> v.getKrName().equals(sexType))
                .findAny()
                .orElse(null);
    }
}
