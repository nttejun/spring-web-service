package spring.web.service.service;

import spring.web.service.vo.BoardVO;

import java.util.List;

public interface BoardService {

    List<BoardVO> getBoardlist();

    String addPost(BoardVO vo);

    BoardVO getContentsInfo(String eid);

    String updatePost(BoardVO vo);

    String deletePost(String eid);
}
