package fun.haoyang666.www.domain.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yang
 * @createTime 2023/1/16 15:07
 * @description
 */
@Data
public class GetPostREQ extends PageREQ implements Serializable {
    private Long userId;
}
