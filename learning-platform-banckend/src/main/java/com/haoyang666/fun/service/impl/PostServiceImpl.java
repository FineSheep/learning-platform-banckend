package com.haoyang666.fun.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haoyang666.fun.domain.Post;
import com.haoyang666.fun.service.PostService;
import com.haoyang666.fun.mapper.PostMapper;
import org.springframework.stereotype.Service;

/**
* @author yang
* @description 针对表【post(帖子)】的数据库操作Service实现
* @createDate 2022-12-09 19:29:55
*/
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post>
    implements PostService{

}




