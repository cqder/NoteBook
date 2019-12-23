package cn.ts.notebook.entity;

/**
 * 纪念日
 */
public class MyAnniversary {

    int id;
    String date;
    long time;
    String describe;

    @Override
    public String toString() {
        return "MyAnniversary{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", time=" + time +
                ", describe='" + describe + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
