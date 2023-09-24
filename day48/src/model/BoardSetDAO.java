package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardSetDAO {
   private Connection conn;
   private PreparedStatement pstmt;
   private ResultSet rs;
   
   												// 더보기 구현하려면 LIMIT 0,?"
   static final private String SQL_SELECTALL="SELECT * FROM BOARD LIMIT 0,?";
   static final private String SQL_SELECTALL_REPLY="SELECT * FROM REPLY WHERE BID=?";
   															// fk 웨어 절을 가지고 있다는거 해당 글만 
   public ArrayList<BoardSet> selectAll(BoardVO bVO, int count){ // BoardVO 사용해도 되기때문에 1 짜리가 들어간다.
      conn=JDBCUtil.connect();				// 일대 다 중 '일'   // 몇개볼지도 
      ArrayList<BoardSet> datas=new ArrayList<BoardSet>();

      try {
         pstmt=conn.prepareStatement(SQL_SELECTALL);
         rs=pstmt.executeQuery();

         while(rs.next()) { // 하나의 vo 에 // 댓글이 여러개가 될수 있으므로 while
            BoardSet bs=new BoardSet();
            BoardVO data=new BoardVO(); 
            data.setBid(rs.getInt("BID")); // Board 인자를 다 보내줘야 한다. 
            data.setMid(rs.getString("MID"));
            data.setBcontent(rs.getString("BCONTENT"));
            data.setFavcnt(rs.getInt("FAVCNT"));
            data.setFavcnt(rs.getInt("REPLYCNT"));
            data.setDate(rs.getDate("DATE"));
            
            
            bs.setBoard(data); // BoardSet 객체에 댓글묶음을 전달 
            
            ////////// n 개의 댓글을 가지고 있다 . 이중반복
            pstmt=conn.prepareStatement(SQL_SELECTALL_REPLY); // 그 댓글하나가 가지고 있는 대댓글
            pstmt.setInt(1, data.getBid()); // 그 댓글의 대댓글을 볼거기 때문에 위에서 선언한 Board의 댓글 data가 맞음
            ResultSet rs2=pstmt.executeQuery(); // 자주 쓰는거 아니면 여기서 선언 
            ArrayList<ReplyVO> rdatas=new ArrayList<ReplyVO>(); // 대댓글의 배열 리스트 
            while(rs2.next()) {
               ReplyVO rVO=new ReplyVO();
               rVO.setRid(rs2.getInt("RID"));
               rVO.setBid(rs2.getInt("BID"));
               rVO.setMid(rs2.getString("MID"));
               rVO.setDate(rs2.getDate("DATE"));
               rVO.setRcontent(rs2.getString("RCONTENT"));
               rdatas.add(rVO);
            }
            //////////
            
            bs.setRdatas(rdatas); // BoardSet객체에 대댓글 묶음 전달 
            
            datas.add(bs); // BoardSet 배열 리스트 에 댓글과 대댓글 묶음 둘 다 전달 
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }

      JDBCUtil.disconnect(rs, pstmt, conn);

      return datas;
   }
}