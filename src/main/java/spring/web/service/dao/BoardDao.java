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

    public int addPost(BoardVO vo){
        return session.insert("board.addPost", vo);
    }

    public BoardVO getContentsInfo(String eid) {
        BoardVO contents = session.selectOne("board.getContentsInfo", eid);
        System.out.println(">> BOARD VO " + contents);
        System.out.println(">> BOARD VO " + contents.toString());
        return contents;
    }

    public int updatePost(BoardVO vo) {
        int result = session.update("board.updatePost", vo);
        return result;
    }

    public int deletePost(String eid) {
        int result = session.delete("board.deletePost", eid);
        return result;
    }
}
