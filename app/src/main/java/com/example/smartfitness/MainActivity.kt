package com.example.smartfitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.smartfitness.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingclass : ActivityMainBinding
    var ofp = OFP()

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingclass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingclass.root)
        Log.d("MyLogMAct", "onCreate")                                              // проверка создания активити через логи

    }

    fun onClickOfp(view: View){
        bindingclass.llOfp.visibility = View.VISIBLE
        bindingclass.swTrain.visibility = View.INVISIBLE
    }

    fun onClickResult(view: View){                                                          //здесь происходит выбор уровня подготовки на основе польз. данных и ->
        val push = bindingclass.etPush.text.toString().toInt()                              //присвоение текста в textview для вывода данных юзеру
        val pull = bindingclass.etPull.text.toString().toInt()
        val squad = bindingclass.etSquad.text.toString().toInt()
        val abc = bindingclass.etAbc.text.toString().toInt()
        val exten = bindingclass.etExten.text.toString().toInt()

        val pushT = resources.getQuantityString(R.plurals.push, push, push)
        val pullT = resources.getQuantityString(R.plurals.pull, pull, pull)
        val squatT = resources.getQuantityString(R.plurals.squat, squad,squad)
        val abcT = resources.getQuantityString(R.plurals.abc, abc, abc)
        val extenT = resources.getQuantityString(R.plurals.exten, exten,exten)


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
        bindingclass.swTrain.visibility = View.VISIBLE
        }
}


