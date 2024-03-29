package fun.haoyang666.www.service;

import fun.haoyang666.www.admin.dto.CheckPostDto;
import fun.haoyang666.www.admin.dto.SysPostDto;
import fun.haoyang666.www.domain.entity.Post;
import com.baomidou.mybatisplus.extension.service.IService;
import fun.haoyang666.www.domain.req.GetPostActionsREQ;
import fun.haoyang666.www.domain.vo.PostVO;

import java.util.List;

/**
* @author yang
* @description 针对表【post(帖子)】的数据库操作Service
* @createDate 2022-12-10 16:20:50
*/
public interface PostService extends IService<Post> {


    void savePost(String content, String title, String description, String photo, long userId, List<Long> tags);

    List<PostVO> getPosts(long userId, int curPage, int pageSize);

    PostVO getPost(long id, long userId);

    List<PostVO> getPostUid(int curPage, int pageSize, Long userId);

    List<PostVO> getPostThumb(int curPage, int pageSize, Long userId);

    List<PostVO> getPostCollect(int curPage, int pageSize, Long userId);

    List<PostVO> getPostActions(GetPostActionsREQ req);

    List<PostVO> listPost(SysPostDto postDto);

    Boolean checkPost(CheckPostDto checkPostDto);

    Boolean recheck(Long id);
}
