package co.LogManage.dto;



import co.LogManage.OrderEnum.*;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.util.Date;


@Schema
@Getter
@Setter
@NoArgsConstructor
public class OrderData implements Log {

    @Schema
    private String Note;

    @Schema
    @NotBlank
    private Integer OrderId;

    @Schema
    private Date OrderDate;

    @Schema
    @NotBlank
    private DiningTypeEnum DiningType;

    @Schema
    @NotBlank
    private Integer UserId;

    @Schema
    @NotNull
    private String UserName;

    @Schema
    @NotBlank
    private Integer GroupId;

    @Schema
    @NotNull
    private String GroupName;

    @Schema
    @NotBlank
    private Integer SpotId;

    @Schema
    @NotNull
    private String SpotName;

    @Schema
    private SexEnum Sex;

    @Schema
    private BornPlaceEnum BornPlace;

    @Schema
    private Integer BirthDate;

    @Schema
    private NightEatPerWeekEnum NightEatPerWeek;

    @Schema
    private WorkOutPerWeekEnum WorkOutPerWeek;

    @Schema
    private DrinkPerWeekEnum DrinkPerWeek;

    @Schema
    private FoodPreferenceCountryEnum FoodPreferenceCountry;

    @Schema
    private FoodPreferenceRainEnum FoodPreferenceRain;

    @Schema
    private FoodPreferenceWinterEnum FoodPreferenceWinter;

    @Schema
    private FoodPreferenceFriendEnum FoodPreferenceFriend;

    @Schema
    private FoodPreferenceFavoriteEnum FoodPreferenceFavorite;

    @Schema
    private FoodPreferenceRestaurantEnum FoodPreferenceRestaurant;

    @Schema
    private FoodPreferenceQuantityQualityEnum FoodPreferenceQuantityQuality;

    @Schema
    @NotBlank
    private Integer FoodId;

    @Schema
    @NotNull
    private String FoodName;

    @Schema
    private Integer OrderCount;

    @Schema
    private Integer OrderCost;

    @Schema
    @NotBlank
    private Integer MakersId;

    @Schema
    @NotNull
    private String MakersName;

    @Schema
    private String[] FoodTag = new String[40];

    public void SetOrderData(XSSFSheet Sheet, Integer i){

        Integer j;

        for (Cell Cell:Sheet.getRow(i)){

            j = Cell.getColumnIndex();

            if (j <= 0) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                Note = Cell.getStringCellValue();
            } else if (j <= 1) {
                OrderId = (int) Cell.getNumericCellValue();
            } else if (j <= 2) {
                OrderDate = Cell.getDateCellValue();
            } else if (j <= 3) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                DiningType = DiningTypeEnum.ofString(Cell.getStringCellValue());
            } else if (j <= 4) {
                UserId = (int) Cell.getNumericCellValue();
            } else if (j <= 5) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                UserName = Cell.getStringCellValue();
            } else if (j <= 6) {
                GroupId = (int) Cell.getNumericCellValue();
            } else if (j <= 7) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                GroupName = Cell.getStringCellValue();
            } else if (j <= 8) {
                SpotId = (int) Cell.getNumericCellValue();
            } else if (j <= 9) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                SpotName = Cell.getStringCellValue();
            } else if (j <= 10) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                Sex = SexEnum.ofString(Cell.getStringCellValue());
            } else if (j <= 11) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                BornPlace = BornPlaceEnum.ofString(Cell.getStringCellValue());
            } else if (j <= 12) {
                BirthDate = (int) Cell.getNumericCellValue();
            } else if (j <= 13) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                NightEatPerWeek = NightEatPerWeekEnum.ofString(Cell.getStringCellValue());
            } else if (j <= 14) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                WorkOutPerWeek = WorkOutPerWeekEnum.ofString(Cell.getStringCellValue());
            } else if (j <= 15) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                DrinkPerWeek = DrinkPerWeekEnum.ofString(Cell.getStringCellValue());
            } else if (j <= 16) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                FoodPreferenceCountry = FoodPreferenceCountryEnum.ofString(Cell.getStringCellValue());
            } else if (j <= 17) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                FoodPreferenceRain = FoodPreferenceRainEnum.ofString(Cell.getStringCellValue());
            } else if (j <= 18) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                FoodPreferenceWinter = FoodPreferenceWinterEnum.ofString(Cell.getStringCellValue());
            } else if (j <= 19) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                FoodPreferenceFriend = FoodPreferenceFriendEnum.ofString(Cell.getStringCellValue());
            } else if (j <= 20) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                FoodPreferenceFavorite = FoodPreferenceFavoriteEnum.ofString(Cell.getStringCellValue());
            } else if (j <= 21) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                FoodPreferenceRestaurant = FoodPreferenceRestaurantEnum.ofString(Cell.getStringCellValue());
            } else if (j <= 22) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                FoodPreferenceQuantityQuality = FoodPreferenceQuantityQualityEnum.ofString(Cell.getStringCellValue());
            } else if (j <= 23) {
                FoodId = (int) Cell.getNumericCellValue();
            } else if (j <= 24) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                FoodName = Cell.getStringCellValue();
            } else if (j <= 25) {
                OrderCount = (int) Cell.getNumericCellValue();
            } else if (j <= 26) {
                OrderCost = (int) Cell.getNumericCellValue();
            } else if (j <= 27) {
                MakersId = (int) Cell.getNumericCellValue();
            } else if (j <= 28) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                MakersName = Cell.getStringCellValue();
            } else if (j <= 68) {
                Sheet.getRow(i).getCell(j).setCellType(CellType.STRING);
                FoodTag[j - 29] = Cell.getStringCellValue();
            }
        }
    }
}
