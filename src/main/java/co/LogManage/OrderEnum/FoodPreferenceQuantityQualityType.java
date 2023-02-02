package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum FoodPreferenceQuantityQualityType {
    FOOD_PREFERENCE_QUANTITY_QUALITY_QUANTITY("적당히 맛있다면 양많이"),
    FOOD_PREFERENCE_QUANTITY_QUALITY_QUALITY("양이 적어도 맛있는 음식");

    private String krName;

    FoodPreferenceQuantityQualityType(String krName) {
        this.krName = krName;
    }

    public static FoodPreferenceQuantityQualityType ofString(String foodPreferenceQuantityQualityType) {
        return Arrays.stream(FoodPreferenceQuantityQualityType.values())
                .filter( v -> v.getKrName().equals(foodPreferenceQuantityQualityType))
                .findAny()
                .orElse(null);
    }
}
