package cn.ts.notebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import cn.ts.notebook.db.DBManager;
import cn.ts.notebook.entity.MyAnniversary;
import cn.ts.notebook.entity.MyDirt;
import cn.ts.notebook.entity.MyNote;
import cn.ts.notebook.entity.MyNotePlus;

public class MainActivity extends AppCompatActivity {

    Context myContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myContext = this;
        //得到是否是安装过本软件
        SharedPreferences preferences = myContext.getSharedPreferences("ts", MODE_PRIVATE);
        boolean isInstall = preferences.getBoolean("is_install", false);

        if (!isInstall) {
            //未安装过本软件
            initDatabase();
            preferences.edit().putBoolean("is_install", true).apply();
        }
    }

    /**
     * 初始化数据库
     */
    void initDatabase(){
        //建立数据表
        List<Class> classList = new ArrayList<>();
        classList.add(MyAnniversary.class);
        classList.add(MyDirt.class);
        classList.add(MyNote.class);
        classList.add(MyNotePlus.class);
        new DBManager(myContext, classList);
    }
}
