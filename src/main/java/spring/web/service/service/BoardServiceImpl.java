package spring.web.service.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.web.service.domain.Board;

import spring.mappers.BoardMapper;

import javax.inject.Inject;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Inject
    private BoardMapper boardMapper;


    @Transactional
    @Override
    public List<Board> listAll() throws Exception {
        return boardMapper.listAll();
    }

}
