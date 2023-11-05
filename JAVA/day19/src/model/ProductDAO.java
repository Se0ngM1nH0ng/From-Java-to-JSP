package model;

import java.util.ArrayList;

// 목록출력,목록검색_이름,목록검색_가격순,목록검색_조회수
public class ProductDAO {
	private ArrayList<ProductVO> datas;
	private static int PK=1001;
	public ProductDAO() {
		datas=new ArrayList<ProductVO>();
		datas.add(new ProductVO(PK++,"장갑",12000,2));
		datas.add(new ProductVO(PK++,"화장지",1000,1));
		datas.add(new ProductVO(PK++,"장화",23000,0));
		datas.add(new ProductVO(PK++,"지갑",120000,1));
		datas.add(new ProductVO(PK++,"화분",5500,2));
	}

	public ArrayList<ProductVO> selectAll(ProductVO pVO){// 내가 가진 상품 반환
		// 높은 응집도를 위해 
		// 여러기능을 하나의 메서드에서 작성



		if(pVO==null) {// pVO가 null 이야 ? 그러면 원래 기능이야 
			return datas;
		}

		else if(pVO.getName().equals("필터검색")) { //이거 필터검색이야 ? //searchCondition // 조건 
			ArrayList<ProductVO> mdatas=new ArrayList<ProductVO>();//반환해줄 배열 만들고 
			//가격범위에 들어가는 데이터들을 추가해서
			for(ProductVO data : datas) {
				if(pVO.getPrice() <= data.getPrice() && data.getPrice() <= pVO.getCnt()) { //searchContent // 조건에 대한 내용
					//가격범위에 들어가는 데이터야 ?
					// 최저 <= 내 가격 && 내가격 >= 최고
					mdatas.add(data);
				}
			}
			return mdatas;//반환해 
		}

		else {// 상품 목록 이니까 Product -> 그리고 검색이니까 전체를 보고 검사를 해줘야 한다. 상품 검색
			// null이 아니면 ? 이름으로 검색
			// '상품목록출력'을 할때에는 인자(pVO)가 null이므로
			// pVO가 null이 아니라면 '이름으로검색'임!
			ArrayList<ProductVO> mdatas=new ArrayList<ProductVO>();
			for(ProductVO data:datas) {
				if(data.getName().contains(pVO.getName())) {
					// 처음부터 끝까지 돌면서
					//			if(사용자가 입력한 이름을 가진 데이터야)?{
					//				// () 내용 : 현재 보고 있는 데이터 이름(data.getName)이 검색어(pVO.getName)를 포함하고(contains) 있어 ?
					//				// pVO.getName() == 사용자가 검색한 단어
					mdatas.add(data);
				}
			}         
			return mdatas;
		}

		//   	상품 이름으로 검색에 대한 한글 코딩
		//		if(이름으로 검색중이니?) { // pVO != null
		//			// pVO가 null이 아니라면 '이름으로 검색'임 

		//			처음부터 끝까지 돌면서
		//			if(사용자가 입력한 이름을 가진 데이터야)?{
		//				// () 내용 : 현재 보고 있는 데이터 이름(data.getName)이 검색어(pVO.getName)를 포함하고(contains) 있어 ?
		//				// pVO.getName() == 사용자가 검색한 단어


		//				//(mdatas)output에 저장해
		//				mdatas.add(data);
		//			}
		//			return (mdatas)output하자!
		//		}else {
		//			return datas;
		//			
		//		}

	}
	public ProductVO selectOne(ProductVO pVO){
		//가장 비싼 상품 = pVO.getName;

		if(pVO.getName().equals("최고가") ) {// searchCondition //지금 최고가 검색이야 ?
			//최고를 찾는 알고리즘
			int max=datas.get(0).getPrice();
			int maxIndex=0;
			for(int i=1;i<datas.size();i++) {
				if(max<datas.get(i).getPrice()) {
					max=datas.get(i).getPrice();
					maxIndex=i;
				}
			}
			return datas.get(maxIndex);//최고가상품
		}else if(pVO.getName().equals("최저가")) {
			int min = datas.get(0).getCnt();
			int minIndex = 0;
			for (int i = 0; i < datas.size(); i++) {
				if(min > datas.get(0).getCnt()) {
					min = datas.get(i).getCnt();
					minIndex=i;
				}
			}
			return datas.get(minIndex);
		}
		return null;
	}	

	public boolean insert(ProductVO pVO) {
		// 미구현된 상태에서는 false로 두기
		return false;  
	}
	public boolean update(ProductVO pVO) {
		return false;
	}
	public boolean delete(ProductVO pVO) {
		return false;
	}
}
