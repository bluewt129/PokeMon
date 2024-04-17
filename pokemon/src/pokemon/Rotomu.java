package pokemon;

import java.util.Scanner;

public class Rotomu{
	
	public Rotomu(){}
	
	static void openRotomu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("로토무 보기 (1:예/2:로토무 종료)");
			int rspn2 = sc.nextInt();
			if(rspn2==1) {
				System.out.println("로토무를 열었습니다! 메뉴를 선택해주세요.");
				System.out.println("1.조회 2.탐험 3.배틀 4.아르바이트 5.포켓샵");
				int rspn3 = sc.nextInt();
				if(rspn3 == 1) {
					System.out.println("1. 내 정보 조회");
					System.out.println("2. 내 포켓몬 조회");
					System.out.println("3. 내 가방 조회");
					System.out.println("4. 전체 메뉴로 가기");
				}else if(rspn3 == 2) {
					System.out.println("1. 서쪽 평야 : 풀타입 포켓몬 출현 확률 UP!");
					System.out.println("2. 북쪽 용암지대 : 불타입 포켓몬 출현 확률 UP!");
					System.out.println("3. 남쪽 해안가 : 물타입 포켓몬 출현 확률 UP!");
					System.out.println("4. 전체 메뉴로 가기");
				}else if(rspn3 == 3) {
					System.out.println("1. AI 트레이너와 훈련");
					System.out.println("2. 체육관 도전");
					System.out.println("3. 전체 메뉴로 가기");
				}else if(rspn3 == 4) {
					System.out.println("1. 도서관 : 피로도 -2, 예상 수익 10~15코인");
					System.out.println("2. 전단지 : 피로도 -4, 예상 수익 15~25코인");
					System.out.println("3. 커피숍 : 피로도 -6, 예상 수익 30~50코인");
					System.out.println("4. 상하차 : 피로도 -10, 예상 수익 60~80코인");
					System.out.println("5. 전체 메뉴로 가기");
				}else if(rspn3 == 5) {
					System.out.println("1. 아이템 사기");
					System.out.println("2. 전당포");
					System.out.println("3. 전체 메뉴로 가기");
				}else {
					System.out.println("응답 오류");
				}
			}
			if(rspn2 == 2) {
				System.out.println("로토무 종료");
				break;
			}else {
				System.out.println("응답 오류");
			}
		}
	}
	static void narration() {
		User user = new User();
		int narration = (int)(Math.random()*10+1);
		if(narration == 1) {
			System.out.println("오늘도 신나는 모험을 떠나보자구!");
		}else if(narration ==2 ) {
			System.out.println(user.my_name+"네 포켓몬이 할 말이 있나봐.");
		}else if(narration == 3) {
			System.out.println("포켓몬 세계는 정말 신비로워");
		}else if(narration == 4) {
			System.out.println(user.my_name+"! 탐험을 떠나보는 건 어때? 새로운 포켓몬을 만날지도 몰라!");
		}else  if(narration == 5){
			System.out.println("포켓몬 마스터가 되기 위하여!");
		}else  if(narration == 6){
			System.out.println("체육관에 도전하기 전에 훈련 배틀부터 해볼까?");
		}else  if(narration == 7){
			System.out.println("아이템은 포켓 코인을 통해 구매할 수 있어!");
		}else  if(narration == 8){
			System.out.println("모든 포켓몬은 속성을 가지고 있어. 이걸 파악하면 전투에서 쉽게 승리할 수 있지.");
		}else  if(narration == 9){
			System.out.println("요즘은 포켓몬도 아르바이트를 할 수 있대");
		}else {
			System.out.println("모든 체육관을 격파하면 숨겨진 그랜드 마스터를 만나게 될지도 몰라...");
		}
	}
}
