package DAO;
import java.util.Scanner;
import AboutFile.*;
import DTO.*;

//DAO:Data Access Object = model = back end
public class MemberDao {
	// 데이터 담을 배열 필요
	Scanner scanner = new Scanner(System.in);
	
	private int type;
	Human player[] = new Human[0];
	AboutFile file = new AboutFile();
	
	/*
	Human human[]; < 변수 선언
	human = new Human(); < 객체 생성
	human = new Human[20]; < 변수 20개 생성
	 */
	
	public MemberDao() {
		player = file.fileLoad(player);
		/*
		player = new Human[8];
		player[0] = new Batter("타자",101,"주홍",25,188.0,30,20,0.33);
		player[1] = new Pitcher("투수",201,"경호",27,187.3,6,5,4.3);
		player[2] = new Pitcher("투수",202,"도흠",26,182.1,7,2,6.6);
		player[3] = new Batter("타자",102,"상우",27,179.5,25,17,0.38);
		player[4] = new Batter("타자",103,"성환",23,181.8,22,19,0.39);
		player[5] = new Pitcher("투수",203,"현식",29,177.7,10,1,9.0);
		player[6] = new Batter("타자",104,"김밥",30,182.6,40,10,0.23);
		player[7] = new Pitcher("투수",204,"돌돌",19,183.4,3,4,3.3);
		*/
	}
	
	public void swap(Human[] arr,int a, int b) {
		Human temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public void hitAvgLine() {
		int count = 0;
		int tempCount = 0;
		for(int i=0;i<player.length;i++) {
			if(player[i] instanceof Batter) {
				 count++;
			}
		}
		
		Human temp[] = new Human[count];
		for(int i=0;i<player.length;i++) {
			if(player[i] instanceof Batter) {
				temp[tempCount] = player[i];
				tempCount++;
			}
		}		
		for(int i = 0;i<temp.length-1;i++) {
			for(int j = i+1;j<temp.length;j++) {
				
				if(((Batter)temp[i]).getHitAvg()<((Batter)temp[j]).getHitAvg()) swap(temp,i,j);
			}
		}
		
		for(int i=0;i<4;i++) {
			System.out.println(temp[i].toString());
		}
	}
	public void defenceLine() {
		int count = 0;
		int tempCount = 0;
		for(int i=0;i<player.length;i++) {
			if(player[i] instanceof Pitcher) {
				 count++;
			}
		}
		Human temp[] = new Human[count];
		for(int i=0;i<player.length;i++) {
			if(player[i] instanceof Pitcher) {
				temp[tempCount] = player[i];
				tempCount++;
			}
		}
		for(int i = 0;i<temp.length-1;i++) {
			for(int j = i+1;j<temp.length;j++) {
				if(((Pitcher)temp[i]).getDefence()>((Pitcher)temp[j]).getDefence()) swap(temp,i,j);
			}
		}
		for(int i=0;i<4;i++) {
			System.out.println(temp[i].toString());
		}
	}
	
	public void insert() {
		int length = player.length+1;
		Human[] temp = new Human[length];
		for(int i = 0;i<length-1;i++) {
			temp[i] = player[i];
		}
		
		System.out.println("선수 타입 선택");
		System.out.println("1. 타자	2. 투수");
		System.out.println(">>> ");
		this.type = scanner.nextInt();
		if(this.type == 1) {
			temp[length-1] = setHuman(temp[length-1],type);
		}
		else {
			temp[length-1] = setHuman(temp[length-1],type);
		}
		player = temp;
		file.fileWrite(player);
	}
	
	public void delete() {
		int length = player.length;
		Human[] temp = new Human[length-1];
		int i=0;
		System.out.println("삭제할 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		if(player.length==0) System.out.println("현재 선수가 아무도 없습니다.");
		else i = search(playerNumber);

		if(i==-1)System.out.println(playerNumber + "번 선수는 없습니다.");
		else {
			for(int j = 0;j<i;j++) {
				temp[j] = player[j];
			}
			for(int j=i;j<length-1;j++) {
				temp[j] = player[j+1];
			}
			player = temp;
			file.fileWriteWithDelete(player);
			System.out.println(playerNumber+"번 선수가 삭제되었습니다.");
		}
	}
	
	public void select() {
		int i=0;
		System.out.println("찾고 싶은 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		if(player.length==0) System.out.println("현재 선수가 아무도 없습니다.");
		else i =search(playerNumber);
		if(i==-1)System.out.println(playerNumber + "번 선수는 없습니다.");	
		else System.out.println(((Human)player[i]).toString());
	}
	
	public void update() {
		int i=0;
		System.out.println("수정할 선수의 번호를 입력하세요.");
		System.out.println(">>> ");
		int playerNumber = scanner.nextInt();
		if(player.length==0) System.out.println("현재 선수가 아무도 없습니다.");
		else i =search(playerNumber);
		
		if(i==-1)System.out.println(playerNumber + "번 선수는 없습니다.");
		else {
			if(player[i] instanceof Batter) player[i] = setHuman(player[i],1);
			else player[i] = setHuman(player[i],2);
			System.out.println(i+"번 선수의 정보를 변경하였습니다.");
		}
	}

	public void allPrint() {
		for(int i=0;i<player.length;i++) {
			System.out.println(player[i].toString());
		}
	}
	
	public void allClear() {
		player = new Human[0];
		file.fileWriteWithDelete(player);
	}
	
	public int search(int number) {
		int i = 0;
		boolean check = true;
		for(i=0;i<player.length;i++) {
			if(number==player[i].getNumber()) {
				check = false;
				break;
			}
		}
		if (check) i = -1;
		return i;
	}
	public int searchName(String name) {
		int i=0;
		boolean check = true;
		for(i=0;i<player.length;i++) {
			if(player[i].getName().equals(name)) {
				check = false;
				break;
			}
		}
		if(check) i=-1;
		return i;
	}
	
	public Human setHuman(Human human, int position) {
		
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
			
			human = new Batter("타자", number, name, age, height, batCount, hit, hitAvg);
		}
		else if(position == 2){
			System.out.print("선수 승 입력 : ");
			int win = scanner.nextInt();
			System.out.print("선수 패 입력 : ");
			int lose = scanner.nextInt();
			System.out.print("선수 방어율 입력 : ");
			double defence = scanner.nextDouble();
			
			human = new Pitcher("투수", number, name, age, height, win, lose, defence);
		}
		return human;
	}
}