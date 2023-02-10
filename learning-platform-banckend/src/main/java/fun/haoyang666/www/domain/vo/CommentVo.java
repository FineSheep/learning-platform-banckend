package fun.haoyang666.www.domain.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author yang
 * @createTime 2023/2/10 15:09
 * @description
 */
@Data
public class CommentVo {
    private String id;
    private String parentId;
    private String content;
    private Long postId;
    private LocalDateTime createTime;
    private String userId;
    private String userAvatar;
}
