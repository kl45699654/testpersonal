package cn.pzhu.pserson.service.impl;

import cn.pzhu.pserson.dao.dao.TravelMapper;
import cn.pzhu.pserson.domain.Travel;
import cn.pzhu.pserson.domain.response.TravelResDTO;
import cn.pzhu.pserson.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TravelServiceImpl implements TravelService {

    @Autowired
    private TravelMapper mapper;
    @Override
    public List<Travel> getprojectList(String content) {
        List<Travel> allByProject = mapper.getAllByProject(content);
        return allByProject;
    }
}
