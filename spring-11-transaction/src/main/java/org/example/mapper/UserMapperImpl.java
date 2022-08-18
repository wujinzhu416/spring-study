package org.example.mapper;

import org.example.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{

    //我们的所有操作，原来都使用sqlSession来执行，现在都使用sqlSessionTemplate
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        User user1 = new User(2, "小王", "advcf");
        User user2 = new User(3, "大王", "222advcf");
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(user1);
        mapper.addUser(user2);
        mapper.deleteUser(2);

        return mapper.selectUser();
    }

    @Override
    public int addUser(User user) {
        return sqlSession.getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return sqlSession.getMapper(UserMapper.class).deleteUser(id);
    }
}
