package co.LogManage.OrderEnum;


import lombok.Getter;

import java.util.Arrays;

@Getter
public enum BornPlaceType {
    BORN_PLACE_TYPE_SEOUL("서울"),
    BORN_PLACE_TYPE_INCHEON("인천"),
    BORN_PLACE_TYPE_DAEJEON("대전"),
    BORN_PLACE_TYPE_DAEGU("대구"),
    BORN_PLACE_TYPE_ULSAN("울산"),
    BORN_PLACE_TYPE_BUSAN("부산"),
    BORN_PLACE_TYPE_QWANGJU("광주"),
    BORN_PLACE_TYPE_SEJONG("세종"),
    BORN_PLACE_TYPE_GYUNGGI("경기"),
    BORN_PLACE_TYPE_GANGWON("강원"),
    BORN_PLACE_TYPE_CHUNGBUK("충북"),
    BORN_PLACE_TYPE_CHUNGNAM("충남"),
    BORN_PLACE_TYPE_JEONBUK("전북"),
    BORN_PLACE_TYPE_JEONNAM("전남"),
    BORN_PLACE_TYPE_GYUNGBUK("경북"),
    BORN_PLACE_TYPE_GYUNGNAM("경남"),
    BORN_PLACE_TYPE_JEJU("제주"),
    BORN_PLACE_TYPE_ETC("기타");

    private String krName;

    BornPlaceType(String krName) {
        this.krName = krName;
    }

    public static BornPlaceType ofString(String bornPlaceType) {
        return Arrays.stream(BornPlaceType.values())
                .filter( v -> v.getKrName().equals(bornPlaceType))
                .findAny()
                .orElse(null);
    }
}