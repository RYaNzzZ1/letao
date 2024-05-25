package com.letao.ImageFile.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.letao.ImageFile.entity.Image;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 */
public interface IImageService extends IService<Image> {
    List<String> getUrls(long associationId, int type);

    void updateUrls(List<String> urls, long associationId, int type);
}
