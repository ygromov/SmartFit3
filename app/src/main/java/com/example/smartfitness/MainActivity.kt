package com.example.smartfitness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
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
        var push = bindingclass.etPush.text.toString().toInt()                              //присвоение текста в textview для вывода данных юзеру
        var pull = bindingclass.etPull.text.toString().toInt()
        var squad = bindingclass.etSquad.text.toString().toInt()
        var abc = bindingclass.etAbc.text.toString().toInt()
        var exten = bindingclass.etExten.text.toString().toInt()


            // поменять на switch перебор
        if(push<Constance.onepush || pull<Constance.onepull || squad<Constance.onesquat || abc<Constance.oneabc || exten<Constance.oneexten) {
            var result = ofp.onelevel(push, pull, squad, abc, exten)                        //в результ возвращается значение из OFP
            if (result == 1) {
                bindingclass.tvTrain.setText(R.string.proga1)
                bindingclass.tvPushup.setText(R.string.proga1)
            }                                                                                           //делай все
            else if (result == 2) bindingclass.tvTrain.setText(R.string.block2)                                             //делай  экснетзию
            else if (result == 3) bindingclass.tvTrain.setText(R.string.block3)
            else if (result == 4) bindingclass.tvTrain.setText(R.string.block4)
            else if (result == 5) bindingclass.tvTrain.setText(R.string.block5)
            else if (result == 6) bindingclass.tvTrain.setText(R.string.block6)                                              //("делай отжимания")
            else if (result == 7) bindingclass.tvTrain.setText(R.string.block7)                                                  //("делай спину и пресс")
            else if (result == 8) bindingclass.tvTrain.setText(R.string.block8)                                              //("делай экстензию и подтягивания")
            else if (result == 9) bindingclass.tvTrain.setText(R.string.block9)                                              //("делай экстензию и приседания")
            else if (result == 10) bindingclass.tvTrain.setText(R.string.block10)                                             //("делай приседания и пресс")
            else if (result == 11) bindingclass.tvTrain.setText(R.string.block11)                                             //("делай отжимания и экстензию")
            else if (result == 12) bindingclass.tvTrain.setText(R.string.block12)                          //("делай отжимания и приседания")
            else if (result == 13) bindingclass.tvTrain.setText(R.string.block13)
            else if (result == 14) bindingclass.tvTrain.setText(R.string.block14)
            else if (result == 15) bindingclass.tvTrain.setText(R.string.block15)
            else if (result == 16) bindingclass.tvTrain.setText(R.string.block16)
            else if (result == 17) bindingclass.tvTrain.setText(R.string.block17)
            else if (result == 18) bindingclass.tvTrain.setText(R.string.block18)
            else if (result == 19) bindingclass.tvTrain.setText(R.string.block19)
            else if (result == 20) bindingclass.tvTrain.setText(R.string.block20)                            //("делай подтягивания приседания и пресс")
            else if (result == 21) bindingclass.tvTrain.setText(R.string.block21)                            //("делай отжимания пресс и экстензия")
            else if (result == 22) bindingclass.tvTrain.setText(R.string.block22)                                //("делай отжимания приседания и экстензия")
            else if (result == 23) bindingclass.tvTrain.setText(R.string.block23)                                    //("делай отжимания приседания пресс")
            else if (result == 24) bindingclass.tvTrain.setText(R.string.block24)                                //("делай отжимания подтягивания и экстензия")
            else if (result == 25) bindingclass.tvTrain.setText(R.string.block25)                                    //("делай отжимания подтягивнаия и пресс")
            else if (result == 26) bindingclass.tvTrain.setText(R.string.block26)                                       //("делай отжимания подтягивания и приседания")
            else if (result == 27) bindingclass.tvTrain.setText(R.string.block27)                                    //("делай отжимания поджтягивания приседания и пресс")
            else if (result == 28) bindingclass.tvTrain.setText(R.string.block28)                                //("делай отжимания подтягивания приседания и экстензия")
            else if (result == 29) bindingclass.tvTrain.setText(R.string.block29)                            //("делай отжимания подтягивания пресс и экстензия")
            else if (result == 30) bindingclass.tvTrain.setText(R.string.block30)                                //("делай отжимания приседания пресс и экстензия")
            else if (result == 31) bindingclass.tvTrain.setText(R.string.block31)                                //("делай подтягивания приседания пресс и кстензия")
            else  bindingclass.tvTrain.setText("что то пошло не так")
        }
        else {
            ofp.twolevel(push, pull, squad, abc, exten)
            bindingclass.tvTrain.setText("ты красавчик")
        }
        bindingclass.llOfp.visibility = View.INVISIBLE
        bindingclass.swTrain.visibility = View.VISIBLE
        }
}


