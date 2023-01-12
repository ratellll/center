package sup.center.Member;

public class Member {
    private Long id;
    private String name;
    private Long size;
    private Long price;

    public Member(Long id, String name, Grade grade) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
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

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    private Grade grade;

}
