package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum NightEatPerWeekType {
    NIGHT_EAT_PER_WEEK_NONE_TO_ONCE("주 1회 이하"),
    NIGHT_EAT_PER_WEEK_TWICE_TO_THREETIMES("주 2-3회"),
    NIGHT_EAT_PER_WEEK_FOURTIME_TO_OVER("주 4회 이상");

    private String krName;

    NightEatPerWeekType(String krName) {
        this.krName = krName;
    }

    public static NightEatPerWeekType ofString(String nightEatPerWeekType) {
        return Arrays.stream(NightEatPerWeekType.values())
                .filter( v -> v.getKrName().equals(nightEatPerWeekType))
                .findAny()
                .orElse(null);
    }
}
