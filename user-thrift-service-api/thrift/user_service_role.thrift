namespace java com.cn.thrift.role

struct Role {
    1:string roleId;
    2:string companyId;
    3:string roleName;
    4:string rolePermission;
    5:string rolePhone;
    6:string rolePassword
}

service RoleService {
    Role findRole(1:string roleId);

    list<Role> findAllRoles(1:string companyId);

    void indexRole(1:Role role);

    void deleteRole(1:string roleId)
}