package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum FoodPreferenceRainType {
    FOOD_PREFERENCE_RAIN_PUB("술집"),
    FOOD_PREFERENCE_RAIN_GUKBAB("국밥집"),
    FOOD_PREFERENCE_RAIN_RESTAURANT("레스토랑"),
    FOOD_PREFERENCE_RAIN_CLEAN("깔끔한 곳이라면 상관 없다");

    private String krName;

    FoodPreferenceRainType(String krName) {
        this.krName = krName;
    }

    public static FoodPreferenceRainType ofString(String foodPreferenceRainType) {
        return Arrays.stream(FoodPreferenceRainType.values())
                .filter( v -> v.getKrName().equals(foodPreferenceRainType))
                .findAny()
                .orElse(null);
    }
}
