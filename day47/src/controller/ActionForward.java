package controller;

public class ActionForward {
	// Controller�� ���ư� �غ�
	// 1. �����̷�Ʈ? ������?
	// 2. ���� ���ߵǴ�?
	
	// �ΰ��� Ÿ���� �������� ������ �ϳ��� ���� �� �ִ� vo �����ָ� ������ �Ѵ�. 
	// ������� �� (boolean, String)
	
	private boolean redirect; // �����͸� ���������ϴ��� ���ƾ� �ϴ���
	private String path; // ���� ����
	public boolean isRedirect() {
		return redirect;
	}
	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
}
