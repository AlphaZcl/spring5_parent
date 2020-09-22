package top.zhuchl.spring.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author zclys
 * @date 2020/9/17 14:14
 */
public class BaseRepository<T> {

    private static final Logger logger = LoggerFactory.getLogger(BaseRepository.class);

    public void save(){
        logger.info("-------BaseRepository.Save()-------");
    }
}
