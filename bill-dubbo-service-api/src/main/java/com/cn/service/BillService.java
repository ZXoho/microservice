package com.cn.service;

import com.cn.pojo.Bill;

import java.util.List;

/**
 * @author zxoho
 * @date 19-1-31 下午4:25
 */
public interface BillService {

    /** 添加账单 */
    void addBill(Bill bill);

    /** 查看账单 */
    List<Bill> findBills(String companyId, String userId);

    /** 查看所有账单 */
    List<Bill> findAllBills(String companyId);

    /** 查看当月账单 */
    Bill findOne(String companyId, String userId, String billDate);

    /** 查看当月所有账单 */
    List<Bill> findMouthBills(String companyId, String billDate);

    /**  删除账单 */
    void deleteOne(String billId);

    /** 删除账单 */
    void deleteBills(String companyId, String BillDate);
}
