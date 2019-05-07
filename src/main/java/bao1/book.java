package bao1;

/**
 * @Title book
 * @Description
 * @Copyright: 版权所有 (c) 2018 - 2019
 * @Company: 电子商务中心
 * @Author lyx
 * @Version 1.0.0
 * @Create 2018\10\25 0025 15:44
 */
public class book {
    private int id;
    private String bname;

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", bname='" + bname + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
}
