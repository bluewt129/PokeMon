package pokemon;

import java.util.ArrayList;

public class Monster {
	int mnum;
	String name;
	String type;
	int level;
	int hp;
	int atk;
	int def;
	int speed;
	String skill;
	Monster(){}
	Monster(int mnum, String name, String type, int level, int hp, int atk, int def, int speed, String skill){
		this.mnum = mnum;
		this.name = name;
		this.type = type;
		this.level = level;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
		this.skill = skill;
	}
	public int getMnum() {
		return mnum;
	}
	public String getMname() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getLevel() {
		return level;
	}
	public int getHp() {
		return hp;
	}
	public int getAtk() {
		return atk;
	}
	public int getDef() {
		return def;
	}
	public int getSpeed() {
		return speed;
	}
	public String getSkill() {
		return skill;
	}
	public static Monster gm1;
	public static Monster gm2;
	public static Monster gm3;
	public static Monster gm4;
	public static Monster wm5;
	public static Monster wm6;
	public static Monster wm7;
	public static Monster wm8;
	public static Monster fm9;
	public static Monster fm10;
	public static Monster fm11;
	public static Monster fm12;
	public static Monster dm13;
	public static Monster dm14;
	public static Monster dm15;
	public static Monster dm16;
	static {
		//풀타입 Grass 
		gm1 = new Monster(1, "이상해씨", "풀", 1, 300, 40, 20, 50, "덩쿨채찍");
		gm2 = new Monster(2, "캐터피", "풀", 1, 300, 50, 20, 50, "실뿜기");
		gm3 = new Monster(3, "니드런", "풀", 1, 300, 50, 20, 50, "뿔치기");
		gm4 = new Monster(4, "탕구리", "풀", 1, 300, 50, 20, 50, "뼈다귀치기");
		//물타입 Water
		wm5 = new Monster(5, "꼬부기", "물", 1, 300, 50, 20, 50, "덩쿨채찍");
		wm6 = new Monster(6, "브이젤", "물", 1, 300, 50, 20, 50, "덩쿨채찍");
		wm7 = new Monster(7, "마린", "물", 1, 300, 50, 20, 50, "덩쿨채찍");
		wm8 = new Monster(8, "샤미드", "물", 1, 300, 50, 20, 50, "덩쿨채찍");
		//불타입 Fire
		fm9 = new Monster(9, "파이리", "불", 1, 200, 60, 15, 100, "화염방사");
		fm10 = new Monster(10, "윈디", "불", 1, 300, 50, 20, 50, "덩쿨채찍");
		fm11 = new Monster(11, "암멍이", "불", 1, 300, 50, 20, 50, "덩쿨채찍");
		fm12 = new Monster(12, "포니타", "불", 1, 300, 50, 20, 50, "덩쿨채찍");
		//드래곤타입 Dragon
		dm13 = new Monster(13, "망나뇽", "드래곤", 1, 300, 50, 20, 50, "덩쿨채찍");
		dm14 = new Monster(14, "한카리아스", "드래곤", 1, 300, 50, 20, 50, "덩쿨채찍");
		dm15 = new Monster(15, "마기라스", "드래곤", 1, 300, 50, 20, 50, "덩쿨채찍");
		dm16 = new Monster(16, "삼삼드래", "드래곤", 1, 300, 50, 20, 50, "덩쿨채찍");

		System.out.println("ai몬 생성");
	}
	public String toSting() {
		return name;
	}
	
	public String howl(ArrayList<Monster> my_mons) {
		int a = (int)(Math.random()*3+1);
		int b = (int)(Math.random()*(my_mons.size()-1));
		String c = "";
		switch(a) {
		case 1 : 
			c = my_mons.get(b).getMname()+" : "+my_mons.get(b).getMname()+"~!!";
			break;
		case 2 : 
			c = my_mons.get(b).getMname()+" : "+my_mons.get(b).getMname()+"~?";
			break;
		case 3 : 
			c = my_mons.get(b).getMname()+" : "+"크아앙";
			break;
		default : 
			return c;
		}
		return c;
	}
	
	void battle(Monster a, Monster b) throws InterruptedException {
		int ahp = a.hp;
		int bhp = b.hp;
		int satk = 0;
		System.out.println(a.name+"(이/가) "+b.name+"에게 싸움을 걸어왔다!");
		Thread.sleep(1000);
		while(ahp>0 || bhp>0) {
			if(a.speed > b.speed) {
				System.out.println(a.name+"의 "+a.skill+"!");
				Thread.sleep(1000);
				bhp = bhp + b.def/2 - a.atk;
				satk = (int)(Math.random()*5)+1;
				if(satk==1) {
					bhp = bhp + b.def/2 - a.atk;
					System.out.println("!!!!급소에 맞았다!!!!");
					Thread.sleep(1000);
					System.out.println((bhp>0)?b.name+"의 체력이"+bhp+" 남았다!":b.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}else {
					System.out.println((bhp>0)?b.name+"의 체력이"+bhp+" 남았다!":b.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}
				if(ahp<=0 || bhp<=0) {break;}
				System.out.println(b.name+"의 "+b.skill+"!");
				Thread.sleep(1000);
				ahp = ahp + a.def/2 - b.atk;
				satk = (int)(Math.random()*5)+1;
				if(satk==1) {
					ahp = ahp + a.def/2 - b.atk;
					System.out.println("!!!!급소에 맞았다!!!!");
					Thread.sleep(1000);
					System.out.println((ahp>0)?a.name+"의 체력이"+ahp+" 남았다!":a.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}else {
					System.out.println((ahp>0)?a.name+"의 체력이"+ahp+" 남았다!":a.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}
				if(ahp<=0 || bhp<=0) {break;}
			}else {
				System.out.println(b.name+"의 "+b.skill+"!");
				Thread.sleep(1000);
				ahp = ahp + a.def/2 - b.atk;
				satk = (int)(Math.random()*5)+1;
				if(satk==1) {
					ahp = ahp + a.def/2 - b.atk;
					System.out.println("!!!!급소에 맞았다!!!!");
					Thread.sleep(1000);
					System.out.println((ahp>0)?a.name+"의 체력이"+ahp+" 남았다!":a.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}else {
					System.out.println((ahp>0)?a.name+"의 체력이"+ahp+" 남았다!":a.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}
				if(ahp<=0 || bhp<=0) {break;}
				System.out.println(a.name+"의 "+a.skill+"!");
				Thread.sleep(1000);
				bhp = bhp + b.def/2 - a.atk;
				satk = (int)(Math.random()*5)+1;
				if(satk==1) {
					bhp = bhp + b.def/2 - a.atk;
					System.out.println("!!!!급소에 맞았다!!!!");
					System.out.println((bhp>0)?b.name+"의 체력이"+bhp+" 남았다!":b.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}else {
					System.out.println((bhp>0)?b.name+"의 체력이"+bhp+" 남았다!":b.name+"(이/가) 쓰러졌다!");
					Thread.sleep(1000);
				}
				if(ahp<=0 || bhp<=0) {break;}
			}
		}
		Thread.sleep(1000);
		System.out.println((ahp>bhp)?a.name+"승리":b.name+"승리");
		System.out.println("===배틀이 종료되었습니다===");
	}
}

class MyMonster extends Monster{
	User owner = new User();
	String ownername = owner.my_name;
	int friendly;
	int tired;
	MyMonster(){}
	MyMonster(int unum, String ownername, int mnum, String name, String type, int hp, int atk, int def, int speed, String skill, int friendly, int tired){
		super();
		this.friendly = friendly;
		this.tired = tired;
	}
	void addMyMonster(ArrayList<MyMonster>my_mons, MyMonster a) {
		my_mons.add(a);
	}
	public String toString() {
		return name;
	}
	public String Info() {
		return "이름:"+name+" 어버이:"+ownername+" 타입:"+type+"\n레벨:"+level+" 친밀도:"+friendly+" 피로도:"+tired;
	}
	public String deepInfo() {
		return "체력:"+hp+" 공격력:"+atk+" 방어력:"+def+"스피드:"+speed+"\n스킬:"+skill;
	}

}