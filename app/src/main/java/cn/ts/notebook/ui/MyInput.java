package cn.ts.notebook.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.Gravity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressLint("ViewConstructor")
public class MyInput extends LinearLayout {

    public static int INPUT_TYPE_NONE = 0;
    public static int INPUT_TYPE_LIST = 1;
    public static int INPUT_TYPE_CHECK = 2;

    private int inputType = 0;

    //文本框
    private EditText editText;
    //图片框、视频框
    private ImageButton imageButton;
    //音频框
    private Button button;
    //开头的控件（黑点或者勾选框）
    private String point = "·";
    private TextView listPoint;
    private CheckBox checkBox;


    public MyInput(Context context, int type) {
        super(context);

        this.setOrientation(HORIZONTAL);
//        this.setGravity(Gravity.CENTER);

        inputType = type;
        editText = new EditText(context);
//        LayoutParams layoutParams = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//        editText.setLayoutParams(layoutParams);
        checkBox = new CheckBox(context);
        checkBox.setGravity(Gravity.CENTER);
        this.addView(checkBox);
        this.addView(editText);
    }

    // TODO: 2019/12/24 以Json字符串格式返回该输入中所有的数据
    @Override
    public String toString() {

        InputObject inputObject =new InputObject();
        inputObject.setAudioPath("11");
        inputObject.setInputType(inputType);
        inputObject.setPicturePath("22");
        inputObject.setVideoPath("33");
        inputObject.setChecked(checkBox.isChecked());
        inputObject.setText(editText.getText().toString());

        return inputObject.toString();
    }


    class InputObject{
        int inputType;
        String text;
        boolean isChecked;
        String audioPath;
        String videoPath;
        String picturePath;

        @Override
        public String toString() {
            return "'InputObject':{" +
                    "'inputType':" + inputType +
                    ", 'text':'" + text + '\'' +
                    ", 'isChecked':" + isChecked +
                    ", 'audioPath':'" + audioPath + '\'' +
                    ", 'videoPath':'" + videoPath + '\'' +
                    ", 'picturePath':'" + picturePath + '\'' +
                    '}';
        }

        public int getInputType() {
            return inputType;
        }

        void setInputType(int inputType) {
            this.inputType = inputType;
        }

        public String getText() {
            return text;
        }

        void setText(String text) {
            this.text = text;
        }

        public boolean isChecked() {
            return isChecked;
        }

        void setChecked(boolean checked) {
            isChecked = checked;
        }

        public String getAudioPath() {
            return audioPath;
        }

        void setAudioPath(String audioPath) {
            this.audioPath = audioPath;
        }

        public String getVideoPath() {
            return videoPath;
        }

        void setVideoPath(String videoPath) {
            this.videoPath = videoPath;
        }

        public String getPicturePath() {
            return picturePath;
        }

        void setPicturePath(String picturePath) {
            this.picturePath = picturePath;
        }
    }

}
