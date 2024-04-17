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
	static {
		//풀타입 Grass 
		Monster gm1 = new Monster(1, "이상해씨", "풀", 1, 300, 50, 20, 50, "덩쿨채찍");
		Monster gm2 = new Monster(2, "캐터피", "풀", 1, 300, 50, 20, 50, "실뿜기");
		Monster gm3 = new Monster(3, "니드런", "풀", 1, 300, 50, 20, 50, "뿔치기");
		Monster gm4 = new Monster(4, "탕구리", "풀", 1, 300, 50, 20, 50, "뼈다귀치기");
		//물타입 Water
		Monster gm5 = new Monster(5, "꼬부기", "물", 1, 300, 50, 20, 50, "덩쿨채찍");
		Monster gm6 = new Monster(6, "브이젤", "물", 1, 300, 50, 20, 50, "덩쿨채찍");
		Monster gm7 = new Monster(7, "마린", "물", 1, 300, 50, 20, 50, "덩쿨채찍");
		Monster gm8 = new Monster(8, "샤미드", "물", 1, 300, 50, 20, 50, "덩쿨채찍");
		//불타입 Fire
		Monster gm9 = new Monster(9, "파이리", "불", 1, 300, 50, 20, 50, "덩쿨채찍");
		Monster gm10 = new Monster(10, "윈디", "불", 1, 300, 50, 20, 50, "덩쿨채찍");
		Monster gm11 = new Monster(11, "암멍이", "불", 1, 300, 50, 20, 50, "덩쿨채찍");
		Monster gm12 = new Monster(12, "포니타", "불", 1, 300, 50, 20, 50, "덩쿨채찍");
		//드래곤타입 Dragon
		Monster gm13 = new Monster(13, "망나뇽", "드래곤", 1, 300, 50, 20, 50, "덩쿨채찍");
		Monster gm14 = new Monster(14, "한카리아스", "드래곤", 1, 300, 50, 20, 50, "덩쿨채찍");
		Monster gm15 = new Monster(15, "마기라스", "드래곤", 1, 300, 50, 20, 50, "덩쿨채찍");
		Monster gm16 = new Monster(16, "삼삼드래", "드래곤", 1, 300, 50, 20, 50, "덩쿨채찍");

		System.out.println("ai몬 생성");
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
	void addMyMonster(ArrayList<MyMonster>my_mons, MyMonster name) {
		my_mons.add(name);
	}
	public String howl() {
		return null;
	}
}