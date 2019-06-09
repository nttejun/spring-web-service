package spring.web.service.service;

import org.springframework.transaction.annotation.Transactional;
import spring.mappers.BoardMapper;
import spring.web.service.vo.BoardVO;

import javax.inject.Inject;
import java.util.List;

public class BoardServiceImpl implements BoardService{

    @Inject
    private BoardMapper boardMapper;

    @Transactional
    @Override
    public List<BoardVO> listAll() throws Exception {
        return boardMapper.listAll();
    }

}
