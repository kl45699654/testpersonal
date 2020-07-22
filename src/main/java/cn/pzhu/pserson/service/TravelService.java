package cn.pzhu.pserson.service;

import cn.pzhu.pserson.domain.Job;
import cn.pzhu.pserson.domain.Recruit;
import cn.pzhu.pserson.domain.Travel;
import cn.pzhu.pserson.domain.response.RecruitResDTO;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TravelService {

  /**
   * 通过project查看所有
   * @param content
   * @return
   */
  List<Travel> getprojectList(String content);



}
