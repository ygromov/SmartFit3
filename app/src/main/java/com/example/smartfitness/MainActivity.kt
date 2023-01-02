package com.example.smartfitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.smartfitness.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingclass : ActivityMainBinding
    var ofp = OFP()

    var push = 0                              //присвоение текста в textview для вывода данных юзеру
    var pull = 0
    var squad = 0
    var abc = 0
    var exten = 0

    var pushT = ""
    var pullT = ""
    var squatT = ""
    var abcT = ""
    var extenT = ""

    var pushT2 = ""
    var pullT2 = ""
    var squatT2 = ""
    var abcT2 = ""
    var extenT2 = ""

    var pushT3 = ""
    var pullT3 = ""
    var squatT3 = ""
    var abcT3 = ""
    var extenT3 = ""

    var pushT4 = ""
    var pullT4 = ""
    var squatT4 = ""
    var abcT4 = ""
    var extenT4 = ""

    var pushT5 = ""
    var pullT5 = ""
    var squatT5 = ""
    var abcT5 = ""
    var extenT5 = ""

    var pushT6 = ""
    var pullT6 = ""
    var squatT6 = ""
    var abcT6 = ""
    var extenT6 = ""

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingclass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingclass.root)
        Log.d("MyLogMAct", "onCreate")                                              // проверка создания активити через логи

    }

    fun onClickOfp(view: View){
//        bindingclass.llOfp.visibility = View.VISIBLE
//        bindingclass.swTrain.visibility = View.INVISIBLE
    }

    fun onClickResult(view: View){                                                          //здесь происходит выбор уровня подготовки на основе польз. данных и ->
         push = bindingclass.etPush.text.toString().toInt()                              //присвоение текста в textview для вывода данных юзеру
         pull = bindingclass.etPull.text.toString().toInt()
         squad = bindingclass.etSquad.text.toString().toInt()
         abc = bindingclass.etAbc.text.toString().toInt()
         exten = bindingclass.etExten.text.toString().toInt()

         pushT = resources.getQuantityString(R.plurals.push, push, push)
         pullT = resources.getQuantityString(R.plurals.pull, pull, pull)
         squatT = resources.getQuantityString(R.plurals.squat, squad,squad)
         abcT = resources.getQuantityString(R.plurals.abc, abc, abc)
         extenT = resources.getQuantityString(R.plurals.exten, exten,exten)


            // поменять на switch перебор
        if(push<Constance.onepush || pull<Constance.onepull || squad<Constance.onesquat || abc<Constance.oneabc || exten<Constance.oneexten) {
            val result = ofp.onelevel(push, pull, squad, abc, exten)                        //в результ возвращается значение из OFP
            if (result == 1) {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)

            }                                                                                           //делай все
            else if (result == 2) {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }
            else if (result == 3) {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }
            else if (result == 4) {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }
            else if (result == 5)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }
            else if (result == 6) {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                                           //("делай отжимания")
            else if (result == 7)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                                                  //("делай спину и пресс")
            else if (result == 8) {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                                              //("делай экстензию и подтягивания")
            else if (result == 9)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                                           //("делай экстензию и приседания")
            else if (result == 10) {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                                           //("делай приседания и пресс")
            else if (result == 11)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                                             //("делай отжимания и экстензию")
            else if (result == 12)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                          //("делай отжимания и приседания")
            else if (result == 13)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }
            else if (result == 14)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }
            else if (result == 15)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }
            else if (result == 16)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }
            else if (result == 17)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }
            else if (result == 18)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }
            else if (result == 19)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }
            else if (result == 20)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                           //("делай подтягивания приседания и пресс")
            else if (result == 21) {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                          //("делай отжимания пресс и экстензия")
            else if (result == 22)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                               //("делай отжимания приседания и экстензия")
            else if (result == 23)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                                  //("делай отжимания приседания пресс")
            else if (result == 24)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                                //("делай отжимания подтягивания и экстензия")
            else if (result == 25)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                                //("делай отжимания подтягивнаия и пресс")
            else if (result == 26) {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                                       //("делай отжимания подтягивания и приседания")
            else if (result == 27)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                                 //("делай отжимания поджтягивания приседания и пресс")
            else if (result == 28)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                                //("делай отжимания подтягивания приседания и экстензия")
            else if (result == 29) {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                           //("делай отжимания подтягивания пресс и экстензия")
            else if (result == 30)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                                //("делай отжимания приседания пресс и экстензия")
            else if (result == 31)  {
                bindingclass.tvTrain.setText(R.string.Train_name1)
                bindingclass.tvPushup.setText(pushT)
                bindingclass.tvPull.setText(pullT)
                bindingclass.tvSquat.setText(squatT)
                bindingclass.tvAbc.setText(abcT)
                bindingclass.tvExten.setText(extenT)//делай  экснетзию
            }                               //("делай подтягивания приседания пресс и кстензия")
            else  bindingclass.tvTrain.setText("что то пошло не так")
        }
        else {
            ofp.twolevel(push, pull, squad, abc, exten)
            bindingclass.tvTrain.setText("Мощные результаты! Жди обновления для второго уроня подготовки!")
        }
        bindingclass.llOfp.visibility = View.INVISIBLE
        bindingclass.llWorkoutProgrammm.visibility = View.VISIBLE
//        bindingclass.swTrain.visibility = View.VISIBLE
        }

    fun first_onClick (view: View){
        bindingclass.swTrain.visibility = View.VISIBLE
        bindingclass.llWorkoutProgrammm.visibility = View.INVISIBLE

    }
    fun two_onClick (view: View){
        bindingclass.swTrain.visibility = View.VISIBLE
        bindingclass.llWorkoutProgrammm.visibility = View.INVISIBLE
        push+=1
        pull+=1
        squad+=2
        abc+=2
        exten+=2
        pushT2 = resources.getQuantityString(R.plurals.push, push, push)
        pullT2 = resources.getQuantityString(R.plurals.pull, pull, pull)
        squatT2 = resources.getQuantityString(R.plurals.squat, squad,squad)
        abcT2 = resources.getQuantityString(R.plurals.abc, abc, abc)
        extenT2 = resources.getQuantityString(R.plurals.exten, exten,exten)
        bindingclass.tvPushup.setText(pushT2)
        bindingclass.tvPull.setText(pullT2)
        bindingclass.tvSquat.setText(squatT2)
        bindingclass.tvAbc.setText(abcT2)
        bindingclass.tvExten.setText(extenT2)

    }
    fun three_onClick (view: View){
        bindingclass.swTrain.visibility = View.VISIBLE
        bindingclass.llWorkoutProgrammm.visibility = View.INVISIBLE
        push+=2
        pull+=2
        squad+=4
        abc+=4
        exten+=4
        pushT3 = resources.getQuantityString(R.plurals.push, push, push)
        pullT3 = resources.getQuantityString(R.plurals.pull, pull, pull)
        squatT3 = resources.getQuantityString(R.plurals.squat, squad,squad)
        abcT3 = resources.getQuantityString(R.plurals.abc, abc, abc)
        extenT3 = resources.getQuantityString(R.plurals.exten, exten,exten)
        bindingclass.tvPushup.setText(pushT3)
        bindingclass.tvPull.setText(pullT3)
        bindingclass.tvSquat.setText(squatT3)
        bindingclass.tvAbc.setText(abcT3)
        bindingclass.tvExten.setText(extenT3)

    }
    fun four_onClick (view: View){
        bindingclass.swTrain.visibility = View.VISIBLE
        bindingclass.llWorkoutProgrammm.visibility = View.INVISIBLE
        push+=3
        pull+=3
        squad+=5
        abc+=5
        exten+=5
        pushT4 = resources.getQuantityString(R.plurals.push, push, push)
        pullT4 = resources.getQuantityString(R.plurals.pull, pull, pull)
        squatT4 = resources.getQuantityString(R.plurals.squat, squad,squad)
        abcT4 = resources.getQuantityString(R.plurals.abc, abc, abc)
        extenT4 = resources.getQuantityString(R.plurals.exten, exten,exten)
        bindingclass.tvPushup.setText(pushT4)
        bindingclass.tvPull.setText(pullT4)
        bindingclass.tvSquat.setText(squatT4)
        bindingclass.tvAbc.setText(abcT4)
        bindingclass.tvExten.setText(extenT4)
    }
    fun five_onClick (view: View){
        bindingclass.swTrain.visibility = View.VISIBLE
        bindingclass.llWorkoutProgrammm.visibility = View.INVISIBLE
        push+=3
        pull+=3
        squad+=6
        abc+=6
        exten+=6
        pushT5 = resources.getQuantityString(R.plurals.push, push, push)
        pullT5 = resources.getQuantityString(R.plurals.pull, pull, pull)
        squatT5 = resources.getQuantityString(R.plurals.squat, squad,squad)
        abcT5 = resources.getQuantityString(R.plurals.abc, abc, abc)
        extenT5 = resources.getQuantityString(R.plurals.exten, exten,exten)
        bindingclass.tvPushup.setText(pushT5)
        bindingclass.tvPull.setText(pullT5)
        bindingclass.tvSquat.setText(squatT5)
        bindingclass.tvAbc.setText(abcT5)
        bindingclass.tvExten.setText(extenT5)
    }
    fun six_onClick (view: View){
        bindingclass.swTrain.visibility = View.VISIBLE
        bindingclass.llWorkoutProgrammm.visibility = View.INVISIBLE
        push+=5
        pull+=3
        squad+=7
        abc+=8
        exten+=8
        pushT6 = resources.getQuantityString(R.plurals.push, push, push)
        pullT6 = resources.getQuantityString(R.plurals.pull, pull, pull)
        squatT6 = resources.getQuantityString(R.plurals.squat, squad,squad)
        abcT6 = resources.getQuantityString(R.plurals.abc, abc, abc)
        extenT6 = resources.getQuantityString(R.plurals.exten, exten,exten)
        bindingclass.tvPushup.setText(pushT6)
        bindingclass.tvPull.setText(pullT6)
        bindingclass.tvSquat.setText(squatT6)
        bindingclass.tvAbc.setText(abcT6)
        bindingclass.tvExten.setText(extenT6)
    }
    fun b_sw_train_done_onClick (view: View){
        bindingclass.swTrain.visibility = View.INVISIBLE
        bindingclass.llWorkoutProgrammm.visibility = View.VISIBLE

    }
}


