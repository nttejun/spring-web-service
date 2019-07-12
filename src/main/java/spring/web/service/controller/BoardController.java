package spring.web.service.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
    public String getListBoard(Model model) {
        List<BoardVO> boardListAll = boardService.getBoardlist();
        System.out.println(" >> BOARD LIST : " + boardListAll);
        model.addAttribute("boardList", boardListAll);
        return "board/list";
    }

    @GetMapping("/post")
    public String addBoardPage(){
        return "board/post";
    }

    @GetMapping(value="/post/{eid}")
    public String getBoardDetail(@PathVariable String eid, Model model){
        System.out.println(">> EID : " + eid);
        BoardVO contentsInfo = boardService.getContentsInfo(eid);
        model.addAttribute("contentsInfo", contentsInfo);
        System.out.println(">> CONTENTS DETAIL INFO : " + contentsInfo.toString());
        return "board/detail";
    }

    @ResponseBody
    @PostMapping("/post")
    public ModelAndView addBoardAction(ModelAndView mv, HttpServletRequest request)
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
        mv.addObject("redirectUrl", "/board/");
        mv.setViewName("common/redirect");

        return mv;
    }
}

