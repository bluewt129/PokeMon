package pokemon;

class AiTrainer{
	static String name, ai_mon;
	static int ai_num;
	AiTrainer(){}
	AiTrainer(String name, int ai_num, String ai_mon){
		AiTrainer.name = name;
		AiTrainer.ai_num = ai_num;
		AiTrainer.ai_mon = ai_mon;
	}
	static {
		AiTrainer at1 = new AiTrainer("웅이", 1, "롱스톤");
		AiTrainer at2 = new AiTrainer("이슬이", 2, "아쿠스타");
		AiTrainer at3 = new AiTrainer("바람이", 3, "윈디");
		AiTrainer at4 = new AiTrainer("난천", 4, "망나뇽");
		AiTrainer at5 = new AiTrainer("레드", 5, "피카츄");
		System.out.println("ai체육관봇 생성");
	}
}

class AiPopMon{ //야생 출현 포켓몬
	static String aiowername, name;
	static String aimon_num;
	AiPopMon(){
		
	}
}


public class AiBot {
	static String name, ai_mon;
	static int ai_num;
	AiBot(){}
	AiBot(String name, int ai_num, String ai_mon){
		AiTrainer.name = name;
		AiTrainer.ai_num = ai_num;
		AiTrainer.ai_mon = ai_mon;
	}
	static {
		AiBot ab1 = new AiBot("오박사", 6, "켄타로스");
		AiBot ab2 = new AiBot("한지우", 2, "피카츄");
		AiBot ab3 = new AiBot("반바지꼬마 민식", 3, "암멍이");
		AiBot ab4 = new AiBot("포켓몬애호가 민정", 4, "샤미드");
		AiBot ab5 = new AiBot("랩퍼 햄부기", 5, "꼬부기");
		AiBot ab6 = new AiBot("알바생 동민", 5, "탕구리");
		System.out.println("ai봇 생성");
	}
}
