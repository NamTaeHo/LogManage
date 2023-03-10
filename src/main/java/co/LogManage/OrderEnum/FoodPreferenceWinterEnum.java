package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum FoodPreferenceWinterEnum {
    FOOD_PREFERENCE_WINTER_WARMSOUP("따듯한 국물"),
    FOOD_PREFERENCE_WINTER_SPICY("매운 음식"),
    FOOD_PREFERENCE_WINTER_WARMPLACE("따뜻한 곳이라면 상관 없다");

    private String krName;

    FoodPreferenceWinterEnum(String krName) {
        this.krName = krName;
    }

    public static FoodPreferenceWinterEnum ofString(String foodPreferenceWinterType) {
        return Arrays.stream(FoodPreferenceWinterEnum.values())
                .filter( v -> v.getKrName().equals(foodPreferenceWinterType))
                .findAny()
                .orElse(null);
    }
}
