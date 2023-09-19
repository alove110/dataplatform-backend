package com.factory.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *首页的接口
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@ApiOperation("首页的接口")
@RequestMapping("/home")
public class IndexController {

//    @Autowired
//    private IndexService indexService;
//
//    @RequestMapping("/exception_count")
//    public RestResult exceptionCount() {
//        return indexService.getExceptionCount();
//    }
}
