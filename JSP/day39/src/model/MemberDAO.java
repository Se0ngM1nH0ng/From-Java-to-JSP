package model;

import java.util.ArrayList;

public class MemberDAO {

	private ArrayList<MemberVO> mdatas;
	
	public MemberDAO() {
		mdatas=new ArrayList<MemberVO>();
		mdatas.add(new MemberVO("admin","1234","������"));
		mdatas.add(new MemberVO("test","1234","�׽�Ʈ"));
		mdatas.add(new MemberVO("hong","1234","ȫ�浿"));
	}
	
	public ArrayList<MemberVO> selectAll(MemberVO mVO){
		return null;
	}
	public MemberVO selectOne(MemberVO mVO){
		for(MemberVO v: mdatas) {
			if(mVO.getMid().equals(v.getMid())) {
				if(mVO.getMpw().equals(v.getMpw())) {
					return v;
				}
			}
		}
		return null;
	}
	public boolean insert(MemberVO mVO){
		return false;
	}
	public boolean delete(MemberVO mVO){
		return false;
	}
	public boolean update(MemberVO mVO){
		return false;
	}
}
