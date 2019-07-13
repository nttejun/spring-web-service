package spring.web.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import spring.web.service.contstants.BoardConstatns;
import spring.web.service.dao.BoardDao;
import spring.web.service.vo.BoardVO;

import java.util.List;

@Repository
public class BoardServiceImpl implements BoardService, BoardConstatns {

    @Autowired
    BoardDao boardDao;

    @Transactional
    @Override
    public List<BoardVO> getBoardlist() {
        return boardDao.getBoardlist();
    }

    @Transactional
    @Override
    public String addPost(BoardVO vo) {

        int result = boardDao.addPost(vo);

        String resultCode = "";
        if (result == 1) {
            resultCode = BOARD_SUCCESS_CODE;
        } else {
            resultCode = BOARD_FAIL_CODE;
        }

        return resultCode;
    }

    @Override
    public BoardVO getContentsInfo(String eid) {

        BoardVO boardDetailInfo = boardDao.getContentsInfo(eid);

        return boardDetailInfo;

    }

    @Transactional
    @Override
    public String updatePost(BoardVO vo) {

        int result = boardDao.updatePost(vo);

        String resultCode = "";
        if (result == 1) {
            resultCode = BOARD_SUCCESS_CODE;
        } else {
            resultCode = BOARD_FAIL_CODE;
        }
        return resultCode;
    }

    @Transactional
    @Override
    public String deletePost(String eid) {

        int result = boardDao.deletePost(eid);

        String resultCode = "";
        if (result == 1) {
            resultCode = BOARD_SUCCESS_CODE;
        } else {
            resultCode = BOARD_FAIL_CODE;
        }
        return resultCode;
    }
}
