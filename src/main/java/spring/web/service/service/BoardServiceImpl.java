package spring.web.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import spring.web.service.dao.BoardDao;
import spring.web.service.vo.BoardVO;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Repository
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardDao boardDao;

    @Transactional
    @Override
    public List<BoardVO> getBoardlist() {
        return boardDao.getBoardlist();
    }

    @Transactional
    @Override
    public String putBoard(BoardVO vo) {

        String resultMsg = "";

        int result = boardDao.putBoard(vo);
        if (result == 1) {
            resultMsg = "SUCCESS";
        } else {
            resultMsg = "FAIL";
        }
        return resultMsg;
    }
}
