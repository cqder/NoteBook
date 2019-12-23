package cn.ts.notebook.activity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import cn.ts.notebook.R;
import cn.ts.notebook.ui.MyInput;

/**
 * 便签详情页面，新建便签时数据为空，查看便签时填充数据
 */
public class NoteDetailActivity extends AppCompatActivity {

    ScrollView scrollView;
    Context myContext;
    MyInput myInput;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_note_detail);
        scrollView = findViewById(R.id.sl_note_detail_notes);
        myContext = this;

        initScrollView();
    }

    /**
     * todo 初始化 ScrollView
     */
    private void initScrollView(){
        //添加一行空输入
        myInput = new MyInput(myContext,0);
        scrollView.addView(myInput);
    }

    // TODO: 2019/12/24 Activity运行在后台时，自动保存当前数据
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(myContext,"OnPause",Toast.LENGTH_SHORT).show();
    }

    /**
     * todo 加载便签数据
     *
     * @param noteID 便签的ID
     */
    public static void loadNote(int noteID) {

    }



    public void save(View view) {
        String result = myInput.toString();
        Log.w("ts","得到的输入为："+result);
    }
}
