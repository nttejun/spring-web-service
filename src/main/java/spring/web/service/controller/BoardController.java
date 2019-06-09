package spring.web.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.web.service.vo.BoardVO;
import spring.web.service.service.BoardService;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Inject
    private BoardService boardService;

    @GetMapping("/test")
    public String test() throws Exception {
        return "board/main";
    }

    @GetMapping("/")
    public String mainPage() throws Exception {
        List<BoardVO> boardList = boardService.listAll();
        return "board/main";
    }



}

