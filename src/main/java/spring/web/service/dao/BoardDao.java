package spring.web.service.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.web.service.vo.BoardVO;

import java.util.List;

@Component
public class BoardDao {

    @Autowired
    SqlSession session;

    public List<BoardVO> getBoardlist() {
        List<BoardVO> boardList = session.selectList("board.getBoardlist");
        return boardList;
    }

    public int putBoard(BoardVO vo){
        return session.insert("board.putBoard", vo);
    }
}
