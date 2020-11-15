package com.yhk.mybatisplus2.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName FileService
 * @Author yhk
 * @Date 2020/10/29 21:04
 * @Description
 */
public interface FileService {

    void save(MultipartFile file);
}
