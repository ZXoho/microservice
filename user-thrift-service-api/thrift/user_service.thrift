namespace java com.cn.thrift.user

struct User {
    1:string userId;
    2:string userName;
    3:string companyId;
    4:string userPassword
}


service UserService {
    list<User> findAllUsers(1:string companyId)

    User findOne(1:string userId, 2:string companyId);

    void indexUser(1:User user);

    void deleteUser(1:string userId, 2:string companyId);

}
