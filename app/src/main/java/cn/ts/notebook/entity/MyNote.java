package cn.ts.notebook.entity;

/**
 * 便签
 */
public class MyNote {

    int id;
    String title;
    String notes;
    int type;
    long time;
    boolean is_private;
    boolean is_top;

    @Override
    public String toString() {
        return "MyNote{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", notes='" + notes + '\'' +
                ", type=" + type +
                ", time=" + time +
                ", is_private=" + is_private +
                ", is_top=" + is_top +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isIs_private() {
        return is_private;
    }

    public void setIs_private(boolean is_private) {
        this.is_private = is_private;
    }

    public boolean isIs_top() {
        return is_top;
    }

    public void setIs_top(boolean is_top) {
        this.is_top = is_top;
    }
}
