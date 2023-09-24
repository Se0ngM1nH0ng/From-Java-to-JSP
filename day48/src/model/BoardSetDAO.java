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
   
   												// ������ �����Ϸ��� LIMIT 0,?"
   static final private String SQL_SELECTALL="SELECT * FROM BOARD LIMIT 0,?";
   static final private String SQL_SELECTALL_REPLY="SELECT * FROM REPLY WHERE BID=?";
   															// fk ���� ���� ������ �ִٴ°� �ش� �۸� 
   public ArrayList<BoardSet> selectAll(BoardVO bVO, int count){ // BoardVO ����ص� �Ǳ⶧���� 1 ¥���� ����.
      conn=JDBCUtil.connect();				// �ϴ� �� �� '��'   // ������� 
      ArrayList<BoardSet> datas=new ArrayList<BoardSet>();

      try {
         pstmt=conn.prepareStatement(SQL_SELECTALL);
         rs=pstmt.executeQuery();

         while(rs.next()) { // �ϳ��� vo �� // ����� �������� �ɼ� �����Ƿ� while
            BoardSet bs=new BoardSet();
            BoardVO data=new BoardVO(); 
            data.setBid(rs.getInt("BID")); // Board ���ڸ� �� ������� �Ѵ�. 
            data.setMid(rs.getString("MID"));
            data.setBcontent(rs.getString("BCONTENT"));
            data.setFavcnt(rs.getInt("FAVCNT"));
            data.setFavcnt(rs.getInt("REPLYCNT"));
            data.setDate(rs.getDate("DATE"));
            
            
            bs.setBoard(data); // BoardSet ��ü�� ��۹����� ���� 
            
            ////////// n ���� ����� ������ �ִ� . ���߹ݺ�
            pstmt=conn.prepareStatement(SQL_SELECTALL_REPLY); // �� ����ϳ��� ������ �ִ� ����
            pstmt.setInt(1, data.getBid()); // �� ����� ������ ���ű� ������ ������ ������ Board�� ��� data�� ����
            ResultSet rs2=pstmt.executeQuery(); // ���� ���°� �ƴϸ� ���⼭ ���� 
            ArrayList<ReplyVO> rdatas=new ArrayList<ReplyVO>(); // ������ �迭 ����Ʈ 
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
            
            bs.setRdatas(rdatas); // BoardSet��ü�� ���� ���� ���� 
            
            datas.add(bs); // BoardSet �迭 ����Ʈ �� ��۰� ���� ���� �� �� ���� 
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }

      JDBCUtil.disconnect(rs, pstmt, conn);

      return datas;
   }
}