package com.sparta.spartablog.repository;

import com.sparta.spartablog.entity.Board;
import com.sparta.spartablog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    //사용자이름으로 게시판글 가지고오기
    List<Board> findAllByUser(User user);
}
