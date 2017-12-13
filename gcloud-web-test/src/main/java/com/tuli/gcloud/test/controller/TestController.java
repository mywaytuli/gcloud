package com.tuli.gcloud.test.controller;

import com.tuli.gcloud.test.service.TestService;
import com.tuli.gcloud.test.vo.ManagerUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Random;

/**
 * Created by c_yangmingming-002 on 2017/12/6.
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;
    private Random random = new Random();

    @RequestMapping("/index")
    public String showIndex(Model model) {

        ManagerUserVO userVO = new ManagerUserVO();
        userVO.setCreated(new Date());
        userVO.setName(testService.test("index", 20));
        userVO.setJob("CEO");
        System.out.println("======================" + userVO.getName());

        model.addAttribute("user", userVO);

        return "index";
    }
    @RequestMapping("/admin")
    public String showAdmin(Model model) {

        ManagerUserVO userVO = new ManagerUserVO();
        userVO.setCreated(new Date());
        userVO.setName(testService.test("admin", 20));
        userVO.setJob("CEO");

        model.addAttribute("user", userVO);

        return "admin";
    }

    @RequestMapping("/show/logo")
    public String showLogo(Model model) {
        int nub = random.nextInt(60000);

        model.addAttribute("random", nub);

        return "editlogo";
    }

    @RequestMapping("/show/eidtItem")
    public String showEidtItem(Model model) {
        int nub = random.nextInt(60000);

        model.addAttribute("random", nub);

        return "editItem";
    }

    @RequestMapping("/show/addItem")
    public String showAddItem(Model model) {
        int nub = random.nextInt(60000);

        model.addAttribute("random", nub);

        return "addItem";
    }
    @RequestMapping("/show/category")
    public String showCategory(Model model) {
        int nub = random.nextInt(60000);


        model.addAttribute("random", nub);

        return "category";
    }
    @RequestMapping("/show/twoCategory")
    public String showTwoCategory(Model model) {
        int nub = random.nextInt(60000);


        model.addAttribute("random", nub);

        return "twoCategory";
    }
}
