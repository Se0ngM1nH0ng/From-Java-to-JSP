package model;

import java.util.ArrayList;

public class MemberDAO {
	private ArrayList<MemberVO> datas;
	public MemberDAO() {
		datas=new ArrayList<MemberVO>();
		datas.add(new MemberVO("admin","1234","������"));
		datas.add(new MemberVO("test","1234","�׽�Ʈ"));
		datas.add(new MemberVO("hong","1234","ȫ�浿"));
	}

	public ArrayList<MemberVO> selectAll(MemberVO mVO){
		return null;
	}
	public MemberVO selectOne(MemberVO mVO){
		for(MemberVO v:datas) {
			if(mVO.getMid().equals(v.getMid())) {
				// ���̵� �����ϴ� ��Ȳ
				if(mVO.getMpw().equals(v.getMpw())) {
					// ��й�ȣ�� ��ġ�ϴ� ��Ȳ
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
