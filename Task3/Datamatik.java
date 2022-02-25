class Datamatik{
	public static void main(String[] args){
		Teacher teacher = new Teacher("Hans", 47, false);
		Student student = new Student("William", 21, false, false);
		Student student = new Student("Emil", 21, false, false);

		System.out.println(teacher.name());
		System.out.println(student.name());
	} 
}