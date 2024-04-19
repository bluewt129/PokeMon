package pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainpoke {
	
	static Login Login = new Login();
	static Monster Monster = new Monster();
	static AiBot AiBot = new AiBot();
	
	public static void main(String[] args) throws InterruptedException {
		ArrayList<User> users = new ArrayList<>();
		ArrayList<Monster> my_mons = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("포켓몬 세계에 오신 것을 환영합니다");
		Thread.sleep(1000);
		MyMonster mymonster = new MyMonster();
		User logined = null;
		Login login = new Login();
		
		while(true) {
			if(logined == null) {
				try{
				System.out.println("계정을 보유하고 계신가요? (1:예/2:아니오) ");
				int rsp = sc.nextInt();
				switch(rsp) {
					case 1 :
						logined = Login.loginSuccess(users);
						if(logined == null) {
							System.out.println("입력하신 정보가 존재하지 않습니다");
						}
						break;
					case 2 : 
						System.out.println("회원가입을 시작합니다");
						login.addAccount(users);
						System.out.println(users);
						break;
					default : System.out.println("입력 오류");
				}
				}catch(Exception e) {
					System.out.println("정상적인 키 입력이 아닙니다");
					sc.next();
				}
			}else {
				System.out.println("접속 성공");
				Thread.sleep(1000);
				System.out.println("====포켓몬 세계에 진입중입니다====");
				Thread.sleep(1000);
				System.out.println(logined.getMyName()+"! 반갑네.");
				Thread.sleep(1000);
				System.out.println("내 이름은 오박사. 포켓몬 트레이너들의 모험을 도와주고 있지.");
				Thread.sleep(1000);
				System.out.println("어라? "+logined.getMyName()+". 자네는 포켓몬이 한 마리도 없구만.");
				Thread.sleep(1000);
				System.out.println("성공적인 모험을 위해 내가 한 마리 보내주겠네. 이 중에서 골라보게나.");
				while(true) {
					System.out.println("1.파이리 2.꼬부기 3.이상해씨");
					int rspn = sc.nextInt();
					if(rspn==1) {
						System.out.println("파이리는 불꽃타입 포켓몬이지. 활발한 성격에 강한 공격력을 가지고 있단다.");
						System.out.println("정말 파이리로 하겠니? (1:예/2:다시 고를래요)");
						int rspn2 = sc.nextInt();
						if(rspn2 == 1) {
							my_mons.add(Monster.fm9);
							System.out.println("훌륭한 선택이네. 여기, 파이리를 데려가게.");
							Thread.sleep(1000);
							System.out.println(my_mons.get(my_mons.size()-1).howl(my_mons));
							Thread.sleep(1000);
							System.out.println("파이리가 모험에 참여했다!");
							break;
						}else if(rspn2==2){
							System.out.println("신중하게 선택해보렴.");
						}
					}
					if(rspn==2) {
						System.out.println("꼬부기는 물타입 포켓몬이지. 차분한 성격에 강한 방어력을 가지고 있단다.");
						System.out.println("정말 꼬부기로 하겠니? (1:예/2:다시 고를래요)");
						int rspn2 = sc.nextInt();
						if(rspn2 == 1) {
							System.out.println("훌륭한 선택이네. 여기, 꼬부기를 데려가게.");
							Thread.sleep(1000);
							System.out.println(my_mons.get(my_mons.size()-1).howl(my_mons));
							Thread.sleep(1000);
							System.out.println("꼬부기가 모험에 참여했다!");
							my_mons.add(Monster.wm5);
							break;
						}else if(rspn2==2){
							System.out.println("신중하게 선택해보렴.");
						}
					}
					if(rspn==3) {
						System.out.println("이상해씨는 풀타입 포켓몬이지. 과묵한 성격에 높은 체력을 가지고 있단다.");
						System.out.println("정말 이상해씨로 하겠니? (1:예/2:다시 고를래요)");
						int rspn2 = sc.nextInt();
						if(rspn2 == 1) {
							System.out.println("훌륭한 선택이네. 여기, 이상해씨를 데려가게.");
							Thread.sleep(1000);
							System.out.println(my_mons.get(my_mons.size()-1).howl(my_mons));
							Thread.sleep(1000);
							System.out.println("이상해씨가 모험에 참여했다!");
							my_mons.add(Monster.gm1);
							break;
						}else if(rspn2==2){
							System.out.println("신중하게 선택해보렴.");
						}
					}
				}
				Thread.sleep(1000);
				System.out.println("자, 이제 포켓몬을 얻었으니 여기 로토무를 받으렴");
				Thread.sleep(1000);
				System.out.println("System : 로토무 획득!");
				Thread.sleep(1000);
				System.out.println("로토무를 통해 메뉴를 선택할 수 있단다. 한번 열어보렴.");
				Thread.sleep(1000);
				System.out.println("System : 이제부터 로토무를 열 수 있습니다.");
				while(true) {
					System.out.println("9:로토무 열기");
					int rspn2 = sc.nextInt();
					if(rspn2 == 9) {
						Rotomu.openRotomu();
					}else {
						System.out.println("잘못된 키 입력입니다");
					}
					Rotomu.narration();
				}
			}
		}
	}
}
