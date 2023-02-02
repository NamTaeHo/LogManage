package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum FoodPreferenceRestaurantEnum {
    FOOD_PREFERENCE_RESTAURANT_OFTEN("찾아다녀"),
    FOOD_PREFERENCE_RESTAURANT_SELDOM("가끔 찾아다닌다"),
    FOOD_PREFERENCE_RESTAURANT_NEVER("딱히 찾아서 먹진 않는다");

    private String krName;

    FoodPreferenceRestaurantEnum(String krName) {
        this.krName = krName;
    }

    public static FoodPreferenceRestaurantEnum ofString(String foodPreferenceRestaurantType) {
        return Arrays.stream(FoodPreferenceRestaurantEnum.values())
                .filter( v -> v.getKrName().equals(foodPreferenceRestaurantType))
                .findAny()
                .orElse(null);
    }
}
