package model;

import java.util.ArrayList;

public class BoardSet {
	
	// 멤버변수로 댓글과 대댓글을 가지고 있는다. 
	// 하나의 댓글에 여러개의 대댓글이 달린다. 
	// getter, setter 
	
	private BoardVO board; // 1
	private ArrayList<ReplyVO> rdatas; // N


	public BoardVO getBoard() {
		return board;
	}


	public void setBoard(BoardVO board) {
		this.board = board;
	}


	public ArrayList<ReplyVO> getRdatas() {
		return rdatas;
	}


	public void setRdatas(ArrayList<ReplyVO> rdatas) {
		this.rdatas = rdatas;
	}
}
