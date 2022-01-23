package cn.itcast.managementcore.generator.core;

import cn.itcast.managementcore.generator.core.BehaviorLog;
import cn.itcast.managementcore.generator.core.BehaviorLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BehaviorLogMapper {
    long countByExample(BehaviorLogExample example);

    int deleteByExample(BehaviorLogExample example);

    int deleteByPrimaryKey(Long behaviorLogId);

    int insert(BehaviorLog record);

    int insertSelective(BehaviorLog record);

    List<BehaviorLog> selectByExample(BehaviorLogExample example);

    BehaviorLog selectByPrimaryKey(Long behaviorLogId);

    int updateByExampleSelective(@Param("record") BehaviorLog record, @Param("example") BehaviorLogExample example);

    int updateByExample(@Param("record") BehaviorLog record, @Param("example") BehaviorLogExample example);

    int updateByPrimaryKeySelective(BehaviorLog record);

    int updateByPrimaryKey(BehaviorLog record);
}