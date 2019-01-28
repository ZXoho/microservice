package com.cn.dao;

import com.cn.thrift.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zxoho
 * @date 19-1-9 下午2:14
 */
@Repository
public interface UserDao extends JpaRepository<User, String> {

    List<User> findUsersByCompanyId(String companyId);

    User findByCompanyIdAndUserId(String companyId, String userId);

    void deleteByCompanyIdAndUserId(String companyId, String userId);

}
