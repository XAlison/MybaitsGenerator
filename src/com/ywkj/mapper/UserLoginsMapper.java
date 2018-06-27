package com.ywkj.mapper;

import com.ywkj.pojo.UserLogins;
import com.ywkj.pojo.UserLoginsExample;
import com.ywkj.pojo.UserLoginsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLoginsMapper {
    long countByExample(UserLoginsExample example);

    int deleteByExample(UserLoginsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLoginsWithBLOBs record);

    int insertSelective(UserLoginsWithBLOBs record);

    List<UserLoginsWithBLOBs> selectByExampleWithBLOBs(UserLoginsExample example);

    List<UserLogins> selectByExample(UserLoginsExample example);

    UserLoginsWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLoginsWithBLOBs record, @Param("example") UserLoginsExample example);

    int updateByExampleWithBLOBs(@Param("record") UserLoginsWithBLOBs record, @Param("example") UserLoginsExample example);

    int updateByExample(@Param("record") UserLogins record, @Param("example") UserLoginsExample example);

    int updateByPrimaryKeySelective(UserLoginsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserLoginsWithBLOBs record);

    int updateByPrimaryKey(UserLogins record);
}