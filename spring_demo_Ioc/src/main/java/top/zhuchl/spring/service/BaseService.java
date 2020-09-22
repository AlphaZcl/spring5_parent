package top.zhuchl.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import top.zhuchl.spring.repository.BaseRepository;

/**
 * TODO
 *
 * @author zclys
 * @date 2020/9/17 14:16
 */
public class BaseService<T> {

    private static final Logger logger = LoggerFactory.getLogger(BaseService.class);

    @Autowired
    protected BaseRepository<T> baseRepository;

    public void add(){
        logger.info("------BaseService.add(),实际类型:{}-------",baseRepository.getClass().getGenericSuperclass());
        baseRepository.save();
    }
}
