package co.LogManage.OrderEnum;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum FoodPreferenceFriendType {
    FOOD_PREFERENCE_FRIEND_OWN("친구가 골라주는 편이다"),
    FOOD_PREFERENCE_FRIEND_RECOMMEND("내가 직접 골라야지");

    private String krName;

    FoodPreferenceFriendType(String krName) {
        this.krName = krName;
    }

    public static FoodPreferenceFriendType ofString(String foodPreferenceFriendType) {
        return Arrays.stream(FoodPreferenceFriendType.values())
                .filter( v -> v.getKrName().equals(foodPreferenceFriendType))
                .findAny()
                .orElse(null);
    }
}
