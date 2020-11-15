package com.yhk.mybatisplus2.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName UploadAction
 * @Author yhk
 * @Date 2020/10/29 21:01
 * @Description
 */
@RestController
public class UploadAction {

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public void save(@RequestParam("file") MultipartFile file){

    }
}
