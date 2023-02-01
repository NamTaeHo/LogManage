package co.LogManage.dto;



import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.security.PrivateKey;
import java.text.DateFormat;
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
    private String DiningType;

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
    private String Sex;

    @Schema
    private String BornPlace;

    @Schema
    private Integer BirthDate;

    @Schema
    private String[] Preference = new String[10];

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
                Note = Cell.getStringCellValue();
            } else if (j <= 1) {
                OrderId = (int) Cell.getNumericCellValue();
            } else if (j <= 2) {
                OrderDate = Cell.getDateCellValue();
            } else if (j <= 3) {
                DiningType = Cell.getStringCellValue();
            } else if (j <= 4) {
                UserId = (int) Cell.getNumericCellValue();
            } else if (j <= 5) {
                UserName = Cell.getStringCellValue();
            } else if (j <= 6) {
                GroupId = (int) Cell.getNumericCellValue();
            } else if (j <= 7) {
                GroupName = Cell.getStringCellValue();
            } else if (j <= 8) {
                SpotId = (int) Cell.getNumericCellValue();
            } else if (j <= 9) {
                SpotName = Cell.getStringCellValue();
            } else if (j <= 10) {
                Sex = Cell.getStringCellValue();
            } else if (j <= 11) {
                BornPlace = Cell.getStringCellValue();
            } else if (j <= 12) {
                BirthDate = (int) Cell.getNumericCellValue();
            } else if (j <= 22) {
                Preference[j - 13] = Cell.getStringCellValue();
            } else if (j <= 23) {
                FoodId = (int) Cell.getNumericCellValue();
            } else if (j <= 24) {
                FoodName = Cell.getStringCellValue();
            } else if (j <= 25) {
                OrderCount = (int) Cell.getNumericCellValue();
            } else if (j <= 26) {
                OrderCost = (int) Cell.getNumericCellValue();
            } else if (j <= 27) {
                MakersId = (int) Cell.getNumericCellValue();
            } else if (j <= 28) {
                MakersName = Cell.getStringCellValue();
            } else if (j <= 68) {
                FoodTag[j - 29] = Cell.getStringCellValue();
            }
        }
    }
}
