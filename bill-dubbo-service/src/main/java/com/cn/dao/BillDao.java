package com.cn.dao;

import com.cn.pojo.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zxoho
 * @date 19-1-31 下午4:39
 */
@Repository
public interface BillDao extends JpaRepository<Bill, String> {

    List<Bill> findBillsByCompanyIdAndUserId(String companyId, String userId);

    List<Bill> findBillsByCompanyId(String companyId);

    List<Bill> findBillsByCompanyIdAndBillDate(String company, String billDate);

    void deleteBillByBillId(String billId);

    void deleteBillsByCompanyIdAndBillDate(String companyId, String billDate);

    Bill findBillByCompanyIdAndUserIdAndBillDate(String companyId, String userId, String billDate);
}
