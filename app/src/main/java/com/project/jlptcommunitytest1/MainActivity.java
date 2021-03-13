/*
*   MainActivity
*   activity_main.xml 을 담당하는 자바 소스코드
*   사용자가 로그인 과정을 거치고 난 이후에 보여지는 홈 화면에서 동작을 담당
*   상단 부분의 로그인한 유저의 이름을 클릭 할 경우 개인 공부 이력 및 경쟁전 점수를 조회가 가능하도록 설정
*   하단 부분은 개인 단어 암기, 단어 경쟁전, 일본어 커뮤니티, 설정 항목들이 존재함
*   하단 부분의 경우도 클릭 할 경우 각 항목별로 넘어가도록 설정
* */
package com.project.jlptcommunitytest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    //[하단 부분의 각 항목들의 클릭리스너]
    public void personalStudy(View v) {

        //현재 엑티비티(MainActivity)에서 StudyLevelSelectActivity로 넘어가는 작업
        Intent intent = new Intent(this, StudyLevelSelectActivity.class);
        startActivity(intent);
    }

    public void competition(View v) {

    }

    public void community(View v) {

    }

    public void setting(View v) {

    }
    //[하단 부분의 각 항목들의 클릭리스너 종료지점]
}