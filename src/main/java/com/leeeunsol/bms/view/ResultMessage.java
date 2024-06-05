package com.leeeunsol.bms.view;

public class ResultMessage {

    public void successMsg(String code){
        switch (code){
            case "login":
                System.out.println("로그인 성공");
                break;
        }
    }

    public void failMsg(String code){
        switch (code){
            case "notInputPassword":
                System.out.println("비밀번호를 입력해주세요.");
                break;
            case "notInputId":
                System.out.println("아이디를 입력해주세요.");
                break;
            case "login":
                System.out.println("일치하는 계정이없습니다.\n아이디와 비밀번호를 확인해주세요.");
                break;
        }
    }
}