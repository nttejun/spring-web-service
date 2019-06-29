package spring.web.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import spring.web.service.dao.BoardDao;
import spring.web.service.vo.BoardVO;

import java.util.List;

@Repository
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardDao boardDao;

    @Transactional
    @Override
    public List<BoardVO> getListALL() {
        return boardDao.getListAll();
    }
}
