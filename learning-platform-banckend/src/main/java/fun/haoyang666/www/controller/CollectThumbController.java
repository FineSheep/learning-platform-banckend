package fun.haoyang666.www.controller;

import fun.haoyang666.www.common.BaseResponse;
import fun.haoyang666.www.utils.ResultUtils;
import fun.haoyang666.www.common.enums.SuccessCode;
import fun.haoyang666.www.service.CollectPostService;
import fun.haoyang666.www.service.ThumbPostService;
import fun.haoyang666.www.utils.ThreadLocalUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author yang
 * @createTime 2023/1/16 11:59
 * @description
 */
@RestController
@RequestMapping("coTh")
public class CollectThumbController {

    @Resource
    private CollectPostService collectPostService;
    @Resource
    private ThumbPostService thumbPostService;

    @GetMapping("thumb")
    public BaseResponse thumb(long postId, HttpServletRequest request) {
        Long userId = ThreadLocalUtils.get().getUserId();
        thumbPostService.thumb(userId, postId);
        return ResultUtils.success(SuccessCode.SUCCESS);
    }

    @GetMapping("collect")
    public BaseResponse collect(long postId, HttpServletRequest request) {
        Long userId = ThreadLocalUtils.get().getUserId();
        collectPostService.collect(userId, postId);
        return ResultUtils.success(SuccessCode.SUCCESS);
    }


}
