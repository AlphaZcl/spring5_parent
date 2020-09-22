package top.zhuchl.spring.repository.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import top.zhuchl.spring.entity.BookEntity;
import top.zhuchl.spring.repository.BaseRepository;

/**
 *
 * @author zclys
 * @date 2020/9/17 17:07
 */
@Repository
public class BookRepository extends BaseRepository<BookEntity> {

    private static final Logger logger = LoggerFactory.getLogger(BookRepository.class);

    @Override
    public void save() {

       logger.info("-------BookRepository.save-------");
    }
}
