package fun.haoyang666.www.service;

import fun.haoyang666.www.domain.entity.Questions;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
* @author yang
* @description 针对表【questions(题目)】的数据库操作Service
* @createDate 2022-12-10 16:20:50
*/
public interface QuestionsService extends IService<Questions> {


    Map<Integer, List<Questions>> getQuesRandom(int size);


}
