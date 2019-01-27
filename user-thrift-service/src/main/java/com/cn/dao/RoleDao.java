package com.cn.dao;

import com.cn.thrift.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Project: manager
 * Created by admin on 2019/1/2 14:20
 */

public interface RoleDao extends JpaRepository<Role, String> {

    Role findByRoleId(String roleId);

    List<Role> findByCompanyId(String companyId);

    void deleteByRoleId(String roleId);

}
