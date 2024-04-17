package pokemon;

import java.util.ArrayList;
import java.util.Scanner;

class Login{
	String id;
	String pw;
	String add_name;
	Login(){}
	Login(ArrayList<User>user){}
	Login(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	public User loginSuccess(ArrayList<User>users) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		System.out.print("ID : ");
		String id = sc.next();
		
		System.out.println("비밀번호를 입력해주세요");
		System.out.print("PW : ");
		String pw = sc.next();
		
		User user = null;
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getId().equals(id)) {
				if(users.get(i).getPw().equals(pw)) {
					user = users.get(i);
				}
			}
		}
		return user;
	}
	public User addAccount(ArrayList<User>users) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사용하실 아이디를 입력하세요");
		System.out.print("ID : ");
		String id = sc.next();
		System.out.println("사용하실 비밀번호를 입력하세요");
		System.out.print("PW : ");
		String pw = sc.next();
		System.out.println("사용하실 닉네임을 입력해주세요");
		System.out.print("닉네임 : ");
		String my_name = "";
		int unum = 0;
		while(true) {
			my_name = sc.next();
			System.out.println("닉네임:"+my_name+" 정말로 이 닉네임을 사용하시겠습니까? (1:예/2:아니오)");
			int rsp = sc.nextInt();
			if(rsp==1) {
				System.out.println("생성완료");
				break;
			}else if(rsp==2) {
				System.out.println("사용하실 닉네임을 입력해주세요");
			}else {
				System.out.println("입력오류");
			}
		}
		unum = users.size()+1;
		User user = new User(id, pw, unum, my_name);
		users.add(user);
		return users.get(users.size()-1);
	}
}

public class User{
	String id;
	String pw;
	int unum;
	String my_name;
	String my_mon = null;
	int my_coin = 100;
	String my_badge = null;
	String my_title = null;
	User(){}
	User(String id, String pw, int unum, String my_name){
		this.id = id;
		this.pw = pw;
		this.unum = unum;
		this.my_name = my_name;
	}
	User(String my_name, String my_mon, int my_coin, String my_badge, String my_title){
		super();
		this.my_name = my_name;
		this.my_mon = my_mon;
		this.my_coin = my_coin;
		this.my_badge = my_badge;
		this.my_title = my_title;
	}
	public String getId(){
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getMyName() {
		return my_name;
	}
	public int getMyCoin() {
		return my_coin;
	}
	public String getMyBadge() {
		return my_badge;
	}
	public String getMyTitle() {
		return my_title;
	}
	public String toString() {
		return "ID:"+id+" PW:"+pw+" 회원번호:"+unum+", 닉네임:"+my_name;
	}
}

