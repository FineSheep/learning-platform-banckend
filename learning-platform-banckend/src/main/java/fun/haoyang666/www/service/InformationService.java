package fun.haoyang666.www.service;

import com.baomidou.mybatisplus.extension.service.IService;
import fun.haoyang666.www.domain.dto.ScrollerDto;
import fun.haoyang666.www.domain.entity.Information;

/**
 * @author yang
 * @description 针对表【information】的数据库操作Service
 * @createDate 2022-12-31 16:29:03
 */
public interface InformationService extends IService<Information> {

    ScrollerDto<Information> getInformationPage(int curPage, int pageSize);

}
