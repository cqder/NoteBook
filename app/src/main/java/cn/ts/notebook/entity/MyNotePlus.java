package cn.ts.notebook.entity;

/**
 * 便签的扩展
 */
public class MyNotePlus {
    int notes_id;
    String notes;

    @Override
    public String toString() {
        return "MyNotePlus{" +
                "notes_id=" + notes_id +
                ", notes='" + notes + '\'' +
                '}';
    }

    public int getNotes_id() {
        return notes_id;
    }

    public void setNotes_id(int notes_id) {
        this.notes_id = notes_id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
