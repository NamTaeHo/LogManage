package co.LogManage.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.ArrayList;

@Schema
@Getter
@Setter
@NoArgsConstructor
public class OrderDataList {

    @Schema
    private OrderData[] OrderData;

    public void SetOrderDataList(XSSFSheet Sheet, Integer AnalyzeRowCount, Integer LastRowNum) {
        this.OrderData = new OrderData[AnalyzeRowCount];
        Integer RowGap = LastRowNum - AnalyzeRowCount;
        for (Integer i = 0;i<AnalyzeRowCount;i++){
            if(i > 0) {
                this.OrderData[i-1] = new OrderData();
                this.OrderData[i-1].SetOrderData(Sheet, i+RowGap);
            }
        }
    }
}
