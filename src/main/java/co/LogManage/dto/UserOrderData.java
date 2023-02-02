package co.LogManage.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema
@Getter
@Setter
@NoArgsConstructor
public class UserOrderData {

    private Integer OrderId;
    private Integer OrderDate;
    private Integer OrderCount;
    private Integer OrderCost;
    private String DiningType;
    private Integer GroupId;
    private String GroupName;
    private Integer SpotId;
    private String SpotName;

}
