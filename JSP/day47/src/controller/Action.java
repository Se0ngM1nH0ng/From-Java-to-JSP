package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	// Ŭ������ �����ѵ� 
	// Ŭ������ �ƴ϶� "������"�� ����
	// "��üȭ(�ν��Ͻ�ȭ)"�� �ȵ�
	// "�޼��� �������̵� ����" �Ϸ��� �����ϴ� ���� 
	ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	// ����Ʈ �������� abstract Ű���尡 �����ϱ� ������
	// �翬�� public �� ����Ʈ �̴�. �翬�� ������������ ����ؾ� �ϱ� ������ 
	// �������̵��� ���� �Ϸ��� �������θ� ����ϱ� ������ 
}
