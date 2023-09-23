package test;

import java.util.ArrayList;

public class MemberDAO {
	ArrayList<MemberVO> datas;
	public MemberDAO() {
		datas=new ArrayList<MemberVO>();
		datas.add(new MemberVO("admin","1234"));
		datas.add(new MemberVO("timo","1234"));
		datas.add(new MemberVO("kim","1234"));
	}
	
	public boolean insert(MemberVO vo) {
		for(MemberVO data: datas) {
			if(vo.getMid().equals(data.getMid())) {
				return false;
			}
		}
		datas.add(vo);
		return true;
	}
	public boolean update(MemberVO vo) {
		return false;
	}
	public boolean delete(MemberVO vo) {
		return false;
	}
	public ArrayList<MemberVO> selectAll(MemberVO vo) {
		return datas;
	}
	public MemberVO selectOne(MemberVO vo) {
		for(MemberVO data : datas) {
			if(vo.getMid().equals(data.getMid())) {
				if(vo.getMpw().equals(data.getMpw())) {
					
					return data;
				}
			}
		}
		return null;
	}
}
