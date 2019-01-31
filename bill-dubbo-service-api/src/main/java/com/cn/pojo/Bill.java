package com.cn.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * @author zxoho
 * @date 19-1-10 下午2:43
 */

@Entity
@Data
public class Bill {

    /** 账单号
     *  物业id + 年月 +用户id
     */
    @Id
    @Excel(name = "账单号", orderNum = "0")
    private String billId;

    /** 物业Id */
    @Excel(name = "公司编号", orderNum = "1")
    private String companyId;

    /** 用户id */
    @Excel(name = "用户号", orderNum = "2")
    private String userId;

    /** 用户名 */
    @Excel(name = "用户名", orderNum = "3")
    private String userName;

    /** 账单年月
     * yymm
     */
    @Excel(name = "账单日期", orderNum = "4")
    private String billDate;

    /** 水费 */
    @Excel(name = "水费", orderNum = "5")
    private Double waterCost;

    /** 电费 */
    @Excel(name = "电费", orderNum = "6")
    private Double electricCost;

    /** 气费 */
    @Excel(name = "气费", orderNum = "7")
    private Double gasCost;

    /** 物业费 */
    @Excel(name = "物业费", orderNum = "8")
    private Double propertyCost;

    /** 总计 */
    @Excel(name = "总计", orderNum = "9")
    private Double totalCost;

    /** 账单状态
     * 0 未支付
     * 1 已支付
     */
    @Excel(name = "订单状态", orderNum = "10")
    private Integer billStatus;
}
