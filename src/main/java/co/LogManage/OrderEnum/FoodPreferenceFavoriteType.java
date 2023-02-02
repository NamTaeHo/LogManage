package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum FoodPreferenceFavoriteType {
    FOOD_PREFERENCE_FAVORITE_EXIST("있어"),
    FOOD_PREFERENCE_FAVORITE_NONE("없어");

    private String krName;

    FoodPreferenceFavoriteType(String krName) {
        this.krName = krName;
    }

    public static FoodPreferenceFavoriteType ofString(String foodPreferenceFavoriteType) {
        return Arrays.stream(FoodPreferenceFavoriteType.values())
                .filter( v -> v.getKrName().equals(foodPreferenceFavoriteType))
                .findAny()
                .orElse(null);
    }
}
