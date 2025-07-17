package test4.sub5;

public class Student {
	private String name;
	private String studentId;
	private int[] scores;
	private int subjectCount;
	private Subject[] subjects;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
		this.subjectCount = 0;
	}
	
	public void enrollSubject(Subject subject) {
		subjects[subjectCount] = subject; //Subject클래스 배열인 subject에 인자로 들어온 subject를 추가시킴. 
		subject.addStudent(this); //subject의 addStudent에 현재 이 클래스(Student)정보를 주는거
		scores[subjectCount++] = 0; //scores배열 인덱스 값을 앞선 subject배열과 같은 subjectCount을 주고 ++을 함으로써 다음 입력이 들어오면 인덱스가 다음 공간을 가리키게 됨
		
		System.out.println(name + " - " + subject.getSubName() + " 과목 신청 완료");
	}
	
	public void setScore(Subject subject, int score) {
		for(int i=0;i<subjectCount;i++) { //현재 배열의 전체 데이터 크기 만큼(모든 데이터 조회)
			if(subjects[i]==subject) { //배열원소의 subject와 입력된 subject가 같으면
				scores[i] = score; //그 subject의 scores를 입력으로 들어온 scores로 하겠다.
				System.out.println(name + " - " + subject.getSubName() + " 점수 입력 완료");
			}
		}
	}
	
	public void printStudentInfo() {
		System.out.println("이름 : "+this.name);
		System.out.println("아이디 : "+this.studentId);
		System.out.println("성적");
		for(int i=0; i<subjectCount;i++) { //subjects의 모든 데이터
			System.out.println(" - "+subjects[i].getSubName()+" : "+scores[i]); //subjects의 subName 불러오기
		}
	}
	
	public String getName() {
		return name;
	}
	
}
