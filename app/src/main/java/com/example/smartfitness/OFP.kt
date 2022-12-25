package com.example.smartfitness

class OFP {


    fun onelevel(push : Int, pull: Int, squad:Int, abc:Int, exten:Int): Int{ //testt
        if(push<Constance.onepush && pull<Constance.onepull && squad<Constance.onesquat && abc<Constance.oneabc && exten<Constance.oneexten) return 1 // делай все
        else if (push>Constance.onepush && pull>Constance.onepull && squad>Constance.onesquat && abc>Constance.oneabc && exten<Constance.oneexten) return 2 //спина отстает
        else if (push>Constance.onepush && pull>Constance.onepull && squad>Constance.onesquat && abc<Constance.oneabc && exten>Constance.oneexten) return 3 //прес отстает
        else if (push>Constance.onepush && pull>Constance.onepull && squad<Constance.onesquat && abc>Constance.oneabc && exten>Constance.oneexten) return 4 //присед отстает
        else if (push>Constance.onepush && pull<Constance.onepull && squad>Constance.onesquat && abc>Constance.oneabc && exten>Constance.oneexten) return 5 //подтягивания отстает
        else if (push<Constance.onepush && pull>Constance.onepull && squad>Constance.onesquat && abc>Constance.oneabc && exten>Constance.oneexten) return 6 //отжимания отстает

        else if (push>Constance.onepush && pull>Constance.onepull && squad>Constance.onesquat && abc<Constance.oneabc && exten<Constance.oneexten) return  7// спина и пресс отстают
        else if (push>Constance.onepush && pull<Constance.onepull && squad>Constance.onesquat && abc>Constance.oneabc && exten<Constance.oneexten) return  8// спина подтяг
        else if (push>Constance.onepush && pull>Constance.onepull && squad<Constance.onesquat && abc>Constance.oneabc && exten<Constance.oneexten) return  9//спина присед
        else if (push>Constance.onepush && pull>Constance.onepull && squad<Constance.onesquat && abc<Constance.oneabc && exten>Constance.oneexten) return  10//присед пресс
        else if (push<Constance.onepush && pull>Constance.onepull && squad>Constance.onesquat && abc>Constance.oneabc && exten<Constance.oneexten) return  11//отжим спина
        else if (push<Constance.onepush && pull>Constance.onepull && squad<Constance.onesquat && abc>Constance.oneabc && exten>Constance.oneexten) return  12//отжим присед
        else if (push<Constance.onepush && pull<Constance.onepull && squad>Constance.onesquat && abc>Constance.oneabc && exten>Constance.oneexten) return  13//отжим подтяг
        else if (push>Constance.onepush && pull<Constance.onepull && squad>Constance.onesquat && abc<Constance.oneabc && exten>Constance.oneexten) return  14//подтяг пресс
        else if (push<Constance.onepush && pull>Constance.onepull && squad>Constance.onesquat && abc<Constance.oneabc && exten>Constance.oneexten) return  15//отжим пресс
        else if (push>Constance.onepush && pull<Constance.onepull && squad<Constance.onesquat && abc>Constance.oneabc && exten>Constance.oneexten) return  16//подтяг присед

        else if (push>Constance.onepush && pull>Constance.onepull && squad<Constance.onesquat && abc<Constance.oneabc && exten<Constance.oneexten) return  17//присед пресс спина
        else if (push>Constance.onepush && pull<Constance.onepull && squad>Constance.onesquat && abc<Constance.oneabc && exten<Constance.oneexten) return  18//подтяг прес спина
        else if (push>Constance.onepush && pull<Constance.onepull && squad<Constance.onesquat && abc>Constance.oneabc && exten<Constance.oneexten) return  19//подтяг присед спина
        else if (push>Constance.onepush && pull<Constance.onepull && squad<Constance.onesquat && abc<Constance.oneabc && exten>Constance.oneexten) return  20//плжтяг присед пресс
        else if (push<Constance.onepush && pull>Constance.onepull && squad>Constance.onesquat && abc<Constance.oneabc && exten<Constance.oneexten) return  21//отжим пресс спина
        else if (push<Constance.onepush && pull>Constance.onepull && squad<Constance.onesquat && abc>Constance.oneabc && exten<Constance.oneexten) return  22//отжим присд спина
        else if (push<Constance.onepush && pull>Constance.onepull && squad<Constance.onesquat && abc<Constance.oneabc && exten>Constance.oneexten) return  23//отжим присед пресс
        else if (push<Constance.onepush && pull<Constance.onepull && squad>Constance.onesquat && abc>Constance.oneabc && exten<Constance.oneexten) return  24//отжим подтяг спина
        else if (push<Constance.onepush && pull<Constance.onepull && squad>Constance.onesquat && abc<Constance.oneabc && exten>Constance.oneexten) return  25//отжим подтяг пресс
        else if (push<Constance.onepush && pull<Constance.onepull && squad<Constance.onesquat && abc>Constance.oneabc && exten>Constance.oneexten) return  26//отжим подтяг присед

        else if (push<Constance.onepush && pull<Constance.onepull && squad<Constance.onesquat && abc<Constance.oneabc && exten>Constance.oneexten) return  27//все кроме спины
        else if (push<Constance.onepush && pull<Constance.onepull && squad<Constance.onesquat && abc>Constance.oneabc && exten<Constance.oneexten) return  28//все кроме пресса
        else if (push<Constance.onepush && pull<Constance.onepull && squad>Constance.onesquat && abc<Constance.oneabc && exten<Constance.oneexten) return  29//все кроме приседа
        else if (push<Constance.onepush && pull>Constance.onepull && squad<Constance.onesquat && abc<Constance.oneabc && exten<Constance.oneexten) return  30//все кроме подтяг
        else if (push>Constance.onepush && pull<Constance.onepull && squad<Constance.onesquat && abc<Constance.oneabc && exten<Constance.oneexten) return  31//все кроме отжим

        return 0
    }

    fun twolevel(push : Int, pull: Int, squad:Int, abc:Int, exten:Int){

    }

}