package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum DiningType {
    DINING_TYPE_COMPANY("기업중식"),
    DINING_TYPE_APARTMENT("아파트조식");

    private String krName;

    DiningType(String krName) {
        this.krName = krName;
    }

    public static DiningType ofString(String diningType) {
        return Arrays.stream(DiningType.values())
                .filter( v -> v.getKrName().equals(diningType))
                .findAny()
                .orElse(null);
    }

}
