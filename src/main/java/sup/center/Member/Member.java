package sup.center.Member;

public class Member {
    private Long id;
    private String name;
    private int  size;


    public Member(Long id, String name, int size,Grade grade) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    private Grade grade;

}
