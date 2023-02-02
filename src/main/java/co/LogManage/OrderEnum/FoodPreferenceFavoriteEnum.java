package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum FoodPreferenceFavoriteEnum {
    FOOD_PREFERENCE_FAVORITE_EXIST("있어"),
    FOOD_PREFERENCE_FAVORITE_NONE("없어");

    private String krName;

    FoodPreferenceFavoriteEnum(String krName) {
        this.krName = krName;
    }

    public static FoodPreferenceFavoriteEnum ofString(String foodPreferenceFavoriteType) {
        return Arrays.stream(FoodPreferenceFavoriteEnum.values())
                .filter( v -> v.getKrName().equals(foodPreferenceFavoriteType))
                .findAny()
                .orElse(null);
    }
}
