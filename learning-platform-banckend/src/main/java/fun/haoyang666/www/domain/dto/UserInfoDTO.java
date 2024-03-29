package fun.haoyang666.www.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author yang
 * @createTime 2022/12/25 13:22
 * @description
 */
@Data
public class UserInfoDTO implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String username;
    /**
     * 用户头像
     */
    private String avatarUrl;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 电话
     */
    private String phone;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 个人简介
     */
    private String profile;
    /**
     * 做题数
     */
    private Integer questionNum;
    /**
     * 正确数
     */
    private Integer correctNum;

    private LocalDateTime birthday;

    private Long postNum;
    private Long thumbNum;
    private Long collectNum;
    private Integer userRole;
}
