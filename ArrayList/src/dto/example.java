package dto;

import java.util.ArrayList;

class Member{
    private int number;
    private String name;
    private String team;
    public Member(int number, String name, String team){
        this.number = number;
        this.name = name;
        this.team = team;
    }
    public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Member [number=" + number +", name=" + name + ", team=" + team + "]";
	}
}
public class example{
    public static void main(String[] args){
        ArrayList<Member> memberList = new ArrayList<Member>();
        Member mem1 = new Member(1,"루피","밀짚모자");
        memberList.add(mem1);
        memberList.add(new Member(3,"쵸파","밀짚모자"));
        memberList.add(1,new Member(2,"에이스","흰수염"));

        for(Member mem : memberList) {
			System.out.println(mem.toString());
		}
        
        String findName;
        int findInt = -1;
        
        for(int i=0;i<memberList.size();i++) {
        	Member mem = memberList.get(i);
        	if(mem.getName().equals("에이스")) {
        		findInt = i;
        		break;
        	}
        }
        memberList.set(findInt, new Member(5,"버기","??"));
        
        ArrayList<Member> findList = new ArrayList<Member>();
        for(int i=0;i<memberList.size();i++) {
        	Member mem = memberList.get(i);
        	if(mem.getTeam().equals("밀짚모자")) {
        		findList.add(mem);
        	}
        }
        for(Member mem : findList) {
        	System.out.println(mem.toString());
        }
        memberList.remove(1);
        for(Member mem : memberList) {
        	System.out.println(mem.toString());
        }
    }
}