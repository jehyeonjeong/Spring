package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private BoardDAO boardDAO;

	// CRUD 기능의 메소드 구현
	// 글 등록
	@Override
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}

	// 글 수정
	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);		
	}

	// 글 삭제
	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

	// 글 상세 조회
	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

	// 글 목록 조회
	@Override
	public List<BoardVO> getBoardList(BoardVO vo){
		return boardDAO.getBoardList(vo);
	}

}
