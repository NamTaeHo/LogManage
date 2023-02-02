package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;
@Getter
public enum FoodPreferenceCountryType {
    FOOD_PREFERENCE_COUNTRY_KOREAN ("한식"),
    FOOD_PREFERENCE_COUNTRY_CHINESE ("중식"),
    FOOD_PREFERENCE_COUNTRY_JAPANESE ("일식"),
    FOOD_PREFERENCE_COUNTRY_WESTERN("양식"),
    FOOD_PREFERENCE_COUNTRY_SOUTHEASTASIA("동남아");

    private String krName;
    FoodPreferenceCountryType(String krName){
        this.krName = krName;
    }

    public static FoodPreferenceCountryType ofString(String foodPreferenceCountryType) {
        return Arrays.stream(FoodPreferenceCountryType.values())
                .filter( v -> v.getKrName().equals(foodPreferenceCountryType))
                .findAny()
                .orElse(null);
    }
}
