package test4.sub5;

public class Subject {
	private String subName;
	private Student[] students;
	private int studentCount;
	
	public Subject(String subName) {
		this.subName = subName;
		this.students = new Student[10];
		this.studentCount = 0;
	}
	
	public void addStudent(Student std) {
		students[studentCount++] = std; //인자로 받은 Student클래스의 정보를 students에 저장하고 studentCount을 인덱스로 ++시켜 다음 입력이 들어오면 다음 공간을 가리키게  
	}
	
	public void printSubjectInfo() {
		System.out.println("과목 : "+subName);
		System.out.print("수강생 : ");
		for(int i =0; i<studentCount; i++) { //students 모든 데이터
			System.out.print(students[i].getName()+", ");//students의 name 불러오기
		}
		System.out.println();
	}
	
	public String getSubName() {
		return subName;
	}
}
