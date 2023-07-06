package com.sparta.spartablog.controller;

import com.sparta.spartablog.dto.BoardNewcontentRequestDto;
import com.sparta.spartablog.dto.BoardRequestDto;
import com.sparta.spartablog.dto.BoardResponseDto;
import com.sparta.spartablog.security.UserDetailsImpl;
import com.sparta.spartablog.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BoardController {

    private final BoardService boardService;

    //게시판 글 작성하기
    @PostMapping("/boards")
    public BoardResponseDto createBoard(@RequestBody BoardRequestDto requestDto, @AuthenticationPrincipal UserDetailsImpl userDetails){
        return boardService.createBoard(requestDto,userDetails.getUser());
    }

    //게시판수정하기
    @PutMapping("/boards/{id}") //pathvariavle방식
    public BoardResponseDto updateaBoards(@PathVariable Long id, BoardNewcontentRequestDto requestDto){
        return boardService.updateBoard(id,requestDto);
    }

    //회원이름으로 작성글 가지고 오기
    @GetMapping("/boards")
    public List<BoardResponseDto> getBoard(@AuthenticationPrincipal UserDetailsImpl userDetails){
        return boardService.getBoards(userDetails.getUser());
    }

    //admin으로 모든 게시판 글 조회하기
    @GetMapping("/admin/boards")
    public List<BoardResponseDto> getAllBoards(){
        return boardService.getAllBoards();
    }

}
