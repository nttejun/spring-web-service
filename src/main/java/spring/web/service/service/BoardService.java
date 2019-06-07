package spring.web.service.service;

import spring.web.service.domain.Board;

import java.util.List;

public interface BoardService {

    List<Board> listAll() throws Exception;

}
