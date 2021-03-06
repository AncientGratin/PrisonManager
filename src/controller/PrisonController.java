package controller;

import java.util.ArrayList;

import model.Prisoner;

//교도소 관리 클래스(back-end)
//유효성검사
public class PrisonController {
	private ArrayList<Prisoner> ImsiPrisoners = new ArrayList<Prisoner>();		// 죄수들
	
	// 생성자
	public PrisonController(){
		
	}
	
	// 죄수번호 유효성 검사
	public boolean isValidPrisonerNo(String prisonerNo) {
		boolean x = false;
		if(prisonerNo.charAt(0)==0) {
			if(prisonerNo.charAt(1)>='1'&&prisonerNo.charAt(1)<='2'){
				if(prisonerNo.charAt(2)=='가'||prisonerNo.charAt(2)=='나'||prisonerNo.charAt(2)=='다'){
					if(prisonerNo.charAt(3)>='1'&&prisonerNo.charAt(1)<='5'){
						for(int i = 4; i < 8; i++) {
							if(prisonerNo.charAt(i)>='0'&&prisonerNo.charAt(i)<='9'){
								x=true;
							}
						}
						
					}
				}
			}
		}
		return x;
	}
	
	// 죄수 정보 유효성 검사
	public boolean isValidPrisoner(Prisoner prisoner) {
		boolean x=false;
		if(prisoner.getName().length()>=0&&prisoner.getName().length()<=20) {
			if(prisoner.getCrime()==prisoner.getCrime().DECEIVE) {
				
			}
		}
		return x;
	}
	
	// 죄수번호 중복 검사
	//   주어진 죄수번호와 이 클래스의 InsiPrisoners 리스트에 저장된 죄수들의 죄수번호 중 일치하는 값이 있는지 검사
	public boolean isExistPrisonerNo(String prisonerNo) {
		
		return false;
	}
	
	public boolean AddPrisoner(Prisoner prisonerNo) {			//죄수등록
		return false;
	}
	public boolean DeletePrisoner(String prinum) {		//죄수삭제
		return false;
	}
	
	// 이름으로 검색하고, 이름이 일치하는 죄수 정보를 전부 추가해서 리스트로 반환
	public ArrayList<Prisoner> FindPrisoner(String name) {		//죄수검색
		ArrayList<Prisoner> foundPrisoners = new ArrayList<Prisoner>();
		
		// Todo: 검색 코드 작성
		
		return foundPrisoners;
	}
	
	public ArrayList<Prisoner> ShowAll() {				//죄수전체출력
		return ImsiPrisoners;
	}
	
	
}
