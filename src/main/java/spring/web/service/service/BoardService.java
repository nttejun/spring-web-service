package spring.web.service.service;

import org.springframework.stereotype.Component;
import spring.web.service.vo.BoardVO;

import java.util.List;

@Component
public interface BoardService {

    List<BoardVO> listAll() throws Exception;

}
