package DAO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import AboutFile.*;
import DTO.*;

//DAO:Data Access Object = model = back end
public class MemberDao {
	// 데이터 담을 배열 필요
	Scanner scanner = new Scanner(System.in);
	
	private int type;
	HashMap<Integer, Human> playerList = new HashMap<Integer, Human>();
	Human players[] = new Human[0];
	AboutFile file = new AboutFile();
	
	/*
	Human human[]; < 변수 선언
	human = new Human(); < 객체 생성
	human = new Human[20]; < 변수 20개 생성
	 */
	
	public MemberDao() {
		playerList = file.fileLoad(playerList);
		
		players = new Human[8];
		players[0] = new Batter("타자",101,"주홍",25,188.0,30,20,0.33);
		players[1] = new Pitcher("투수",201,"경호",27,187.3,6,5,4.3);
		players[2] = new Pitcher("투수",202,"도흠",26,182.1,7,2,6.6);
		players[3] = new Batter("타자",102,"상우",27,179.5,25,17,0.38);
		players[4] = new Batter("타자",103,"성환",23,181.8,22,19,0.39);
		players[5] = new Pitcher("투수",203,"현식",29,177.7,10,1,9.0);
		players[6] = new Batter("타자",104,"김밥",30,182.6,40,10,0.23);
		players[7] = new Pitcher("투수",204,"돌돌",19,183.4,3,4,3.3);
		playerList.put(101, players[0]);
		playerList.put(201, players[1]);
		playerList.put(202,players[2]);
		playerList.put(102,players[3]);
		playerList.put(103,players[4]);
		playerList.put(203,players[5]);
		playerList.put(104,players[6]);
		playerList.put(204,players[7]);
		
	}
	
	public void hitAvgLine() {
		ArrayList<Human> hitAvg =new ArrayList<Human>();
		Iterator<Integer> key = playerList.keySet().iterator();
		
		while(key.hasNext()) {
			Integer _key = key.next();
			if(playerList.get(_key) instanceof Batter) {
				hitAvg.add(playerList.get(_key));
			}
		}
		System.out.println(hitAvg);
		for(int i=0;i<hitAvg.size()-1;i++) {
			for(int j=i+1;j<hitAvg.size();j++) {
				if(((Batter)hitAvg.get(i)).getHitAvg()<((Batter)hitAvg.get(j)).getHitAvg()) {
					Human temp = hitAvg.get(i);
					hitAvg.set(i,hitAvg.get(j));
					hitAvg.set(j, temp);
				}
			}
		}
		for(int i=0;i<hitAvg.size();i++) {
			System.out.println(hitAvg.get(i));
		}
	}
	public void defenceLine() {
		ArrayList<Human> defAvg = new ArrayList<Human> ();
		for(int i=0;i<playerList.size();i++) {
			Human temp = playerList.get(i);
			if(temp instanceof Pitcher) {
				defAvg.add(temp);
			}
		}
		
		for(int i=0;i<defAvg.size()-1;i++) {
			for(int j=i+1;j<defAvg.size();j++) {
				if(((Pitcher)defAvg.get(i)).getDefence()>((Pitcher)defAvg.get(j)).getDefence()) {
					Human temp = defAvg.get(i);
					defAvg.set(i,defAvg.get(j));
					defAvg.set(j, temp);
				}
			}
		}
		for(int i=0;i<defAvg.size();i++) {
			System.out.println(defAvg.get(i));
		}
	}
	
	public void insert() {
		
		System.out.println("선수 타입 선택");
		System.out.println("1. 타자	2. 투수");
		System.out.println(">>> ");
		this.type = scanner.nextInt();
		if(this.type == 1) {
			Human temp = setHuman(type);
			playerList.put(temp.getNumber(), temp);
		}
		else {
			Human temp = setHuman(type);
			playerList.put(temp.getNumber(), temp);
		}
		file.fileWrite(playerList);
	}
	
	public void delete() {
		System.out.println("삭제할 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		int deleteIndex = search(playerNumber);
		if(deleteIndex==-1) {
			System.out.println(playerNumber + "번 선수는 없습니다.");
		}
		else {
			playerList.remove(deleteIndex);
			System.out.println(playerNumber + "번 선수를 삭제하였습니다.");
		}
	}
	
	public void select() {
		int i=0;
		System.out.println("찾고 싶은 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		int selectNum = search(playerNumber);
		if(selectNum==-1) {
			System.out.println(playerNumber + "번 선수는 없습니다.");
		}
		else {
			System.out.println(playerList.get(selectNum));
		}
	}
	
	public void update() {
		int i=0;
		System.out.println("수정할 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		int updateNum = search(playerNumber);
		if(updateNum==-1) {
			System.out.println(playerNumber + "번 선수는 없습니다.");
		}
		else {
			if(playerList.get(updateNum).getType().equals("타자")) {
				Human temp = setHuman(1);
				playerList.put((Integer)updateNum, temp);
			}
			else {
				Human temp = setHuman(2);
				playerList.put((Integer)updateNum, temp);
			}
		}
	}

	public void allPrint() {
		Iterator<Integer> key = playerList.keySet().iterator();
		while(key.hasNext()) {
			Integer _key = key.next();
			Human _value = playerList.get(_key);
			System.out.println(_value);
		}
	}
	
	public void allClear() {
		Iterator<Integer> key = playerList.keySet().iterator();
		while(key.hasNext()) {
			Integer _key = key.next();
			playerList.remove(_key);
		}
		//file.fileWriteWithDelete(playerList);
	}
	
	public int search(int number) {
		Integer findNum = -1;
		if(playerList.containsKey((Integer)number)) {
			findNum = playerList.get(number).getNumber();
		}			
		return (int)findNum;
	}
	/*
	public int searchName(String name) {
		int findName = -1;
		if(playerList.containsValue(name)) {
			
		}
		return findName;
	}
	*/
	
	public Human setHuman(int position) {
		
		Human temp = new Human();
		
		System.out.print("선수 번호 입력 : ");
		int number = scanner.nextInt();
		System.out.print("선수 이름 입력 : ");
		String name = scanner.next();
		System.out.print("선수 나이 입력 : ");
		int age = scanner.nextInt();
		System.out.print("선수 키 입력 : ");
		double height = scanner.nextDouble();
		
		if(position == 1) {
			System.out.print("선수 타수 입력 : ");
			int batCount = scanner.nextInt();
			System.out.print("선수 안타 수 입력 : ");
			int hit = scanner.nextInt();
			System.out.print("선수 타율 입력 : ");
			double hitAvg = scanner.nextDouble();
			
			temp = new Batter("타자", number, name, age, height, batCount, hit, hitAvg);
		}
		else if(position == 2){
			System.out.print("선수 승 입력 : ");
			int win = scanner.nextInt();
			System.out.print("선수 패 입력 : ");
			int lose = scanner.nextInt();
			System.out.print("선수 방어율 입력 : ");
			double defence = scanner.nextDouble();
			
			temp = new Pitcher("투수", number, name, age, height, win, lose, defence);
		}
		return temp;
	}
}