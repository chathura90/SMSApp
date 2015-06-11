package com.ideamart.mvc;

import com.ideamart.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by chathura on 6/11/15.
 */
@Controller
public class Controler {
    @Autowired
    DataService dataService;

    @RequestMapping("list")
    public ModelAndView getList() {
        List receiveList = dataService.getList();
        return new ModelAndView("list", "receiveList",receiveList);
    }
    @RequestMapping("delete")
    public ModelAndView deleteUser(@RequestParam int id) {
        dataService.deleteRow(id);
        return new ModelAndView("redirect:list");
    }
}
