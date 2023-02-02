package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum DiningTypeEnum {
    DINING_TYPE_COMPANY("기업중식"),
    DINING_TYPE_APARTMENT("아파트조식");

    private String krName;

    DiningTypeEnum(String krName) {
        this.krName = krName;
    }

    public static DiningTypeEnum ofString(String diningType) {
        return Arrays.stream(DiningTypeEnum.values())
                .filter( v -> v.getKrName().equals(diningType))
                .findAny()
                .orElse(null);
    }

}
