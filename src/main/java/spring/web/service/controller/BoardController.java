package spring.web.service.controller;

import org.mariadb.jdbc.internal.logging.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.web.service.domain.Board;
import spring.web.service.service.BoardService;

import javax.inject.Inject;
import java.util.List;
import java.util.logging.Logger;

@Controller("boardController")
@RequestMapping("/board")
public class BoardController {

    private final Logger logger = (Logger) LoggerFactory.getLogger(BoardController.class);

    @Inject
    private BoardService boardService;

    @GetMapping("/")
    public String mainPage() throws Exception {
        List<Board> boardList = boardService.listAll();
        logger.info(boardList.toString());
        return "board/main";
    }

    @PostMapping("/contents")
    public String detailPage(){
        return "board/main";
    }


}

