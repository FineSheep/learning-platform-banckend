package fun.haoyang666.www.domain.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yang
 * @createTime 2022/12/18 15:59
 * @description
 */
@Data
public class UserUpdateREQ implements Serializable {
    /**
     * 用户昵称
     */
    private String username;

    /**
     * 邮箱
     */
    private String email;

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
     * 状态 0 - 正常  1-封号
     */
    private Integer userStatus;

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

}
