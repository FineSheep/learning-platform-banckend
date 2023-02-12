package fun.haoyang666.www.controller;

import fun.haoyang666.www.common.BaseResponse;
import fun.haoyang666.www.common.Constant;
import fun.haoyang666.www.domain.req.UserInfoREQ;
import fun.haoyang666.www.utils.ResultUtils;
import fun.haoyang666.www.common.enums.ErrorCode;
import fun.haoyang666.www.domain.dto.UserDTO;
import fun.haoyang666.www.domain.dto.UserInfoDTO;
import fun.haoyang666.www.domain.entity.User;
import fun.haoyang666.www.domain.req.UserLoginByCodeREQ;
import fun.haoyang666.www.domain.req.UserLoginByPassWordREQ;
import fun.haoyang666.www.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yang
 * @createTime 2022/12/17 21:55
 * @description
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("updateUserInfo")
    public BaseResponse updateUserInfo(@RequestBody UserInfoREQ req) {
        userService.updateUserInfo(req);
        return ResultUtils.success(Constant.SUCCESS);
    }

    @GetMapping("getCode")
    public BaseResponse getCode(String email) {
        if (StringUtils.isBlank(email)) {
            return ResultUtils.error(ErrorCode.PARAMS_ERROR);
        }
        userService.getCode(email);
        return ResultUtils.success("验证码发送成功");
    }

    @PostMapping("loginByPassword")
    public BaseResponse<UserDTO> loginByPassword(@RequestBody UserLoginByPassWordREQ userLoginByPassWordReq) {
        if (userLoginByPassWordReq == null) {
            return ResultUtils.error(ErrorCode.PARAMS_ERROR);
        }
        String email = userLoginByPassWordReq.getEmail();
        String password = userLoginByPassWordReq.getPassword();
        if (StringUtils.isAnyBlank(email, password)) {
            return ResultUtils.error(ErrorCode.PARAMS_ERROR);
        }
        UserDTO userDto = userService.userLogin(email, password);
        return ResultUtils.success(userDto);
    }

    @PostMapping("loginOrRegister")
    public BaseResponse<UserDTO> loginByCode(@RequestBody UserLoginByCodeREQ userLoginByCodeReq) {
        if (userLoginByCodeReq == null) {
            return ResultUtils.error(ErrorCode.PARAMS_ERROR);
        }
        String email = userLoginByCodeReq.getEmail();
        String code = userLoginByCodeReq.getCode();
        if (StringUtils.isAnyBlank(email, code)) {
            return ResultUtils.error(ErrorCode.PARAMS_ERROR);
        }
        UserDTO userDto = userService.loginOrRegister(email, code);
        return ResultUtils.success(userDto);
    }

    @GetMapping("test")
    public BaseResponse<User> test() {
        List<User> list = userService.list();
        return ResultUtils.success(list.get(0));
    }

    @GetMapping("userInfo/{userId}")
    public BaseResponse<UserInfoDTO> userInfo(@PathVariable Long userId) {
        if (userId == null) {
            return ResultUtils.error(ErrorCode.PARAMS_ERROR);
        }
        UserInfoDTO userDto = userService.userInfo(userId);
        return ResultUtils.success(userDto);
    }
}
