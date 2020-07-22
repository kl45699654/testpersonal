package cn.pzhu.pserson.controller;

import cn.pzhu.pserson.domain.Travel;
import cn.pzhu.pserson.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("person_manage/tavel")
public class TravelController {

    @Autowired
    private TravelService travelService;

    @RequestMapping(value = "/list/{content}",method = RequestMethod.GET)
    @ResponseBody
    public List<Travel> getAllTravels(@PathVariable String content){
        List<Travel> travels = travelService.getprojectList(content);
        return travels;
    }
}
