package spring.web.service.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import spring.web.service.service.BoardService;
import spring.web.service.vo.BoardVO;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller("boardController")
@RequestMapping("/board")
public class BoardController {

    Log log = LogFactory.getLog(BoardController.class);

    @Inject
    private BoardService boardService;

    @GetMapping("/")
    public String listBoard(Model model) {
        List<BoardVO> boardListAll = boardService.getBoardlist();
        System.out.println(" >> board list : " + boardListAll);
        model.addAttribute("boardList", boardListAll);
        return "board/list";
    }

    @ResponseBody
    @PostMapping("/")
    public ModelAndView addBoardAction(HttpServletRequest request)
    {
        SimpleDateFormat dateFm = new SimpleDateFormat ( "yyyyMMddHHmmss");
        String date = dateFm.format (System.currentTimeMillis());

        BoardVO vo = new BoardVO();
        vo.setCategory(request.getParameter("category"));
        vo.setTitle(request.getParameter("title"));
        vo.setContents(request.getParameter("contents"));
        vo.setRegUser(request.getParameter("regUser"));
        vo.setEid(date);

        System.out.println(" >> board VO : " + vo.toString());

        String result = boardService.putBoard(vo);
        System.out.println(" >> RESULT MSG : " + result);

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", result);
        mv.setViewName("board/list");
        return mv;

    }

    @GetMapping("/modal")
    public String addBoard(){
        return "board/add";
    }
}

