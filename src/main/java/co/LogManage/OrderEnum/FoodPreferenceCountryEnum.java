package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;
@Getter
public enum FoodPreferenceCountryEnum {
    FOOD_PREFERENCE_COUNTRY_KOREAN ("한식"),
    FOOD_PREFERENCE_COUNTRY_CHINESE ("중식"),
    FOOD_PREFERENCE_COUNTRY_JAPANESE ("일식"),
    FOOD_PREFERENCE_COUNTRY_WESTERN("양식"),
    FOOD_PREFERENCE_COUNTRY_SOUTHEASTASIA("동남아");

    private String krName;
    FoodPreferenceCountryEnum(String krName){
        this.krName = krName;
    }

    public static FoodPreferenceCountryEnum ofString(String foodPreferenceCountryType) {
        return Arrays.stream(FoodPreferenceCountryEnum.values())
                .filter( v -> v.getKrName().equals(foodPreferenceCountryType))
                .findAny()
                .orElse(null);
    }
}
