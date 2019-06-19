package spring.web.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import spring.web.service.dao.BoardDao;

@Repository
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardDao boardDao;

    @Transactional
    @Override
    public String getListALL() {
        return boardDao.getAllList().toString();
    }
}
