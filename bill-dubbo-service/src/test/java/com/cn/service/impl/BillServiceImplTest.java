package com.cn.service.impl;

import com.cn.dao.BillDao;
import com.cn.pojo.Bill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author zxoho
 * @date 19-1-31 下午6:03
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BillServiceImplTest {

    @Autowired
    private BillDao billDao;

    @Test
    public void addBill() {
    }

    @Test
    public void findBills() {
        List<Bill> result = billDao.findBillsByCompanyIdAndUserId("5133", "5133081203");
        System.out.println(result);
    }

    @Test
    public void findAllBills() {
    }

    @Test
    public void findOne() {
    }

    @Test
    public void findMouthBills() {
    }

    @Test
    public void deleteOne() {
    }

    @Test
    public void deleteBills() {
    }
}