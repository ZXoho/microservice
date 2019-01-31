package com.cn.service.impl;

import com.cn.dao.BillDao;
import com.cn.pojo.Bill;
import com.cn.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zxoho
 * @date 19-1-31 下午4:56
 */
@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillDao billDao;

    @Override
    public void addBill(Bill bill) {
        billDao.save(bill);
    }

    @Override
    public List<Bill> findBills(String companyId, String userId) {
        List<Bill> result = billDao.findBillsByCompanyIdAndUserId(companyId, userId);
        return result;
    }

    @Override
    public List<Bill> findAllBills(String companyId) {
        List<Bill> rsult = billDao.findBillsByCompanyId(companyId);
        return rsult;
    }

    @Override
    public Bill findOne(String companyId, String userId, String billDate) {
        Bill result = billDao.findBillByCompanyIdAndUserIdAndBillDate(companyId, userId, billDate);
        return result;
    }

    @Override
    public List<Bill> findMouthBills(String companyId, String billDate) {
        List<Bill> result = billDao.findBillsByCompanyIdAndBillDate(companyId, billDate);
        return null;
    }

    @Override
    public void deleteOne(String billId) {
        billDao.deleteBillByBillId(billId);
    }

    @Override
    public void deleteBills(String companyId, String billDate) {
        billDao.deleteBillsByCompanyIdAndBillDate(companyId, billDate);
    }
}
