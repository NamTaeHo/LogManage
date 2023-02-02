package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;
@Getter
public enum DrinkPerWeekType {
    DRINK_PER_WEEK_NONE_TO_ONCE("주 1회 이하"),
    DRINK_PER_WEEK_TWICE_TO_THREETIMES("주 2-3회"),
    DRINK_PER_WEEK_FOURTIME_TO_OVER("주 4회 이상");

    private String krName;

    DrinkPerWeekType(String krName) {
        this.krName = krName;
    }



    public static DrinkPerWeekType ofString(String drinkPerDayType) {
        return Arrays.stream(DrinkPerWeekType.values())
                .filter( v -> v.getKrName().equals(drinkPerDayType))
                .findAny()
                .orElse(null);
    }
}
