package bao2.entity;

/**
 * @Title person
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\26 0026 11:46
 */
public class person {
    private Integer id;
    private String name;
    private String email;
    private Integer gender;
    private department d;

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", d=" + d +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public department getD() {
        return d;
    }

    public void setD(department d) {
        this.d = d;
    }

    public person() {

    }

    public person(Integer id, String name, String email, Integer gender, department d) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.d = d;
    }
}
