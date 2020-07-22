package cn.pzhu.pserson.dao.dao;

import cn.pzhu.pserson.domain.Travel;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface TravelMapper extends Mapper<Travel> {
    List<Travel> getAllByProject(String content);
}