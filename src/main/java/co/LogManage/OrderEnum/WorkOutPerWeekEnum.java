package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum WorkOutPerWeekEnum {
    WORK_OUT_PER_WEEK_NONE_TO_ONCE("주 1회 이하"),
    WORK_OUT_PER_WEEK_TWICE_TO_THREETIMES("주 2-3회"),
    WORK_OUT_PER_WEEK_FOURTIME_TO_OVER("주 4회 이상");

    private String krName;

    WorkOutPerWeekEnum(String krName) {
        this.krName = krName;
    }

    public static WorkOutPerWeekEnum ofString(String workOutPerWeekType) {
        return Arrays.stream(WorkOutPerWeekEnum.values())
                .filter( v -> v.getKrName().equals(workOutPerWeekType))
                .findAny()
                .orElse(null);
    }
}
