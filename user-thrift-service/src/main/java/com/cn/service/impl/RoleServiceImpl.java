package com.cn.service.impl;

import com.cn.dao.RoleDao;
import com.cn.thrift.role.Role;
import com.cn.thrift.role.RoleService;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author zxoho
 * @date 19-1-27 下午3:41
 */
public class RoleServiceImpl implements RoleService.Iface {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findRole(String roleId) throws TException {
        return roleDao.findByRoleId(roleId);
    }

    @Override
    public List<Role> findAllRoles(String companyId) throws TException {
        return roleDao.findByCompanyId(companyId);
    }

    @Override
    public void indexRole(Role role) throws TException {
        roleDao.save(role);
    }

    @Override
    public void deleteRole(String roleId) throws TException {
        roleDao.deleteByRoleId(roleId);
    }
}
