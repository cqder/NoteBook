package cn.ts.notebook.entity;

public class MyDirt {
    int id;
    String key;
    String value;

    @Override
    public String toString() {
        return "MyDirt{" +
                "id=" + id +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;
}
