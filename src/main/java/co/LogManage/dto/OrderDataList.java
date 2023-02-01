package co.LogManage.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

@Schema
@Getter
@Setter
@NoArgsConstructor
public class OrderDataList {

    @Schema
    ArrayList<Log> OrderData= new ArrayList<>();

    public void SetOrderDataList(OrderData OrderData) {
        this.OrderData.add(OrderData);
    }
}
