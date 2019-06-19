package spring.web.service.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.web.service.service.BoardService;

import javax.inject.Inject;

@Controller("boardController")
@RequestMapping("/board")
public class BoardController {

    Log log = LogFactory.getLog(BoardController.class);

    @Inject
    private BoardService boardService;

    @GetMapping("/list")
    public String mainPage(Model model) {
        String boardListAll = boardService.getListALL();
        log.info(" >> board list : " + boardListAll);
        model.addAttribute("boardList", boardListAll);
        return "board/main";
    }


}

